package praticando.exercicio;

public class Cardio extends Treino {
    private String tipoCardio;
    private double distanciaKm;

    public String getTipoCardio() {
        return tipoCardio;
    }

    public void setTipoCardio(String tipoCardio) {
        this.tipoCardio = tipoCardio;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    @Override
    public int getClassificacao() {
        if(this.getCaloriasQueimadas() > 100) {
            return 100;
        }else {
            return 50;
        }
    }
}
