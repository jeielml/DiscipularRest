package com.discipular.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.discipular.entity.CursoTurma;
import com.discipular.service.CRUDService;
import com.discipular.service.CursoTurmaService;

@Path("cursoTurma")
public class CursoTurmaRest extends CRUDRest<CursoTurma> {
	
	@Inject
	private CursoTurmaService cursoTurmaService;

	@Override
	public CRUDService<CursoTurma> getService() {
		return cursoTurmaService;
	}
	
}