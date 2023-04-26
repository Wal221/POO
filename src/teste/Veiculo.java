package teste;

public class Veiculo {
    private String nome;
    private String modelo;

    public Veiculo(String nome, String modelo) {
        this.nome = nome;
        this.modelo = modelo;
    }

    /**
     * @Anota metodo que imprimi o nome e o modelo do veiculo.
     * Sendo um metodo da classe mãe. Ja que pode existir mais de um
     * tipo de veiculo
     * não sendo necessario cria um metodo de informação em cada classe que herda da classe
     * como carro , avião , moto.
     */
   public void info(){
       System.out.printf("Nome: %s ", nome+ "\n");
       System.out.printf("Modelo: %s ", modelo+ "\n");

   }

}
