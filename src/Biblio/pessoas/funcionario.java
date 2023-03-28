package Biblio.pessoas;

public class funcionario extends Pessoa{
   private String sexo;
   private String email;


    public funcionario(String nome, int idade, String cpf, String sexo, String email) {
        super(nome, idade, cpf);
        this.sexo = sexo;
        this.email = email;
    }
}
