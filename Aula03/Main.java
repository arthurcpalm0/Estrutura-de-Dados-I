public class Main {
    public static void main(String[] args){
        Pilha p = new Pilha();
        try {
            p.push(4);
        }
        catch (Exception e){
            System.out.println("Erro encontrado: "+ e);
        }
    }
}
