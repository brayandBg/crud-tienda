package com.dca.crud.tienda.models.dao;


import com.dca.crud.tienda.commons.models.entity.Proveedor;
import org.springframework.data.repository.CrudRepository;

public interface IProveedorDAO extends CrudRepository<Proveedor, Long> {
}
