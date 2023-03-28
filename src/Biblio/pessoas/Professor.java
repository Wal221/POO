package Biblio.pessoas;

public class Professor extends funcionario {
    private String curso;
    private String tipo;


    public Professor(String nome, int idade, String cpf, String sexo, String email,String curso,String tipo) {
        super(nome, idade, cpf, sexo, email);
        this.curso = curso;
        this.tipo = tipo;
    }
}
