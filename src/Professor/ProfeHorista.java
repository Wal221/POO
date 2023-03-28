package Professor;

/**
 * Classe que herda de professor ,
 * representa o professor que recebem por hora
 * @author walmir
 * @version 1.0

 */

public class ProfeHorista extends Profe{
    private  double salarioHora;

    /**
     * Construtor que instacia um professor Horista, da classe
     * ProfHorista com:
     * @param nome;
     * @param matricula;
     * @param cargaHoraria;
     * @param salarioHora, valor recebido pela hora trabalhada
     */
    public ProfeHorista(String nome, int matricula, int cargaHoraria, double salarioHora ){
        super(nome,matricula,cargaHoraria);
        this.salarioHora = salarioHora;

    }
    /**
     * Metodo sobreescreve o getSalario de professor
     * @return o salario do ProfHorista, em que e feito um calculo:
     * salarioHora * getCargaHoraria()*4.5
     * Considerando-se que a carga horaria e semanal e que o mes
     * possui 4,5 semanas , esses sera o salario mensal do professor horista
     *
     */
    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }
    public Double getSalario (){
        return (salarioHora * getCargaHoraria()* 4.5);
    }
}
