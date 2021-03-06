package filapilha.deck;

public class Vetor<T> implements VetorI<T> {

    private T[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = (T[]) new String[capacidade];
        this.tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public void adicionar(T elemento) {
        this.aumentarCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new RuntimeException("O vetor está cheio");
        }
    }

    @Override
    public void adicionar(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new RuntimeException("Argumento inválido");
        }

        for (int i = 0; this.tamanho - 1 >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

    }

    @Override
    public void remover(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new RuntimeException("Argumento inválido");
        }

        for (int i = posicao; i < tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    @Override

    public T buscar(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        return elementos[posicao];

    }

    @Override
    public int buscas(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        String texto = "";
        for (T elemento : elementos) {
            texto += elemento + " , ";
        }
        return texto;
    }

    @Override
    public void aumentarCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    private int verificarPosicao(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

}
