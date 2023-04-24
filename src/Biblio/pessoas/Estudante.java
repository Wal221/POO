package Biblio.pessoas;

import Biblio.Books;
import Biblio.Emprestimos;
import Biblio.Usuario;

import java.io.FileWriter;
import java.io.IOException;

public class Estudante extends Usuario {
    private int matricula;

    public Estudante(String nome, int idade, String cpf, int matricula, Emprestimos emprestimos) {
        super(nome, idade, cpf, emprestimos);
        this.matricula = matricula;
    }


    /**
     * @return  Esse metodo e herdado da classe usuario,
     * na qual ele determina a quantidade de livros que um ususario como
     *estudante pode pegar os livros para o emprestimo
     */
    @Override
    public boolean limiteList() {
        if (getBooks().size() > 0) {
            // System.exit(0);
            return true;
        }
        return false;

    }

/*
        @Override
        public String toString () {

            StringBuilder estu = new StringBuilder();
            estu.append("nome: " + getNome() + "\n");
            estu.append("idade: " + getIdade() + "\n");
            estu.append("matricula: " + matricula + "\n");

            return estu.toString();
        }

 */
    public void gravar(String caminho) {
        try {
            FileWriter writer = new FileWriter(caminho,true);
            writer.write("Aluno: "+getNome() + "\n" + getBooks()+ "\n" + "Dataemprestimo: " +
                    getEmprestimos().getDataDoEmprestimo() );
            writer.close();
            System.out.println("Dados gravados");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public String livrosAssociados(){
        StringBuilder estu = new StringBuilder();
        estu.append("nome: " + getNome() + "\n");
        estu.append("Dia do emprestimo:" + getEmprestimos().getDataDoEmprestimo());

        return estu.toString();
    }

    }

