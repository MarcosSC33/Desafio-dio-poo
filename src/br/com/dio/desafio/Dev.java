package br.com.dio.desafio;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


public class Dev {
	
	private String nome;
	private int cont =0;
	private Set<Conteudo> conteudosInscrito = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	public void inscreverBootcamp(Bootcamp bc) {
		this.conteudosInscrito.addAll(bc.getConteudos());
		bc.getDevsIncritoSet().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = conteudosInscrito.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscrito.remove(conteudo.get());
			cont++;
		}else System.out.println("Nenhum curso foi encontrado.");
	}
	
	public Double calcularTotalXP() {
		Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			Double next = iterator.next().calcularXP();
			soma += next;
		}
		return soma;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Conteudo> getConteudosInscrito() {
		return conteudosInscrito;
	}
	public void setConteudosInscrito(Set<Conteudo> conteudosInscrito) {
		this.conteudosInscrito = conteudosInscrito;
	}
	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}
	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluido) {
		this.conteudosConcluidos = conteudosConcluido;
	}
	
	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscrito);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscrito, other.conteudosInscrito);
	}
}
