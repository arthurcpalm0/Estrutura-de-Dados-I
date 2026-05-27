public class LinkedList <T extends Comparable<T>>{
    private Node<T> head;
    private int size;

    public LinkedList(){
        this.head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        Node<T> aux = new Node<T>(); 
        return aux == null;
    }

    public Node<T> getHead(){
        return head;
    }

    public boolean insertTail(T data){
        Node<T> aux;
        Node<T> pAnda;
        if (!isFull()){
            aux = new Node<T>(data, null);
            if (isEmpty()){
                head = aux;
            }
            else{
                pAnda = head;
                while (pAnda.getProx()!=null){
                    pAnda = pAnda.getProx();
                }
                pAnda.setProx(aux);
            }
            size++;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean insertHead(T data){
        Node<T> aux;
        if (!isFull()){
            aux = new Node<T>(data, null);
            if(isEmpty()){
                head = aux;
            }
            else{
                aux.setProx(head);
                head = aux;
            }
            size++;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean insert(T data, int pos){
        Node<T> aux;
        Node<T> pAnda;
        Node<T> pAnt = head;
        if(!isFull() && pos>0){
            aux = new Node<T>(data, null);
            if (isEmpty() || pos==1){
                insertHead(data);
            }
            else if (pos>size){
                insertTail(data);
            }
            else{
                int cont = 2;
                pAnda = head.getProx();
                while (cont!=pos && pAnda.getProx() != null){
                    pAnt = pAnda;
                    pAnda = pAnda.getProx();
                    cont++;
                }
                pAnt.setProx(aux);
                aux.setProx(pAnda);
            }
            size++;
            return true;
        }
        else{
            return false;
        }
    }

    public void inverte(){
        Node<T> nodeAnt = null;
        Node<T> node = head;
        Node<T> nodeProx = null;
        while (node!=null){
            nodeProx = node.getProx();
            node.setProx(nodeAnt);
            nodeAnt = node;
            node = nodeProx;
        }
        head = nodeAnt;
    }

    public void merge(LinkedList<T> list) throws Exception{
        if (!isEmpty() && !list.isEmpty()){
            Node<T> n1 = list.getHead();
            int cont = 2;
            while (n1!=null&&cont<size+1){
                insert(n1.getData(), cont);
                cont+=2;
                n1 = n1.getProx();
            }
            if (n1!=null){
                while (n1!=null){
                    insertTail(n1.getData());
                    n1 = n1.getProx();
                }
            }
        }
        else{
            throw new Exception ("Erro");
        }
    }

    public boolean insertAsc(T data){
        if(!isFull()){
            Node<T> node = new Node<T>(data,null);
            if (isEmpty()){
                head = node;
            }
            else{
                Node<T> pAnda = head;
                Node<T> pAnt = null;
                while (pAnda!=null && data.compareTo(pAnda.getData())>0){
                    pAnt = pAnda;
                    pAnda = pAnda.getProx();
                }
                if (pAnda == head){
                    node.setProx(head);
                    head = node;
                }
                else{
                    pAnt.setProx(node);
                    node.setProx(pAnda);
                }
            }
            size++;
            return true;
        }
        return false;
    }

    @Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		int qtde = 0;
		sb.append("\n[Lista]\n");
	
	    sb.append("L: [ ");
	    Node<T> pAnda = head;
	    while (pAnda != null) {
	      sb.append(pAnda.getData()+" ");
	      qtde++;
	      pAnda = pAnda.getProx();
	    }
	    sb.append("]\n");
	    
	    sb.append("Qtde.: " + qtde);
	    sb.append("\n");
	    
	    return sb.toString();
	}
}