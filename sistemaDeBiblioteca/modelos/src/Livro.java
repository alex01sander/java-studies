public class Livro extends Item{
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, double valorMulta, String autor, int numeroPaginas) {
        super(titulo, valorMulta);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public int getClassificacao() {
        if(this.getClassificacao() > 100){
            return 100;
        }else {
            return 50;
        }
    }
}
