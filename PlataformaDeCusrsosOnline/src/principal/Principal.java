package principal;

import plataformadecursosonlines.exercicio.Curso;
import plataformadecursosonlines.exercicio.Favoritos;
import plataformadecursosonlines.exercicio.Podcast;


public class Principal {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setProfessor("Programador");
        curso.setTotalVisualizacoes(50);
        curso.setTotalCurtidas(90);

        Podcast pod = new Podcast();
        pod.setTitulo("Podcast Java");
        pod.setApresentador("Programador Alex Britto");
        pod.setNumeroEpisodio(10);

        Favoritos favoritos = new Favoritos();
        favoritos.inclui(pod);
        favoritos.inclui(curso);





    }
}
