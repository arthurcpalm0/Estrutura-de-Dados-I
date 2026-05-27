public class Main{
    public static void main(String[] args) {
        try{
            LinkedList l = new LinkedList<Integer>();
            l.insertTail(1);
            l.insertTail(2);
            l.insertTail(3);
            l.insertTail(4);
            l.insertTail(6);
            l.insertTail(7);
            l.insertTail(8);
            l.insertAsc(9);
            l.insertAsc(0);
            l.insertAsc(67);
            l.insertAsc(4);
            l.insertAsc(5);
            System.out.println(l);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}