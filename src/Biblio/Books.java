package Biblio;

import Biblio.Obras.Fotografia;
import Biblio.Obras.MidiaAudio;
import Biblio.Obras.Obrass;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Books extends Obrass {
    private String autores;
    private String area;
    private String editora;
    private int ano;
    private int edicao;
    private  int numeroDeFolhas;
    private boolean emprestimo = true;

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


/*
    @Override
    public String toString() {
        StringBuilder livro = new StringBuilder();
        livro.append( titulo + "\n");

        return livro.toString();

    }


 */
    public void gravar(String caminho) {
        try {
            FileWriter writer = new FileWriter(caminho,true);
            writer.write( titulo + "\n" );
            writer.close();
            System.out.println("livro cadastrado");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
      /**
       * @return esse metodo retorna os livros cadastrado na biblioteca em tempo real
       * ou seja , se eu cadastra um livro no seguinte arquivo no mesmo estante em que um aluno queira pegalo
       * ele ja estara disponivel
       * usando o File e BufferReader para percorrer o seguinte arquivo.
       */
     public void Livrosdisponiveis() throws IOException {
        try{
            FileReader arq = new FileReader("src/Biblio/testar/livros");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            while (linha != null){
                System.out.printf("%s\n", linha);

                linha = lerArq.readLine();

            }
            arq.close();
        }catch (IOException e){
            System.out.println("Erro na abertura do arquivo");
              e.getMessage();

        }
         System.out.println();
     }

     /**
      * @return  Esse metodo tem como função retorna o numero de linhas do arquivo
      * ja que o mesmo precisa percorrer ele para pegar todos os livros inclusive os que foram cadastrado naquele momento
      * com o retorno da quantidade de linha e posssivel sabe percorrer de forma correta
      * ja que não sabemos o numero exato de linhas disponiveis
      */
    public int numberLinhas() throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader("src/Biblio/testar/livros"));
        lnr.skip(Long.MAX_VALUE);
        int retorno = lnr.getLineNumber();
        return retorno;
    }




}
