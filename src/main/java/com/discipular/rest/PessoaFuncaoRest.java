package com.discipular.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.discipular.entity.PessoaFuncao;
import com.discipular.service.CRUDService;
import com.discipular.service.PessoaFuncaoService;

@Path("pessoaFuncao")
public class PessoaFuncaoRest extends CRUDRest<PessoaFuncao> {
	
	@Inject
	private PessoaFuncaoService pessoaFuncaoService;

	@Override
	public CRUDService<PessoaFuncao> getService() {
		return pessoaFuncaoService;
	}
	
}