package com.discipular.entity.enuns;

public enum Perfil {
    
	SPT("Suporte"),
    ADM("Administrador"),
    USU("Usuário");
    
    private String descricao;

    private Perfil(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}