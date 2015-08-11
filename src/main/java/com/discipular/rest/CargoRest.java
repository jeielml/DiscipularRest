package com.discipular.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.discipular.entity.Cargo;
import com.discipular.service.CRUDService;
import com.discipular.service.CargoService;

@Path("cargo")
public class CargoRest extends CRUDRest<Cargo> {
	
	@Inject
	private CargoService cargoService;

	@Override
	public CRUDService<Cargo> getService() {
		return cargoService;
	}
	
}