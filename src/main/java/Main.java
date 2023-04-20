import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Introdução a linguagem Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Introdução a linguagem JavaScript");
        curso2.setCargaHoraria(6);

        Mentoria mentoria1 = new Mentoria("mentoria Java", "mentor do curso Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda tudo sobre Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devFabio = new Dev();
        devFabio.setNome("Fabio");
        devFabio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devFabio.getConteudosInscritos());
        devFabio.progredir();
        devFabio.progredir();
        System.out.println("Conteudos inscritos: " + devFabio.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devFabio.getConteudosConcluidos());
        System.out.println("XP: " + devFabio.calcularTotalXp());
    }
}
