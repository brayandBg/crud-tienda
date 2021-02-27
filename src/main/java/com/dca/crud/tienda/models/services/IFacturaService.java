package com.dca.crud.tienda.models.services;

import com.dca.crud.tienda.commons.models.entity.Factura;
import com.dca.crud.tienda.exception.exceptions.MasterResourceDeletedException;
import com.dca.crud.tienda.exception.exceptions.MasterResourceFieldAlreadyExistException;
import com.dca.crud.tienda.exception.exceptions.MasterResourceNotFoundException;

import java.util.List;

public interface IFacturaService {
    public List<Factura> findAll();

    public Factura findById(long id) throws MasterResourceNotFoundException;

    public Factura save (Factura f) throws MasterResourceFieldAlreadyExistException;

    public void del (Long id) throws MasterResourceDeletedException;
}
