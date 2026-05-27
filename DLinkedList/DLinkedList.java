public class DLinkedList<T extends Comparable <T>>{
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean insertAsc(T data){
        Node<T> node = new Node<T>(data,null,null);
        if (isEmpty()){
            head = node;
            tail = node;
        }
        else{
            Node<T> pAnda = head;
            while(pAnda!=null && data.compareTo(pAnda.getData())>0){
                    pAnda = pAnda.getProx(); 
            }
            if (pAnda==head){
                head.setAnt(node);
                node.setProx(head);
                head = node;
            }
            else if (pAnda!=null){
                pAnda.getAnt().setProx(node);
                node.setAnt(pAnda.getAnt());
                pAnda.setAnt(node);
                node.setProx(pAnda);
            }
            else{
                tail.setProx(node);
                node.setAnt(tail);
                tail = node;
            }
        }
        size++;
        return true;
    }

    public boolean insert(T data){
        Node<T> node = new Node<T>(data, null, null);
        if(isEmpty()){
            head = node;
            tail = node;
        }
        else{
            node.setProx(head);
            head.setAnt(node);
            head = node;
        }
        size++;
        return true;
    }

    public boolean remove(int pos){
        if (!isEmpty()&&pos<=size && pos>0){
            Node<T> pAnda = head;
            int cont = 1;
            while(cont<pos){
                pAnda = pAnda.getProx();
                cont++;
            }
            if (size==1){
                head = null;
                tail = null;
            }
            else{
                if(pAnda == head){
                    head = head.getProx();
                    head.setAnt(null);
                    pAnda.setProx(null);
                }
                else if (pAnda==tail){
                    tail = tail.getAnt();
                    tail.setProx(null);
                    pAnda.setAnt(null);
                }
                else{
                    pAnda.getAnt().setProx(pAnda.getProx());
                    pAnda.getProx().setAnt(pAnda.getAnt());
                    pAnda.setProx(null);
                    pAnda.setAnt(null);
                }
            }
            size--;
            return true;
        }
        return false;
    }

    public boolean removeparimpar(int tipo){
        if(!isEmpty()&&(tipo==1 || tipo==2)){
            Node<T> pAnda = head;
            Node<T> aux;
            int cont = 1;
            while (pAnda!=null){
                aux = pAnda.getProx();
                if ((tipo==1 && cont%2!=0) || (tipo==2 && cont%2==0)){
                    if (pAnda == head){
                        if (size==1){
                            head = null;
                            tail = null;
                        }
                        else{
                            head = head.getProx();
                            head.setAnt(null);
                        }
                    }
                    else if (pAnda == tail){
                        tail = tail.getAnt();
                        tail.setProx(null);
                    }
                    else{
                        pAnda.getAnt().setProx(pAnda.getProx());
                        pAnda.getProx().setAnt(pAnda.getAnt());
                    }
                    pAnda.setProx(null);
                    pAnda.setAnt(null);
                    size--;
                }
                cont++;
                pAnda = aux;
            }
            return true;
        }
        return false;
    }
}