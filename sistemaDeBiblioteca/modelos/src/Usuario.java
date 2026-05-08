import java.util.ArrayList;

public class Usuario extends Item{
    private String nome;
    private ArrayList<Item> emprestimos;

    public Usuario(String nome) {
        this.nome = nome;
        this.emprestimos = new ArrayList<>();
    }

    public void pegarEmprestimo(Item item){
        if(item.isEmprestado()){
            System.out.println("Item já está emprestado");
            return;
        }

        item.setEmprestado(true);
        emprestimos.add(item);
        System.out.println(item.getTitulo() + " emprestado para" + nome);
    }

    public void devolver(Item item){
        if(!emprestimos.contains(item)){
            System.out.println("Esse item não está com você");
            return;
        }
        emprestimos.remove(item);
        item.setEmprestado(false);
        System.out.println(item.getTitulo() + " devolvido para" + nome);
    }

    public ArrayList<Item> getEmprestimos(){
        return emprestimos;
    }

    public String getNome(){
        return nome;
    }

}
