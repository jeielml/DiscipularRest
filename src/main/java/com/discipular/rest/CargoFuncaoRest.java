package com.discipular.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.discipular.entity.CargoFuncao;
import com.discipular.service.CRUDService;
import com.discipular.service.CargoFuncaoService;

@Path("cargoFuncao")
public class CargoFuncaoRest extends CRUDRest<CargoFuncao> {
	
	@Inject
	private CargoFuncaoService cargoFuncaoService;

	@Override
	public CRUDService<CargoFuncao> getService() {
		return cargoFuncaoService;
	}
	
}