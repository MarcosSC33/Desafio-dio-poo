package br.com.dio.desafio;

public class Curso extends Conteudo{
	
	private int cargaHoraria;

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public Double calcularXP() {
		return (Double)(XP_PADRAO * cargaHoraria);
	}
	
	@Override
	public String toString() {
		return "[cargaHoraria=" + cargaHoraria + "\n Titulo=" + getTitulo() + "\n Descricao="
				+ getDescricao() + "]";
	}

}
