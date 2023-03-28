package Professor;

public class ProfDE extends Profe{
    private double salarario;

    public ProfDE(String name, int matricula,double salarario){
        super(name ,matricula, 40);
        this.salarario= salarario;

    }

    public double getSalarario() {
        return salarario;
    }

    public void setSalarario(double salarario) {
        this.salarario = salarario;
    }

    @Override
    public Double getSalario() {
        return null;
    }
}
