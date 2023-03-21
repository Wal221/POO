package carro;

import pessoa.People;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {


        People person = new People();

        Scanner ler = new Scanner(System.in);


        System.out.println("Seu carro tem um dono do seu carro ? S/N: ");
        String resposta = ler.next();
        if(resposta.equalsIgnoreCase("s")){
            //carro = new car1();
            System.out.println("Qual o nome do Dono ");
            String dono = ler.next();

            //carro.setPessoa(person.setName(dono));
        }




        System.out.print("De que tipo e o seu carro ?: ");
        String tipo = ler.next();

        System.out.print("Qual a cor ? :");
        String cor = ler.next();

        System.out.print("quantas portas ? :");
        int numberPortas= ler.nextInt();

        System.out.println("O seu carro e usado ? S/N");
        String resp = ler.next();

        if(resp.equalsIgnoreCase("s")){

            System.out.print("Digite algum numero e letras  para sua placa ");
            String placa = ler.next();
           // carro = new car1(tipo,cor,numberPortas,placa);

            System.out.println("Seu carro ");
          //  System.out.println(carro);
        } else {

          //  carro = new car1(tipo, cor, numberPortas);

            System.out.println("Seu carro ");
          //  System.out.println(carro);
        }

    }
}
