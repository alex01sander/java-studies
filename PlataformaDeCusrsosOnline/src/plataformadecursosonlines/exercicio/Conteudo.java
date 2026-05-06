package plataformadecursosonlines.exercicio;

public class Conteudo {
    private String titulo;
    private int totalVisualizacoes;
    private int totalCurtidas;

    public int getClassificacao() {
        return classificacao;
    }

    private int classificacao;

    public String getTitulo(String podpah) {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }

    public void curtir(){
        totalCurtidas++;

    }

    public void visualizar(){
        totalVisualizacoes++;
    }


}
