package com.discipular.rest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.discipular.entity.enuns.Confirmacao;

@Path("confirmacoes")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class ConfirmacaoRest {
    
    @GET
    public List<Confirmacao> listaConfirmacoes() {
        return Arrays.asList(Confirmacao.values());
    }
	
}