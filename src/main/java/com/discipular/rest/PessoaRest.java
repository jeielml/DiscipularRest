package com.discipular.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.discipular.entity.Pessoa;
import com.discipular.service.CRUDService;
import com.discipular.service.PessoaService;

@Path("pessoa")
public class PessoaRest extends CRUDRest<Pessoa> {
	
	@Inject
	private PessoaService pessoaService;

	@Override
	public CRUDService<Pessoa> getService() {
		return pessoaService;
	}
	
}