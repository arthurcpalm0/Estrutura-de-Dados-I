public class Carro{
    private int ano;
    private String marca;

    public Carro(){
    }

    public Carro(int ano, String marca){
        this.ano = ano;
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(){
        this.marca = marca;
    }
}