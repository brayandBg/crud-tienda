package com.dca.crud.tienda.models.services;

import com.dca.crud.tienda.commons.models.entity.Producto;
import com.dca.crud.tienda.exception.exceptions.MasterResourceDeletedException;
import com.dca.crud.tienda.exception.exceptions.MasterResourceFieldAlreadyExistException;
import com.dca.crud.tienda.exception.exceptions.MasterResourceNotFoundException;

import java.util.List;



public interface IProductoService {
    public List<Producto> findAll();

    public Producto findById(long id) throws MasterResourceNotFoundException;

    public Producto save (Producto p) throws MasterResourceFieldAlreadyExistException;

    public void del (Long id) throws MasterResourceDeletedException;
}
