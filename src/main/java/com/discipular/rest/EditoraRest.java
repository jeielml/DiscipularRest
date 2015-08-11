package com.discipular.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.discipular.entity.Editora;
import com.discipular.service.CRUDService;
import com.discipular.service.EditoraService;

@Path("editora")
public class EditoraRest extends CRUDRest<Editora> {
	
	@Inject
	private EditoraService editoraService;

	@Override
	public CRUDService<Editora> getService() {
		return editoraService;
	}
	
}