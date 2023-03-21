package Biblio;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
           Usuario user = new Usuario();
           Date date = new Date();
        
           Emprestimos emprestimos = new Emprestimos(date);


        System.out.println("-----EMPRESTIMO-----");
        user.getLivros().setTitulo("O AMOR");
        System.out.println("Titulo: " + user.getLivros().getTitulo());
        user.setName("Michele");
        System.out.println("Usuario: " + user.getName());
        user.setEmprestimos(emprestimos);
        System.out.println("Data: " + user.getEmprestimos());
        user.getLivros().openBook();
        user.lerLivro();
        user.getLivros().closeBook();

        user.getLivros().setEmprestimo(emprestimos.devolverLivro());
        if(user.getLivros().isEmprestimo()==true){
            System.out.println("Livro devolvido");

        }










    }
    }
