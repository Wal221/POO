package teste;

public class teste001 {

    public static void main(String[] args) {

        Car carro = new Car("Azul","4","Gol","Perua");


        carro.info();
        System.out.println(+carro.velocidade(34)+"KM/H");
        carro.cor();
    }
}
