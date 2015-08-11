package com.discipular.rest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.discipular.entity.enuns.Perfil;

@Path("perfis")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class PerfilRest {
    
    @GET
    public List<Perfil> listaPerfis() {
        return Arrays.asList(Perfil.values());
    }
	
}