package List;

public class LinkedList<T> implements List<T>{


    private Node<T> head;
    int size;

    public int findSize(){
        Node temp = head;
        int length = 0;
        for(temp = head; temp!=null; temp=temp.getNextNode()){
            length++;
        }
        return length;
    }


    @Override
    public boolean isEmpty() {
        if (findSize() == 0) {
            return true;
        } else return false;
    }

    @Override
    public int size() {
        return findSize();
    }

    @Override
    public void addToFront(T data) {
        head.setNextNode(head);
        head = new Node<T> (data);
    }

    @Override
    public T removeFirst() {
        if (findSize() == 0) {
            head = head.getNextNode();
        }
        return head.getData();
    }
}
