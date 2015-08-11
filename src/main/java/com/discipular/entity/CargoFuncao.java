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

@Entity(name = "cargo_funcao")
public class CargoFuncao implements Serializable {

	private static final long serialVersionUID = 1L;

	public CargoFuncao() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cargo_funcao")
	private int codigo;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_funcao", nullable = false)
	private Funcao funcao;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_cargo", nullable = false)
	private Cargo cargo;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

}