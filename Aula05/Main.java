import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        String p = entrada.nextLine();
        if (balanceada(p)==true){
            System.out.println("A expressão está balanceada");
        }
        else {
            System.out.println("A expressão não está balanceada");
        }
    }

    public static boolean balanceada(String expressao){
        Pilha <Character> p = new Pilha<Character>();
        try{
            for (int i=0;i<expressao.length();i++){
                char c = expressao.charAt(i);
                if (c=='('){
                    p.push(c);
                }
                else if (c== ')'){
                    if (!p.isEmpty()){
                        p.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        catch(Exception e){
            return false;
        }
         return p.isEmpty();
    }
}
