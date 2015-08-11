package com.discipular.service;

import javax.ejb.Local;

import com.discipular.entity.Pessoa;

@Local
public interface PessoaService extends CRUDService<Pessoa> {

}