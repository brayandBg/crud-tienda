package com.dca.crud.tienda.models.dao;


import com.dca.crud.tienda.commons.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaDAO extends CrudRepository <Factura, Long> {

}
