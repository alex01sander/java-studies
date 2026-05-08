public class Item {
    private String titulo;
    private double valorMulta;
    private boolean emprestado;
    private int classificacao;

    public Item(String titulo, double valorMulta) {
        this.titulo = titulo;
        this.valorMulta = valorMulta;
        this.emprestado = false;
    }

    public Item() {
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public int getClassificacao() {
        return classificacao;
    }


    @Override
    public String toString() {
        return "Item{" +
                "titulo='" + titulo + '\'' +
                ", valorMulta=" + valorMulta +
                '}';
    }
}
