import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Fila f = new Fila<Object>(5);
        try{
        f.enqueue(1);
        f.enqueue(2);
        f.enqueue(3);
        f.enqueue(4);
        f.enqueue(5);
        f.dequeue();
        f.enqueue(6);
        System.out.println(f);
        f.invert();
        System.out.println(f);
        }
        catch(Exception e) {
            System.out.println("Erro detectado: " + e.getMessage());
        }
    }
}