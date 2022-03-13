package List;

public interface List<T> {
    public boolean isEmpty();
    public int size();
    public void addToFront(T data);
    public T removeFirst();
}
