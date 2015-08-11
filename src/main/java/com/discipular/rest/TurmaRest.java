package com.discipular.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.discipular.entity.Turma;
import com.discipular.service.CRUDService;
import com.discipular.service.TurmaService;

@Path("turma")
public class TurmaRest extends CRUDRest<Turma> {
	
	@Inject
	private TurmaService turmaService;

	@Override
	public CRUDService<Turma> getService() {
		return turmaService;
	}
	
}