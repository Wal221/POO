package Biblio;

import java.util.Date;

public class Emprestimos {


    private Date dataDoEmprestimo;


    public  Emprestimos (){

    }


    public Emprestimos(Date dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }

      /**
       * posso ate formata como a data deve ser enviada , ja que no momento em que o livro e pego
       * o sistema de emprestimo que deve fornece a data , e não  na classe teste que devemos instancia uma data
       *

       */



    public Date getDataDoEmprestimo() {
        return dataDoEmprestimo = new Date() ;
    }

    /*
    public void setDataDoEmprestimo(Date dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;

    }

     */
     public boolean devolverLivro(){
         return true;
     }

    @Override
    public String toString() {
        return "" + dataDoEmprestimo
                ;
    }
}
