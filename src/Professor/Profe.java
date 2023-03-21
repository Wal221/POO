package Professor;

public class Profe {
    private String name;
    private int matricula;
    private int cargaHoraria;




    public Profe(){


    }

    public Profe(String name, int matricula, int cargaHoraria) {
        this.name = name;
       this.matricula = matricula;
        this.cargaHoraria = cargaHoraria;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria){}


    public Double getSalario(){
        return null;

    }

}
