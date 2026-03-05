import java.util.*;
public class Generics{
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        Stack<Integer> pilhaux = new Stack<>();
        pilha.push(5);
        pilha.push(7);
        pilha.push(15);
        pilha.push(25);
        pilha.push(18);
        pilha.push(45);
        System.out.println("Pilha: " + pilha);
        System.out.println("Pilhaux: " + pilhaux);
        while(!pilha.empty()){
            int x = pilha.pop();
            if (x%3!=0||x%5!=0){
                pilhaux.push(x);
            }
        }
        while (!pilhaux.empty()){
            pilha.push(pilhaux.pop());
        }
        System.out.println("Pilha: " + pilha);
        System.out.println("Pilhaux: " + pilhaux);
    }

}