package com.discipular.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.discipular.entity.Pedido;
import com.discipular.service.CRUDService;
import com.discipular.service.PedidoService;

@Path("pedido")
public class PedidoRest extends CRUDRest<Pedido> {
	
	@Inject
	private PedidoService pedidoService;

	@Override
	public CRUDService<Pedido> getService() {
		return pedidoService;
	}
	
}