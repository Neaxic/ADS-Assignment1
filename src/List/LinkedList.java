package List;

public class LinkedList<T> implements List<T>{


    private Node<T> head;
    int size = 0;




    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else return false;
    }

    @Override
    public int size() {
        return size();
    }

    @Override
    public void addToFront(T data) {
        Node<T> nHead = new Node<T>(data);
        nHead.setNextNode(head);
        head = nHead;
        size++;

        System.out.println("Linked List size: " + size);
    }

    @Override
    public T removeFirst() {
     /*   T temp = null;
        if (findSize() != 0) {
            temp = head;
            head = head.getNextNode();
        }
        return head.getData();

      */

        T data = head.getData();
        if(head.getNextNode() == null)
        {
            head = null;
}
        else
        {
            head.setData(head.getNextNode().getData());
            head.setNextNode(head.getNextNode().getNextNode());
        }
        size--;
        return data;
    }





    }

