import me.dio.desafio.dominio.*;

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

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria programando com Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer realizado pela DIO");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Marcos");
        dev.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos de Marcos: " + dev.getConteudosInscritos());
        System.out.println("-");
        dev.progredir();
        dev.progredir();
        dev.progredir();
        System.out.println("Conteúdos concluídos de Marcos: " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());

        System.out.println("==========");

        Dev dev2 = new Dev();
        dev2.setNome("Vinicius");
        dev2.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos de Vinicius: " + dev2.getConteudosInscritos());
        System.out.println("-");
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos concluídos de Vinicius: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}