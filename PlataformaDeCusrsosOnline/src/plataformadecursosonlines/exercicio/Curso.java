package plataformadecursosonlines.exercicio;

public class Curso extends Conteudo{
    private String professor;
    private int cargaHoraria;

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalVisualizacoes() > 50){
            return 10;
        }else{
            return 20;
        }
    }
}
