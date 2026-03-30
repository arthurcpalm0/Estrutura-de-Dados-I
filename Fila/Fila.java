public class Fila <T>{
    private T elementos[];
    private int inicio;
    private int fim;
    private int total;

    public Fila(int tamanho){
        this.elementos = (T[]) new Object[tamanho];
        this.inicio = 0;
        this.fim = 0;
        this.total = 0;
    }

    public boolean isEmpty(){
        return total==0;
    }

    public boolean isFull(){
        return total == elementos.length;
    }

    public void enqueue(T e) throws Exception{
        if (!isFull()){
            elementos[fim] = e;
            fim++;
            fim = fim % elementos.length;
            total++;
        }
        else{
            throw new Exception("Overflow");
        }
    }

    public T dequeue() throws Exception{
        if (!isEmpty()){
            T aux = elementos[inicio];
            inicio++;
            inicio = inicio % elementos.length;
            total--;
            return aux;
        }
        else{
            throw new Exception("Underflow");
        }
    }

    public int totalElementos(){
        return total;
    }

    public void invert() throws Exception{
        Pilha <T> pilha = new Pilha <T>(this.elementos.length);
        while (!isEmpty()){
            pilha.push(dequeue());
        }
        while (!pilha.isEmpty()){
            enqueue(pilha.pop());
        }
    }

    @Override
    public String toString() {
        // 1. Se a fila estiver vazia, retorna um aviso simples
        if (this.total == 0) {
            return "Fila vazia []";
        }

        // 2. Usamos StringBuilder para montar a frase (é mais rápido que String comum)
        StringBuilder sb = new StringBuilder();
        sb.append("Fila: [");

        // 3. Percorremos apenas os elementos que REALMENTE estão na fila
        for (int i = 0; i < this.total; i++) {
            // Cálculo para encontrar a posição correta (considerando fila circular)
            int posicaoAtual = (this.inicio + i) % this.elementos.length;
            
            sb.append(this.elementos[posicaoAtual]);

            // Se não for o último elemento, adiciona uma vírgula para separar
            if (i < this.total - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
}
}