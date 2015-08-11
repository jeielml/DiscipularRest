package com.discipular.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.discipular.entity.PessoaLocal;
import com.discipular.service.CRUDService;
import com.discipular.service.PessoaLocalService;

@Path("pessoaLocal")
public class PessoaLocalRest extends CRUDRest<PessoaLocal> {
	
	@Inject
	private PessoaLocalService pessoaLocalService;

	@Override
	public CRUDService<PessoaLocal> getService() {
		return pessoaLocalService;
	}
	
}