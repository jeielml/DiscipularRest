package com.discipular.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.discipular.entity.Local;
import com.discipular.service.CRUDService;
import com.discipular.service.LocalService;

@Path("local")
public class LocalRest extends CRUDRest<Local> {
	
	@Inject
	private LocalService localService;

	@Override
	public CRUDService<Local> getService() {
		return localService;
	}
	
}