package com.dca.crud.tienda.models.services;

import com.dca.crud.tienda.models.entity.Proveedor;

import java.util.List;


public interface IProveedorService {
    public List<Proveedor> findAll();

    public Proveedor findById(long id);

    public Proveedor save (Proveedor p);

    public void del (Long id);
}
