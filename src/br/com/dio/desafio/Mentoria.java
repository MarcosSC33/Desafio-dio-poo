package br.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	private LocalDate data;
	
	@Override
	public Double calcularXP() {
		return XP_PADRAO + 20d;
	}
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "\n Titulo=" + getTitulo() + "\n Descricao=" + getDescricao() + "]";
	}
}
