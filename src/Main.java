import me.dio.desafio.dominio.Curso;
import me.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Bootcamp DIO");
        curso1.setCargaHoraria(87);

        Curso curso2 = new Curso();
        curso2.setTitulo("Desenvolvendo Java com IA");
        curso2.setDescricao("Bootcamp DIO");
        curso2.setCargaHoraria(60);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria programando com Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}