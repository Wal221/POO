package carro;

public class car1 {
    private String tipo;
    private String cor;
    private int numPortas;
    private String placa;
    private String pessoa ;

     private int cambio;

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCambio() {
        System.out.println("MARCHA "+  this.cambio);

        return this.cambio;

    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }

    public car1(){

    }

    public car1(String tipo, String cor, int numPortas ,  String placa) {
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.numPortas = numPortas;
    }

    public car1(String tipo, String cor, int numPortas) {
        this.tipo = tipo;
        this.cor = cor;
        this.numPortas = numPortas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }



    public void ligar (){
        System.out.println("CARRO LIGADO");
    }
    public void desliga(){
        System.out.println("CARRO DESLIGADO");
    }
    public void acelerar(){
        System.out.println("CARRO ACELERANDO");
    }
    public void frear(){
        System.out.println("CARRO FREANDO");
    }


    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "" +
                "tipo='" + tipo + '\'' +
                ", cor='" + cor + '\'' +
                ", numPortas=" + numPortas +
                ", placa='" + placa + '\''

                ;
    }
}
