import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	Curso curso1 = new Curso();
	curso1.setTitulo("Curso Java");
	curso1.setDescricao("Descrição curso Java");
	curso1.setCargaHoraria(8);

	Curso curso2 = new Curso();
	curso2.setTitulo("Curso Angular");
    curso2.setDescricao("Descrição curso Angular");
    curso2.setCargaHoraria(4);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria de java");
    mentoria.setDescricao("Descrição mentoria Java");
    mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
       // System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());

        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());


        System.out.println("----------------");

        Dev devRosiris = new Dev();
        devRosiris.setNome("Rosiris");
        devRosiris.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rosiris:" + devRosiris.getConteudosInscritos());

        devRosiris.progredir();
        devRosiris.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rosiris:" + devRosiris.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rosiris:" + devRosiris.getConteudosConcluidos());
        System.out.println("Conteúdos Concluídos Rosiris:" + devRosiris.ordenaConteudoTitulo(devRosiris.getConteudosConcluidos()));
        System.out.println("XP:" + devRosiris.calcularTotalXp());


    }
}
