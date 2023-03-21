package Professor;

import java.util.ArrayList;

public class TestaProfesor {
    public static void main(String[] args) {
        ArrayList<ProfDE> cadDE = new ArrayList<>();
        ArrayList <ProfeHorista> cadHorista = new ArrayList<>();

        cadDE.add(new ProfDE("Joao" , 1,112));
        cadDE.add(new ProfDE("Maria" , 2,514));

        cadHorista.add(new ProfeHorista("Jose", 3 , 6, 30));
        cadHorista.add(new ProfeHorista("Fernando", 4 , 4, 12.5));
        System.out.println("Nome do professor");

        for(ProfDE p : cadDE){

            System.out.println(p.getName());

        }
        System.out.println("Salario/hora dos ´professores");
        for(ProfeHorista p : cadHorista){
            System.out.println(p.getName() + " " + p.getSalario());

        }


    }
}
