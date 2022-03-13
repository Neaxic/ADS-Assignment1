package List;

import java.util.EmptyStackException;

public class LinkedStack<T> implements Stack<T> {

    private LinkedList<T> list = new LinkedList<T>();

    @Override
    public boolean IsEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(T element) {
        list.addToFront(element);
    }

    @Override
    public T pop() throws EmptyStackException {
        {
            T tempList;
            if (list.isEmpty()) {
                throw new EmptyStackException();
            }
            else {
                tempList = list.removeFirst();
                System.out.println(tempList);
            }
            return tempList;
        }
    }

}
