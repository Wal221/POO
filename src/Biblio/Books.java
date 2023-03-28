package Biblio;

import Biblio.Obras.Fotografia;
import Biblio.Obras.MidiaAudio;
import Biblio.repository.Obrass;

public class Books  implements Obrass {
    private String titulo;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
    public void openBook(){
        System.out.println(" LIVRO ESTA ABERTO PARA LEITURA ");

    }
    public void closeBook(){
        System.out.println("LIVRO ESTA FECHADO PARA LEITURA");
    }


    @Override
    public String toString() {
        return "Books" +
                "titulo: '" + titulo +"\n"+
                "Autores: " + autores+ "\n"+
                 "Area: "+ area + "\n"+
                "editora: "+ editora + "\n"+
                "ano: "+ ano + "\n"+
                "edição: "+ edicao + "\n"+
                "numero de folhas: "+ numeroDeFolhas + "\n";

    }

    @Override
    public Fotografia getFotografia() {

        Fotografia foto ;
        String fotografia = "Vendo imagem";
        foto = new Fotografia(fotografia);
        return foto;

    }

    @Override
    public MidiaAudio getMidiaAudio() {
      MidiaAudio midiaAudio;
      String ler = " Ouvindo livro "+ getTitulo();
       midiaAudio= new MidiaAudio(ler);

       return midiaAudio;
    }


}
