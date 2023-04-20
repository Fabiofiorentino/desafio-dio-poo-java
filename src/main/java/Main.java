import br.com.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
