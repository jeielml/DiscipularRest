package com.discipular.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.discipular.entity.Funcao;
import com.discipular.service.CRUDService;
import com.discipular.service.FuncaoService;

@Path("funcao")
public class FuncaoRest extends CRUDRest<Funcao> {
	
	@Inject
	private FuncaoService funcaoService;

	@Override
	public CRUDService<Funcao> getService() {
		return funcaoService;
	}
	
}