package br.com.dio.desafio.dominio;

public abstract class Conteudo {
	
	protected static final double XP_PADRAO = 10d;
	
	private String titulo;
	private String desricao;
	
	public abstract double calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return desricao;
	}

	public void setDesricao(String desricao) {
		this.desricao = desricao;
	}
	
}
