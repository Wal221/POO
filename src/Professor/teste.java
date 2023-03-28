package Professor;

public class teste {
    public static <ProfeDE> void main(String[] args) {
        Profe prof1 = new ProfDE("Joao", 1, 1123.56);
        Profe prof2 = new ProfeHorista("Jose", 3 ,14,12.5);
      //  ProfeDE prof3 = (ProfeDE) new Profe("Maria", 2, 14);

    ProfeHorista profeee = new ProfeHorista("jose", 5,13,44);


    profeee.getSalarioHora();

        Profe profSuper = null;
        Profe profSub;
        ProfDE prof4 = new ProfDE("Jose", 3, 1500.00);
        profSub = prof4;
        profSub =  profSuper;
        profSub = (ProfDE) profSuper;

        //System.out.println(prof1.getSalario());
        //System.out.println(prof2.getSalario());
        //System.out.println(profSub.getSalario());

    }
}
