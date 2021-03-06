package Stack;

public class ArrayStack<T> implements StackInterface<T>{

    private T[] elements;
    private int t;
    
    public ArrayStack(){
        this(10);
    }

    public ArrayStack(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.t = -1;
    }
    
    @Override
    public void push(T element) {
        if(size() == elements.length) throw new RuntimeException("Stack is full");
        elements[++t] = element;
    }

    @Override
    public T pop() {
        if(isEmpty()) return null;
        T element = elements[t];  //retirando o elemento do topo
        elements[t] = null;  //falando que a posição que eu tirei o elemento é nula
        t--; //diminuindo o tamanho
        return element;
    }

    @Override
    public T top() {
        if(isEmpty()) return null;
        return elements[t];
    }

    @Override
    public int size() {
        return t+1; //pq o topo sempre aponta para -1 e preciso incluí-lo
    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }
    
}
