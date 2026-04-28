public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvalicoes;
    int duracaoEmMinutos;

    void exibirFichaTecnica(){
        System.out.println(nome);
        System.out.println(anoDeLancamento);
        System.out.println(duracaoEmMinutos);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvalicoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvalicoes;
    }
}
