package br.com.solene.cursomc.domain;

import java.io.Serializable;

// 5 - Implementar a interface Serializable na Classe
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;
	
	// 1 - Atributos básicos
	private Integer id;
	private String nome;

	// 2 - Criando um construtor vazio
	public Categoria() {
	}

	// 3 - Criando o construtor com os atributos
	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	// Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// 4 - Criando o HashCode e Equals do campo ID
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
