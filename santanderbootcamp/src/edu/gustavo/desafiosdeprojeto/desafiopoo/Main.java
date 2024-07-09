package edu.gustavo.desafiosdeprojeto.desafiopoo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso ();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso php");
        curso2.setDescricao("descricao curso php");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        List<String> palavras = new ArrayList<>(); 

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descricao curso php");
        mentoria.setData(LocalDate.now());

        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JavaDeveloper");
        bootcamp.setDescricao("Descrição Bootcamp JavaDeveloper");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devGustavo.getConteudosInscritos());

        devGustavo.progredir();
        System.out.println("--- Progrediu ---");
        System.out.println("Conteudos Inscritos" + devGustavo.getConteudosInscritos());
        System.out.println("Conteudos Concluídos" + devGustavo.getConteudosConcluidos());
        System.out.println("XP" + devGustavo.calcularTotalXp());
        
        System.out.println("-------------------------");

        Dev devGabriela = new Dev();
        devGabriela.setNome("Gabriela");
        devGabriela.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devGabriela.getConteudosInscritos());

        devGabriela.progredir();
        devGabriela.progredir();
        devGabriela.progredir();
        System.out.println("--- Progrediu ---");
        System.out.println("Conteudos Inscritos" + devGabriela.getConteudosInscritos());
        System.out.println("Conteudos Concluídos"  + devGabriela.getConteudosConcluidos());
        System.out.println("XP" + devGabriela.calcularTotalXp());

    }


}
