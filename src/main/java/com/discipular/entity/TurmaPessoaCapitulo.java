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

@Entity(name = "turma_pessoa_capitulo")
public class TurmaPessoaCapitulo implements Serializable {

	private static final long serialVersionUID = 1L;

	public TurmaPessoaCapitulo() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_turma_pessoa_capitulo")
	private int codigo;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_turma_pessoa", nullable = false)
	private TurmaPessoa turmaPessoa;

	// TODO falta criar o indice único
	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_capitulo", nullable = false)
	private Capitulo capitulo;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_ministrante", nullable = false)
	private Pessoa ministrante;

	@ManyToOne
	@JoinColumn(name = "id_local", nullable = false)
	private Local local;

	@NotNull
	@Column(name = "dt_planejada", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dtPlanejada;

	@Column(name = "dt_executada")
	@Temporal(TemporalType.DATE)
	private Date dtExecutada;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public TurmaPessoa getTurmaPessoa() {
		return turmaPessoa;
	}

	public void setTurmaPessoa(TurmaPessoa turmaPessoa) {
		this.turmaPessoa = turmaPessoa;
	}

	public Capitulo getCapitulo() {
		return capitulo;
	}

	public void setCapitulo(Capitulo capitulo) {
		this.capitulo = capitulo;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Date getDtPlanejada() {
		return dtPlanejada;
	}

	public void setDtPlanejada(Date dtPlanejada) {
		this.dtPlanejada = dtPlanejada;
	}

	public Date getDtExecutada() {
		return dtExecutada;
	}

	public void setDtExecutada(Date dtExecutada) {
		this.dtExecutada = dtExecutada;
	}

	public Pessoa getMinistrante() {
		return ministrante;
	}

	public void setMinistrante(Pessoa ministrante) {
		this.ministrante = ministrante;
	}

	
}