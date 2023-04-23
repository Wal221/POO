package Biblio;

import Biblio.Obras.Fotografia;
import Biblio.Obras.MidiaAudio;
import Biblio.Obras.Obrass;

public class Books extends Obrass {
    private String autores;
    private String area;
    private String editora;
    private int ano;
    private int edicao;
    private  int numeroDeFolhas;
    private boolean emprestimo = false;

    public Books (){

    }



    public Books(String titulo, String autores, String area, String editora, int ano,
                 int edicao, int numeroDeFolhas) {
        this.titulo = titulo;
        this.autores = autores;
        this.area = area;
        this.editora = editora;
        this.ano = ano;
        this.edicao = edicao;
        this.numeroDeFolhas = numeroDeFolhas;

    }

    public Books(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo =emprestimo;
    }



    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getNumeroDeFolhas() {
        return numeroDeFolhas;
    }

    public void setNumeroDeFolhas(int numeroDeFolhas) {
        this.numeroDeFolhas = numeroDeFolhas;
    }

    public void closeBook(){
        System.out.println("LIVRO ESTA FECHADO PARA LEITURA");
    }

    @Override
    public String acaoObras() {
        return "LIVRO ABERTO PARA LEITURA";
    }



    @Override
    public String toString() {
        StringBuilder livro = new StringBuilder();
       livro.append("titulo: " + titulo + "\n");
       livro.append("autor: " + autores + "\n");
        livro.append("area: " + area + "\n");

        return livro.toString();

    }






}
