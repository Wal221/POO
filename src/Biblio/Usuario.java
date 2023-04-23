package Biblio;

import Biblio.pessoas.Pessoa;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class  Usuario extends Pessoa {


    private int telefone;

    private Emprestimos emprestimos ;
    private List<Books> books = new ArrayList<>();

    public void setBooks(List<Books> books) {
        this.books = books;
    }

    public Usuario (){

    }
    public Usuario(String name, int idade, int telefone,String cpf, Emprestimos emprestimos) {
        super(name,idade,cpf);
        this.telefone = telefone;
        this.emprestimos = emprestimos;

    }



    public Usuario(String name, int idade, String cpf,Emprestimos emprestimos ){
        super(name, idade, cpf);
        this.emprestimos =emprestimos;

    }


    public Usuario(int telefone) {
        super();
        //this.name = name;
        //this.idade = idade;
        //this.sexo = sexo;
        this.telefone = telefone;

    }
/*
    public void setLivros(Books livros) {
        this.livros = livros;
    }
    public Books getLivros() {
        return livros;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

 */

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Emprestimos getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(Emprestimos emprestimos) {
        this.emprestimos = emprestimos;
    }


   public List<Books> getBooks() {
        return books;
    }
    public void addBook(Books livros){
        books.add(livros);
    }
    public void removeBook(Books livros){
        books.remove(livros);
    }



    public void lerLivro(){
        System.out.println(" USUARIO ESTA LENDO O LIVRO");
    }

    public boolean limiteList(){

        return false;
    }



    @Override
    public String toString() {
        return "Usuario" +
                ", telefone=" + telefone +
                ", emprestimos=" + emprestimos
                ;
    }
    public void gravar(String caminho) {
        try {
            FileWriter writer = new FileWriter(caminho,true);
            writer.write(getNome() + "\n" + getBooks());
            writer.close();
            System.out.println("Dados gravados");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

}
