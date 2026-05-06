package praticando.exercicio;

public class Musculacao extends Treino{
    private String grupoMuscular;
    private int cargaMedia;

    public String getGrupoMuscular() {
        return grupoMuscular;
    }

    public void setGrupoMuscular(String grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }

    public int getCargaMedia() {
        return cargaMedia;
    }

    public void setCargaMedia(int cargaMedia) {
        this.cargaMedia = cargaMedia;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalParticipacoes() > 10){
            return 10;
        }else {
            return 7;
        }
    }
}
