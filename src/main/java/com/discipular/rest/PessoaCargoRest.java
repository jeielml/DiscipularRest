package com.discipular.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.discipular.entity.PessoaCargo;
import com.discipular.service.CRUDService;
import com.discipular.service.PessoaCargoService;

@Path("pessoaCargo")
public class PessoaCargoRest extends CRUDRest<PessoaCargo> {
	
	@Inject
	private PessoaCargoService pessoaCargoService;

	@Override
	public CRUDService<PessoaCargo> getService() {
		return pessoaCargoService;
	}
	
}