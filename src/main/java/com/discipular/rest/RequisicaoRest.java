package com.discipular.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.discipular.entity.Requisicao;
import com.discipular.service.CRUDService;
import com.discipular.service.RequisicaoService;

@Path("requisicao")
public class RequisicaoRest extends CRUDRest<Requisicao> {
	
	@Inject
	private RequisicaoService requisicaoService;

	@Override
	public CRUDService<Requisicao> getService() {
		return requisicaoService;
	}
	
}