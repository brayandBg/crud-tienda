package com.dca.crud.tienda.models.services;

import com.dca.crud.tienda.models.entity.Producto;

import java.util.List;



public interface IProductoService {
    public List<Producto> findAll();

    public Producto findById(long id);

    public Producto save (Producto p);

    public void del (Long id);
}
