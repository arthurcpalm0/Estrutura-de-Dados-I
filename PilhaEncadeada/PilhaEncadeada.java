public class PilhaEncadeada <T>{
    private Node<T> topo;
    private int size;

    public PilhaEncadeada(){
        topo = null;
        size = 0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        Node<T> aux = new Node<T>();
        return aux == null;
    }

    public boolean push(T data){
        if (!isFull()){
            Node<T> node = new Node<T>(data, null);
            if (isEmpty()){
                topo = node;
            }
            else{
                node.setProx(topo);
                topo = node;
            }
            size++;
            return true;
        }
        return false;
    }

    public T pop() throws Exception{
        if (!IsEmpty()){
            Node<T> node = topo;
            topo = topo.getProx();
            node.setProx(null);
            return node.getData();  
        }
        else{
            throw new Exception("Underflow");
        }

    }
}