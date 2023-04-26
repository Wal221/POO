package Biblio.testar;

import Biblio.Books;
import Biblio.Emprestimos;
import Biblio.Usuario;
import Biblio.pessoas.Estudante;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        Books livros = new Books();
        Emprestimos emprestimos = new Emprestimos();
        Estudante estudante = new Estudante("Wan",12,"1234",2022,emprestimos);

        List<Books> livro = new ArrayList<>();

        //cadastra livro nesse seguinte codigo
        //e cadastrado um livro na biblioteca e caso esse aluno queira pegar algum livro
        //como ja a um livro instanciado no usuario , o livro que esse aluno pegar estara disponivel
        //para ele , no caso a lista de livros ficara referenciada a um aluno


         System.out.println("Quantos livros deseja cadastrar?: ");
        int number = ler.nextInt();
           //Tenho que cadastra os livros disponiveis na biblioteca
           //logo em seguida mostro para o usuario quais livros estão disponiveis para
           // ele poder , no caso tenho que ler o arquivo e mostra para o usuario




        for(int i = 0 ; i < number ; i++) {
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
            int edição = ler.nextInt();
            System.out.print("Qual numero de folhas ? ");
            int numFolhas = ler.nextInt();
            System.out.println();

            System.out.println("-------------------");

            livros = new Books(titulo,autor,area,editora,ano,edição,numFolhas);
            livro.add(livros);
            livros.gravar("src/Biblio/testar/livros");
        }






        //Aqui eu passo o nome do livro que desejo pegar emprestado
        //Agora tenho que pensa em uma forma de limitar a quantidade de livro que um estudante pode pegar
        System.out.println("Livros disponiveis ");
        livros.Livrosdisponiveis();

        System.out.println("Digite o nome do livro que deseja pegar ");

         String nomeLivro = ler.next();
      for(int i = 0 ; i < 6; i++ ){
          Books aux  = new Books();
          aux.setTitulo( (Files.readAllLines(Paths.get("src/Biblio/testar/livros")).get(i)));

          if(aux.getTitulo().equalsIgnoreCase(nomeLivro)){
          System.out.println("o nome digitado a no arquivo ");
          estudante.addBook(aux);
              estudante.gravar("src/Biblio/pessoas/Emprestimo");

          }
      }


      //  System.out.println(estudante.getEmprestimos().getDataDoEmprestimo());


       // System.out.println(estudante.livrosAssociados());









    }
}