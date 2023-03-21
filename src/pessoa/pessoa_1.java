package pessoa;

import java.util.Scanner;

public class pessoa_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         People pessoa ;

        System.out.print("Qual o seu nome ? :");
        String nome = ler.next();

        System.out.println("Voce tem cabelo? S/N :");
        String resp = ler.next();
        if(resp.equalsIgnoreCase("S")){
            System.out.print("Qual a cor do seu cabelo ? :");
            String corCabelo = ler.next();

            System.out.print("Qual o seu biotipo ? : ");
            String biotipo = ler.next();

            System.out.print("Qual a sua idade ? :");
            int idade = ler.nextInt();

            System.out.println();

            pessoa = new People(nome,corCabelo,biotipo,idade);
            System.out.println(pessoa);

        } else {

            System.out.print("Qual o seu biotipo ? : ");
            String biotipo = ler.next();

            System.out.print("Qual a sua idade ? :");
            int idade = ler.nextInt();

           // pessoa = new People(nome,biotipo,idade);

            //System.out.println(pessoa);
        }


    }
}
