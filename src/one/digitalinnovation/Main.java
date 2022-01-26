package one.digitalinnovation;

import one.digitalinnovation.dominio.Bootcamp;
import one.digitalinnovation.dominio.Curso;
import one.digitalinnovation.dominio.Dev;
import one.digitalinnovation.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso c1 = new Curso("Curso de Java", "Descrição do curso de Java", 8);
        Curso c2 = new Curso("Curso de js", "Descrição do curso de js", 4);

        Mentoria m = new Mentoria("Mentoria de Java", "Descrição da mentoria de Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição do Bootcamp Java Developer");
        bootcamp.adicionarConteudo(c1);
        bootcamp.adicionarConteudo(c2);
        bootcamp.adicionarConteudo(m);

        Dev dev1 = new Dev("Maria");
        dev1.inscreverBootcamp(bootcamp);

        System.out.println(String.format("Conteúdos Inscritos do %s:", dev1.getNome()));
        dev1.exibirConteudosInscritos();
        System.out.println("-------------------------------------------------------");

        dev1.progredir();
        dev1.progredir();

        System.out.println(String.format("Conteúdos Concluídos do %s:", dev1.getNome()));
        dev1.exibirConteudosConcluidos();
        System.out.println("-------------------------------------------------------");

        System.out.println("XP:" + dev1.calcularTotalXp());
        System.out.println("-------------------------------------------------------");

        System.out.println(String.format("Conteúdos Inscritos do %s:", dev1.getNome()));
        dev1.exibirConteudosInscritos();
        System.out.println("-------------------------------------------------------");

        Dev dev2 = new Dev("João");
        dev2.inscreverBootcamp(bootcamp);

        System.out.println(String.format("Conteúdos Inscritos do %s:", dev2.getNome()));
        dev2.exibirConteudosInscritos();
        System.out.println("-------------------------------------------------------");

        dev2.progredir();

        System.out.println(String.format("Conteúdos Concluídos do %s:", dev2.getNome()));
        dev2.exibirConteudosConcluidos();
        System.out.println("-------------------------------------------------------");

        System.out.println("XP:" + dev2.calcularTotalXp());
        System.out.println("-------------------------------------------------------");

        System.out.println(String.format("Conteúdos Inscritos do %s:", dev2.getNome()));
        dev2.exibirConteudosInscritos();
        System.out.println("-------------------------------------------------------");

        System.out.println(String.format("Lista de Devs Inscritos no %s:", bootcamp.getNome()));
        bootcamp.exibirDevsInscritos();

        System.out.println("-------------------------------------------------------");

        System.out.println(String.format("Lista de Conteúdos do %s:", bootcamp.getNome()));
        bootcamp.exibirConteudos();


    }
}
