package List;

import java.util.EmptyStackException;

public interface Stack<T> {
    public boolean IsEmpty();
    public void push(T ele);
    public T pop() throws EmptyStackException;
}