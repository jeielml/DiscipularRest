package com.discipular.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.discipular.entity.Curso;
import com.discipular.service.CRUDService;
import com.discipular.service.CursoService;

@Path("curso")
public class CursoRest extends CRUDRest<Curso> {
	
	@Inject
	private CursoService cursoService;

	@Override
	public CRUDService<Curso> getService() {
		return cursoService;
	}
	
}