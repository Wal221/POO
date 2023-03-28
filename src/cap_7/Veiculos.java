package cap_7;

public abstract class Veiculos  {
    public int velocidade;
    public boolean status;

    public void ligar(){
        status = true;
    }
    public void desligar(){
        status = false;
    }

    public void mostrarStatus(){
        System.out.println("status");
    }
    public abstract void acelerar();

}
