package com.discipular.entity.enuns;

public enum Confirmacao {
    
    SIM("Confirmado"),
    NAO("Não confirmado");
    
    private String descricao;

    private Confirmacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}