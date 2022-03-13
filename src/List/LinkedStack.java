package List;

import java.util.EmptyStackException;

public class LinkedStack<T> implements Stack<T> {

    private LinkedList<T> list;

    @Override
    public boolean IsEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(T ele) {
        list.addToFront(ele);
    }

    @Override
    public T pop() throws EmptyStackException {
        {
            if (list.isEmpty()) {
                throw new EmptyStackException();
            }
            else {
                list.removeFirst();
            }
        }
        return (T) list;
    }

}
