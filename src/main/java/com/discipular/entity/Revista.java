package com.discipular.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity(name = "revista")
public class Revista implements Serializable {

	private static final long serialVersionUID = 1L;

	public Revista() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_revista")
	private int codigo;

	@NotNull
	@Column(name = "edicao", nullable = false)
	private Integer edicao;

	@NotNull
	@Column(name = "titulo", length = 100, nullable = false)
	private String titulo;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_editora", nullable = false)
	private Editora editora;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Integer getEdicao() {
		return edicao;
	}

	public void setEdicao(Integer edicao) {
		this.edicao = edicao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

}