public class Main{
    public static void main(String[] args) {
        LinkedList l = new LinkedList<Object>();
        l.insert(5,3);
        System.out.println(l);
        l.insertHead(3);
        l.insertTail(4);
        l.insert(6,2);
        System.out.println(l);
    }
}