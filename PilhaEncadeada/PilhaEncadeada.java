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

    public boolean push(T data){
        Node<T> node = new Node<T>(data, null);
        if (size>0){
            node.setProx(topo);
        }
        topo = node;
        size++;
        return true;
    }

    public T pop() throws Exception{
        if (!IsEmpty()){
            Node<T> pAnda = topo;
            topo = pAnda.getProx();
            pAnda.setProx(null);
            return pAnda.getData();
            
        }
        else{
            throw new Exception("Underflow");
        }

    }
}