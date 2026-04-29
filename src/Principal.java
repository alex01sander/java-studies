import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = " O poderoso chefão";
        meuFilme.anoDeLancamento = 2015;
        meuFilme.duracaoEmMinutos = 30;

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(12);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvalicoest());
        System.out.println(meuFilme.pegaMedia());




    }
}
