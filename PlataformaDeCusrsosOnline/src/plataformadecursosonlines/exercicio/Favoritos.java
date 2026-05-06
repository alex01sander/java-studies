package plataformadecursosonlines.exercicio;

public class Favoritos {
    public void inclui(Conteudo conteudo){
        if(conteudo.getClassificacao() > 50){
            System.out.println("Nota alta pelas Visualizações");
        } else if (conteudo.getClassificacao() > 80) {
            System.out.println("Nota alta pelas Curtidas");

        }else{
            System.out.println("Nota baixa em ambas");
        }
    }
}
