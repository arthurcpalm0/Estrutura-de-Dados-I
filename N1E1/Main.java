public class Main{
    public static void main(String[] args){
        Carro carro1 = new Carro(2003, "fiat");
        Carro carro2 = new Carro();
        carro2.setAno(2002);
        int a = carro2.getAno()+1000;
        System.out.printf("%d, %s\n",carro1.getAno(),carro1.getMarca());
        System.out.println(a);
    }
}