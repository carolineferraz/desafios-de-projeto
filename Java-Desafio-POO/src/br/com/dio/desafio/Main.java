package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
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
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
		
	}

}
