package com.dca.crud.tienda.models.services.implement;

import com.dca.crud.tienda.models.dao.IProveedorDAO;
import com.dca.crud.tienda.models.entity.Proveedor;
import com.dca.crud.tienda.models.services.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServiceImpl implements IProveedorService {

    @Autowired
    private IProveedorDAO dao;

    @Override
    public List<Proveedor> findAll() {
        return (List<Proveedor>) dao.findAll();
    }

    @Override
    public Proveedor findById(long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public Proveedor save(Proveedor p) {
        return dao.save(p);
    }

    @Override
    public void del(Long id) {
        dao.deleteById(id);

    }
}
