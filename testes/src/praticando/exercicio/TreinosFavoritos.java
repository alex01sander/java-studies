package praticando.exercicio;

public class TreinosFavoritos {

    public void inclui(Treino treino) {

        if (treino.getClassificacao() >= 10) {
            System.out.println("Treino em destaque na academia!");
        } else if (treino.getClassificacao() >= 8) {
            System.out.println("Treino muito bem avaliado!");
        } else {
            System.out.println("Treino comum, continue evoluindo.");
        }

    }
}