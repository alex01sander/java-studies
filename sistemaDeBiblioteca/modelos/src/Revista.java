public class Revista extends Item{
    private int edicao;
    private String tema;

    public Revista(String titulo, double valorMulta, int edicao, String tema) {
        super(titulo, valorMulta);
        this.edicao = edicao;
        this.tema = tema;
    }

    @Override
    public int getClassificacao() {
        if(this.edicao > 100){
            return 10;
        }else if(this.edicao > 50){
            return 8;
        }else{
            return 6;
        }

    }
}
