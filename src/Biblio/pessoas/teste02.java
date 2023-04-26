package Biblio.pessoas;

import Biblio.Books;
import Biblio.Emprestimos;
import Biblio.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class teste02 {

    //vai ter que ser instanciado um livro da classe Books ,  e um usuario da classe usuario
    //ja que um usuario tem uma relação de composição com o livro
    public static void main(String[] args) {
        //cadastra usuario
        //cadastra os livros
        //realizar emprestimo
        //relizar devolução
        //Lista todos os emprestimos
        Scanner ler = new Scanner(System.in);
        Books livro ;






      System.out.println("Quantos livros voce deseja cadastrar?: ");
      int number = ler.nextInt();
      //Cadastra os livros que serão disponiveis ao usuario
      //Para que mostre os livros que estão disponiveis a esses usuarios
      for (int i = 0 ;i < number; i++){
          System.out.print("Qual o nome do livro? ");
          String titulo = ler.next();
          System.out.print("Qual autor ? ");
          String autor = ler.next();
          System.out.print("Qual area ? ");
          String area = ler.next();
          System.out.print("Qual editora ? ");
          String editora = ler.next();
          System.out.print("Qual ano ? ");
          int ano = ler.nextInt();
          System.out.print("Qual edição ? ");
          int edição = ler .nextInt();
          System.out.print("Qual numero de folhas ? ");
          int numFolhas = ler.nextInt();



      }



    }



}

