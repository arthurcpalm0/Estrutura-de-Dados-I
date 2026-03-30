import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Pilha <Character> p = new Pilha<Character>(50);
        try{
            System.out.println("Insira uma palavra:");
            Scanner entrada = new Scanner(System.in);
            String pal = entrada.nextLine();
            int metade = pal.length()/2;
            for (int i = 0; i<metade; i++){
                p.push(pal.charAt(i));
            }
            if (pal.length()%2==0){
                for (int i = metade; i<pal.length(); i++){
                    if (pal.charAt(i)==p.topo()){
                        p.pop();
                    }
                }
            }
            else {
                for (int i = metade+1; i<pal.length(); i++){
                    if (pal.charAt(i) == p.topo()){
                        p.pop();
                    }
                }
            } 
            if (p.isEmpty()){
                System.out.println("A palavra e palindroma.");
            }
            else{
                System.out.println("A palavra nao e palindroma.");
            }
            entrada.close();
        }
        catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
