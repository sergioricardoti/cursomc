package br.com.solene.cursomc.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Fazendo o mapeamento da classe categoria
@Entity
public class Categoria implements Serializable {         // 7 - Implementar a interface Serializable na Classe
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;                                  // 1 - Atributos básicos
	private String nome;

	
	public Categoria() {                                 // 2 - Criando um construtor vazio
		
	}

	
	public Categoria(Integer id, String nome) {          // 3 - Criando o construtor com os atributos
		super();
		this.id = id;
		this.nome = nome;
	}

	
	public Integer getId() {                             // 4 - Getters and Setters
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

	
	@Override
	public int hashCode() {                              // 5 - Criando o HashCode do campo ID             
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override                                            // 6 - Criando o Equals do campo ID
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
