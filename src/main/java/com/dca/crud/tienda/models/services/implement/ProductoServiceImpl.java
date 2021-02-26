package com.dca.crud.tienda.models.services.implement;

import com.dca.crud.tienda.models.dao.IProductoDAO;
import com.dca.crud.tienda.models.entity.Producto;
import com.dca.crud.tienda.models.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private IProductoDAO dao;

    @Override
    public List<Producto> findAll() {
        return (List<Producto>) dao.findAll();
    }

    @Override
    public Producto findById(long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public Producto save(Producto p) {
        return dao.save(p);
    }

    @Override
    public void del(Long id) {
        dao.deleteById(id);
    }
}
