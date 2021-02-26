package com.dca.crud.tienda.models.dao;

import com.dca.crud.tienda.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IProductoDAO extends CrudRepository<Producto, Long> {
}
