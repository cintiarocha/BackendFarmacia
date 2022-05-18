package com.farmacia.farmacia.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class CategoriaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}

	public String getHigiene() {
		return higiene;
	}

	public void setHigiene(String higiene) {
		this.higiene = higiene;
	}

	private String medicamento;
	
	private String higiene;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private String nome;
	
	@OneToMany(mappedBy = "categoria",cascade = CascadeType.ALL)
	@JsonIgnoreProperties ("categoria")
	private List<ProdutoModel> produto;
	
	
	

}
