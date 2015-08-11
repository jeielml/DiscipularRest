package com.discipular.service.impl;

import javax.ejb.Stateless;

import com.discipular.entity.Pessoa;
import com.discipular.service.PessoaService;

@Stateless
public class PessoaServiceImpl extends CRUDServiceImpl<Pessoa> implements PessoaService {

	private static final long serialVersionUID = 1L;
	
}