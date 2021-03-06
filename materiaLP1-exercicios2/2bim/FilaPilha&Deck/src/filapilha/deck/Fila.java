package filapilha.deck;

import filapilha.deck.Vetor;

public class Fila<T> implements FilaInterface<T> {

    private T[] elementos;
    private int tamanho;

    Vetor<T> V1;

    public Fila() {
        this(10);
    }

    public Fila(int capacidade) {
        this.elementos = (T[]) new String[capacidade];
        this.tamanho = 0;
    }

    @Override
    public void enfileirar(T elemento) {
        if (tamanho() == elementos.length) {
            throw new RuntimeException("Fila Vazia");
        }

        elementos[tamanho] = elemento;
        tamanho++;

        //V1.adicionar(elemento);
    }

    @Override
    public T desenfileirar() {
        if (vazia()) {
            return null;
        }
        T elemento = elementos[0];

        for (int i = 0; i < tamanho - 1; i++) {

            this.elementos[i] = this.elementos[i + 1];
        }
        elementos[--tamanho] = null;
        return elemento;
    }

    @Override
    public T primeiro() {
        if (vazia()) {
            return null;
        }
        return elementos[0];
    }

    @Override
    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public boolean vazia() {
        if (tamanho == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String texto = "";
        for (T elemento : elementos) {
            texto += elemento + " , ";
        }
        return texto;
    }
}
