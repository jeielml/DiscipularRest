package com.discipular.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity(name = "turma")
public class Turma implements Serializable {

	private static final long serialVersionUID = 1L;

	public Turma() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_turma")
	private int codigo;

	@NotNull
	@Column(name = "dt_inicio_planejada", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dtInicioPlanejada;

	@NotNull
	@Column(name = "dt_fim_planejada", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dtFimPlanejada;

	@Column(name = "dt_inicio_executada")
	@Temporal(TemporalType.DATE)
	private Date dtInicioExecutada;

	@Column(name = "dt_fim_executada")
	@Temporal(TemporalType.DATE)
	private Date dtFimExecutada;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_local", nullable = false)
	private Local local;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getDtInicioPlanejada() {
		return dtInicioPlanejada;
	}

	public void setDtInicioPlanejada(Date dtInicioPlanejada) {
		this.dtInicioPlanejada = dtInicioPlanejada;
	}

	public Date getDtFimPlanejada() {
		return dtFimPlanejada;
	}

	public void setDtFimPlanejada(Date dtFimPlanejada) {
		this.dtFimPlanejada = dtFimPlanejada;
	}

	public Date getDtInicioExecutada() {
		return dtInicioExecutada;
	}

	public void setDtInicioExecutada(Date dtInicioExecutada) {
		this.dtInicioExecutada = dtInicioExecutada;
	}

	public Date getDtFimExecutada() {
		return dtFimExecutada;
	}

	public void setDtFimExecutada(Date dtFimExecutada) {
		this.dtFimExecutada = dtFimExecutada;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

}