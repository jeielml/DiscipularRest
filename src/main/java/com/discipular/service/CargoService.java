package com.discipular.service;

import javax.ejb.Local;

import com.discipular.entity.Cargo;

@Local
public interface CargoService extends CRUDService<Cargo> {

}