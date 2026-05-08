import java.util.ArrayList;

public class BibliotecaFavoritos {
    private ArrayList<Item> itens;

    public BibliotecaFavoritos() {
        this.itens = new ArrayList<>();
    }

    public void inclui(Item item) {
        itens.add(item);
        System.out.println(item.getTitulo() + " adicionado aos favoritos.");
    }

    public void listar() {
        System.out.println("\n=== Favoritos ===");
        for (Item item : itens) {
            // aqui mora o polimorfismo — não importa se é Livro ou Revista
            System.out.println(item.getTitulo() + " | Classificação: " + item.getClassificacao());
        }
    }

    public void listarOrdenado() {
        itens.sort((a, b) -> b.getClassificacao() - a.getClassificacao());

        System.out.println("\n=== Favoritos (por classificação) ===");
        for (Item item : itens) {
            System.out.println(item.getTitulo() + " | " + item.getClassificacao() + " pts");
        }
    }
}