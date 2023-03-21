package Biblio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuario {
    private String name;
    private int idade;
    private String sexo;
    private int telefone;

    private Emprestimos emprestimos ;
    private Books livros = new Books();

  /*  public void setBooks(List<Books> books) {
        this.books = books;
    }

   */



    public Books getLivros() {
        return livros;
    }

    public void setLivros(Books livros) {
        this.livros = livros;
    }

    public Usuario (){

    }

    public Usuario(String name, int idade, String sexo, int telefone) {
        this.name = name;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;

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

   /* public List<Books> getBooks() {
        return books;
    }
    public void addBook(Books livros){
        books.add(livros);
    }
    public void removeBook(Books livros){
        books.remove(livros);
    }

    */

    public void lerLivro(){
        System.out.println(" USUARIO ESTA LENDO O LIVRO");
    }



  //  @Override
   /* public String toString() {
        return "Usuario" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", telefone=" + telefone +
                ", emprestimos=" + emprestimos
                ;
    }

    */
}
