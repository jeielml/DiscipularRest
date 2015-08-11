package com.discipular.service;

import java.util.List;

public interface CRUDService<T> {

	public void inserir(T entity);
	
	public void atualizar(T entity);
	
	public void excluir(int codigo);
	
	public T selecionar(int codigo);
	
	public List<T> listar();
	
}