package pessoa;

import carro.car1;



public class People  {
   private String name;
   private String corDoCabelo;
   private  String biotipo;
   private int idade;

   private car1 carro;





    public car1 getCarro() {
        return carro;
    }

    public void setCarro(car1 carro) {
        this.carro = carro;
    }

    public People (){

   }
    public People (String name){

    }


    public People(String name, String corDoCabelo, String biotipo, int idade) {
        this.name = name;
        this.corDoCabelo = corDoCabelo;
        this.biotipo = biotipo;
        this.idade = idade;
    }

    public People(String name, String biotipo, int idade, car1 carro) {
        this.name = name;
        this.biotipo = biotipo;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public People setName(String name) {
        this.name = name;
        return null;
    }

    public String getCorDoCabelo() {
        return corDoCabelo;
    }

    public void setCorDoCabelo(String corDoCabelo) {
        this.corDoCabelo = corDoCabelo;
    }

    public String getBiotipo() {
        return biotipo;
    }

    public void setBiotipo(String biotipo) {
        this.biotipo = biotipo;
    }

    public int getIdade() {
        return idade;
    }

   public void ligar (){
        carro.ligar();
   }
   public void desligaCarro(){
        carro.desliga();
   }
   public void acelerarCarro(){
        carro.acelerar();
   }
   public void frearCarro(){
        carro.frear();
   }
   public void setCambioMarcha(int marcha){
        carro.setCambio(marcha);

   }



    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", corDoCabelo='" + corDoCabelo + '\'' +
                ", biotipo='" + biotipo + '\'' +
                ", idade=" + idade
                ;
    }
}
