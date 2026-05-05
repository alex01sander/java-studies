package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalDeReprucoes;
    private int totalDecurtidas;
    private int classificacao;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReprucoes() {
        return totalDeReprucoes;
    }

    public int getTotalDecurtidas() {
        return totalDecurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte(){
        this.totalDecurtidas++;

    }

    public void reproduz(){
        this.totalDeReprucoes++;
    }
}
