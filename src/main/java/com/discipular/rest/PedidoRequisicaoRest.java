package com.discipular.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.discipular.entity.PedidoRequisicao;
import com.discipular.service.CRUDService;
import com.discipular.service.PedidoRequisicaoService;

@Path("pedidoRequisicao")
public class PedidoRequisicaoRest extends CRUDRest<PedidoRequisicao> {
	
	@Inject
	private PedidoRequisicaoService pedidoRequisicaoService;

	@Override
	public CRUDService<PedidoRequisicao> getService() {
		return pedidoRequisicaoService;
	}
	
}