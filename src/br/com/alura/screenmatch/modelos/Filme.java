package br.com.alura.screenmatch.modelos;

public class Filme {
    public String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    int totalDeAvalicoes;
    int duracaoEmMinutos;

    public int getTotalDeAvalicoest(){
        return totalDeAvalicoes;
    }

    public void exibirFichaTecnica(){
        System.out.println(nome);
        System.out.println(anoDeLancamento);
        System.out.println(duracaoEmMinutos);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvalicoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvalicoes;
    }
}
