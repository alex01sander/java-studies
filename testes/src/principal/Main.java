package principal;

import praticando.exercicio.Cardio;
import praticando.exercicio.Musculacao;
import praticando.exercicio.TreinosFavoritos;

public class Main {
    public static void main(String[] args) {

        Musculacao musculacao = new Musculacao();
        musculacao.setNome("Treino de Pernas");
        musculacao.setDuracaoMinutos(60);
        musculacao.setCaloriasQueimadas(250);
        musculacao.setTotalParticipacoes(15);
        musculacao.setGrupoMuscular("Coxas");
        musculacao.setCargaMedia(40);

        Cardio cardio = new Cardio();
        cardio.setNome("Corrida na Esteira");
        cardio.setDuracaoMinutos(45);
        cardio.setCaloriasQueimadas(350);
        cardio.setTotalParticipacoes(8);
        cardio.setTipoCardio("Corrida");
        cardio.setDistanciaKm(5.5);

        TreinosFavoritos favoritos = new TreinosFavoritos();

        favoritos.inclui(musculacao);
        favoritos.inclui(cardio);
    }
}