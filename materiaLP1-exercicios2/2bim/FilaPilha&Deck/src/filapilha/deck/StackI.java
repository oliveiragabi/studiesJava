package filapilha.deck;

public interface StackI<T> {

    public void push(T element);

    public T pop();

    public T top();

    public int size();

    public boolean isEmpty();
}
