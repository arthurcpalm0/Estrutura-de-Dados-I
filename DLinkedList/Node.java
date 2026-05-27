public class Node <T>{
    private T data;
    private Node<T> prox;
    private Node<T> ant;

    public Node(T data, Node<T> prox, Node<T> ant){
        this.data = data;
        this.prox = prox;
        this.ant = ant;
    }

    public Node(){
        this(null,null,null);
    }

    public Node<T> getProx(){
        return prox;
    }

    public Node<T> getAnt(){
        return ant;
    }

    public void setProx(Node<T> node){
        prox = node;
    }

    public void setAnt(Node<T> node){
        ant = node;
    }

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }
}