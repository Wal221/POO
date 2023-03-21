package Biblio;

import java.util.Date;

public class Emprestimos {


    private Date dataDoEmprestimo;


    public  Emprestimos (){

    }


    public Emprestimos(Date dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }

    public Date getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }

    public void setDataDoEmprestimo(Date dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;

    }
     public boolean devolverLivro(){
         return true;
     }

    @Override
    public String toString() {
        return "" + dataDoEmprestimo
                ;
    }
}
