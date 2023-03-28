package Biblio.pessoas;

public class Estudante extends Pessoa{
    private int matricula;

    public Estudante(String nome, int idade, String cpf, int matricula) {
        super(nome, idade, cpf);
        this.matricula = matricula;
    }
}
