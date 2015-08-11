package com.discipular.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.discipular.entity.Revista;
import com.discipular.service.CRUDService;
import com.discipular.service.RevistaService;

@Path("revista")
public class RevistaRest extends CRUDRest<Revista> {
	
	@Inject
	private RevistaService revistaService;

	@Override
	public CRUDService<Revista> getService() {
		return revistaService;
	}
	
}