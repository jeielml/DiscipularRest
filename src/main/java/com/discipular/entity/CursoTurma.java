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

@Entity(name = "curso_turma")
public class CursoTurma implements Serializable {

	private static final long serialVersionUID = 1L;

	public CursoTurma() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_curso_turma")
	private int codigo;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_curso", nullable = false)
	private Curso curso;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_turma", nullable = false)
	private Turma turma;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

}