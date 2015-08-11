package com.discipular.entity.enuns;

public enum CreditoDebito {
    
    CREDITO("Crédito"),
    DEBITO("Débito");
    
    private String descricao;

    private CreditoDebito(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}