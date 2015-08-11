package com.discipular.entity.id;

import java.io.Serializable;

public class JogoJogadoresId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int jogo;
	private int jogador;
	
	public int getJogo() {
		return jogo;
	}
	
	public void setJogo(int jogo) {
		this.jogo = jogo;
	}
	
	public int getJogador() {
		return jogador;
	}
	
	public void setJogador(int jogador) {
		this.jogador = jogador;
	}
	
	@Override
	public int hashCode() {
		return jogo + jogador;
	}
	
	@Override
	public boolean equals(Object obj) {
		 if(obj instanceof JogoJogadoresId){
			 JogoJogadoresId jogoJogadoresId = (JogoJogadoresId) obj;
	            return jogoJogadoresId.jogo == jogo && jogoJogadoresId.jogador == jogador;
	        }
	 
	        return false;
	}
	
}