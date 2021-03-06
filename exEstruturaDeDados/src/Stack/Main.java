package Stack;

import ListaEncadeada.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        pilha.push("A");
        pilha.push("B");
        pilha.push("C");
        
        System.out.println(pilha.top());
    }
}
