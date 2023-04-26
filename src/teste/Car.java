package teste;

public class Car extends Veiculo implements Ve {
    private String cor;
    private String portas;



/**
 * como os atributos da classe mãe(Veiculo) são privados eu não posso acessar eles
 * diretamente no meu contrutor. E como na herança so se herda os atributos e os metodos
 * OS CONTRUTORES EM NENHUMA IPOTESES SÃO HERDADOS, para eu acessa os atributos da classe mãe
 * eu tenho que usar o super que recebe os seus atributos da classe mãe como parametros para acessalos
 */

 /**
  * Esse construto recebe o seus atributos e os atributos que herdam de veiculos
  * sendo esse acessados de forma indireta pelo super
  */
    public Car (String cor, String portas, String nome, String modelo){
        /**
         * como não tem como acessar o construtor diretamente usamos o super para
         * acessa-lo
         */
        super(nome, modelo);
        this.cor = cor;
        this.portas= portas;

    }
    /**
     * @Anota metodo da cor do carro que vem da subclass
     *
     */
     public void cor(){
         System.out.printf("cor: %s " , cor + "\n");
     }

    @Override
    public int velocidade(int velo) {
        return velo;
    }
}
