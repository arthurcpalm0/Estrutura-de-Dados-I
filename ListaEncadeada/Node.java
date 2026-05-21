public class Node <T>{
    private T data;
    private Node<T> prox;

    public Node(T data, Node<T> prox){
        this.data = data;
        this.prox = prox;
    }

    public Node(){
        this(null,null);
    }

    public Node<T> getProx(){
        return prox;
    }

    public void setProx(Node<T> node){
        prox = node;
    }

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }
}