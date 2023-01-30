package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("POO e fundamentos Java");
		curso1.setDesricao("Aprenda POO em Java com toda a teoria fundamental e muita prática.");
		curso1.setCargaHoraria(20);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("APIs REST com Java e Spring Boot");
		curso2.setDesricao("Desenvolva suas primeiras APIs em Java utilizando o framework Spring Boot.");
		curso2.setCargaHoraria(20);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDesricao("Mentoria de Java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devCarol = new Dev();
        devCarol.setNome("Carol");
        devCarol.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Carol:" + devCarol.getConteudosInscritos());
        devCarol.progredir();
        devCarol.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Carol:" + devCarol.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Carol:" + devCarol.getConteudosConcluidos());
        System.out.println("XP:" + devCarol.calcularTotalXp());
		
        System.out.println("---------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
		
	}

}
