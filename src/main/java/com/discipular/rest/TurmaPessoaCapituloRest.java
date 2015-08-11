package com.discipular.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.discipular.entity.TurmaPessoaCapitulo;
import com.discipular.service.CRUDService;
import com.discipular.service.TurmaPessoaCapituloService;

@Path("turmaPessoaCapitulo")
public class TurmaPessoaCapituloRest extends CRUDRest<TurmaPessoaCapitulo> {
	
	@Inject
	private TurmaPessoaCapituloService turmaPessoaCapituloService;

	@Override
	public CRUDService<TurmaPessoaCapitulo> getService() {
		return turmaPessoaCapituloService;
	}
	
}