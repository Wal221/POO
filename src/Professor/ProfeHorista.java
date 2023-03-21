package Professor;

public class ProfeHorista extends Profe{
    private  double salarioHora;

    public ProfeHorista(String nome, int matricula, int cargaHoraria, double salarioHora ){
        super(nome,matricula,cargaHoraria);
        this.salarioHora = salarioHora;

    }

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
