import carro.car1;
import pessoa.People;

import javax.swing.*;

public class Main  {
    public static void main(String[] args) {
        People pessoa = new People("walmir");
        car1 carro = new car1("bicape", "Azul ", 2);

        pessoa.setCarro(carro);
        pessoa.ligar();
        pessoa.setCambioMarcha(1);
        pessoa.acelerarCarro();

        System.out.println();

        pessoa.setCambioMarcha(2);
        pessoa.getCarro().getCambio();
        pessoa.acelerarCarro();

        System.out.println();

        pessoa.setCambioMarcha(3);
        pessoa.getCarro().getCambio();
        pessoa.acelerarCarro();

        System.out.println();

        pessoa.setCambioMarcha(2);
        pessoa.getCarro().getCambio();

    }




}