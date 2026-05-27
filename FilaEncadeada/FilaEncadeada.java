public class FilaEncadeada<T>{
    private Node<T> head;
    private int size;

    public DEC(){
        this.head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        Node<T> aux = new Node<T>();
        return aux == null;
    }

    public boolean enqueue(T data){
        if (!isFull()){
            if (isEmpty()){
                head = node;
            }
            else{
                node.setProx(head);
                head = node;
            }
            size++;
            return true;
        }
        return false;
    }

    public boolean dequeue(){
        if (!IsEmpty()){
            if (size!=1){
                node aux = head;
                head = head.getProx();
                aux.setProx(null);
            }
            else{
                head = null;
            }
            size--;
            return true;
        }
        return false;
    }

    public T front() throws Exception{
        if (!isEmpty()){
            return head.getData();
        }
        else{
            throw new Exception ("Erro");
        }
    }

    public T back() throws Exception{
        if (!isEmpty()){
            Node<T> pAnda = head;
            while (pAnda.getProx()!=null){
                pAnda = pAnda.getProx();
            }
            return pAnda.getData();
        }
        else{
            throw new Exception ("Erro");
        }
    }
}