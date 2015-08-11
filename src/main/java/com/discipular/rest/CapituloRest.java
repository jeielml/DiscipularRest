package com.discipular.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.discipular.entity.Capitulo;
import com.discipular.service.CRUDService;
import com.discipular.service.CapituloService;

@Path("capitulo")
public class CapituloRest extends CRUDRest<Capitulo> {
	
	@Inject
	private CapituloService capituloService;

	@Override
	public CRUDService<Capitulo> getService() {
		return capituloService;
	}
	
}