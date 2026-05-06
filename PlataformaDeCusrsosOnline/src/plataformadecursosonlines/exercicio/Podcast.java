package plataformadecursosonlines.exercicio;

public class Podcast extends Conteudo{
    private String apresentador;
    private int numeroEpisodio;

    public String getApresentador( ) {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() > 50){
            return 10;

        }else{
            return 8;
        }
    }
}
