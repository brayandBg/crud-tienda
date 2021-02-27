package com.dca.crud.tienda.models.services;

import com.dca.crud.tienda.commons.models.entity.Proveedor;
import com.dca.crud.tienda.exception.exceptions.MasterResourceDeletedException;
import com.dca.crud.tienda.exception.exceptions.MasterResourceFieldAlreadyExistException;
import com.dca.crud.tienda.exception.exceptions.MasterResourceNotFoundException;

import java.util.List;


public interface IProveedorService {
    public List<Proveedor> findAll();

    public Proveedor findById(long id) throws MasterResourceNotFoundException;

    public Proveedor save (Proveedor p) throws MasterResourceFieldAlreadyExistException;

    public void del (Long id) throws MasterResourceDeletedException;
}
