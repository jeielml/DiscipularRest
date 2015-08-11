package com.discipular.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.discipular.entity.TurmaPessoa;
import com.discipular.service.CRUDService;
import com.discipular.service.TurmaPessoaService;

@Path("turmaPessoa")
public class TurmaPessoaRest extends CRUDRest<TurmaPessoa> {
	
	@Inject
	private TurmaPessoaService turmaPessoaService;

	@Override
	public CRUDService<TurmaPessoa> getService() {
		return turmaPessoaService;
	}
	
}