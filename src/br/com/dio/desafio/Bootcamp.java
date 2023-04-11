package br.com.dio.desafio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp{
	
	private String nome;
	private String descricao;
	private final LocalDate inicioDate = LocalDate.now();
	private final LocalDate fimDate = inicioDate.plusDays(45);
	private Set<Dev> devsIncritoSet = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Set<Dev> getDevsIncritoSet() {
		return devsIncritoSet;
	}
	public void setDevsIncritoSet(Set<Dev> devsIncritoSet) {
		this.devsIncritoSet = devsIncritoSet;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	public LocalDate getInicioDate() {
		return inicioDate;
	}
	public LocalDate getFimDate() {
		return fimDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(conteudos, devsIncritoSet);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(devsIncritoSet, other.devsIncritoSet);
	}
	
	
}
