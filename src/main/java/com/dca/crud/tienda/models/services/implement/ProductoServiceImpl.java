package com.dca.crud.tienda.models.services.implement;

import com.dca.crud.tienda.commons.models.entity.Producto;
import com.dca.crud.tienda.exception.exceptions.MasterResourceDeletedException;
import com.dca.crud.tienda.exception.exceptions.MasterResourceFieldAlreadyExistException;
import com.dca.crud.tienda.exception.exceptions.MasterResourceNotFoundException;
import com.dca.crud.tienda.models.dao.IProductoDAO;
import com.dca.crud.tienda.models.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private IProductoDAO dao;
    private Producto p;

    @Override
    public List<Producto> findAll() {
        return (List<Producto>) dao.findAll();
    }

    @Override
    public Producto findById(long id) throws MasterResourceNotFoundException {
        p = dao.findById(id).orElse(null);
        if (p == null){
            throw new MasterResourceNotFoundException();
        }
        return p;
    }

    @Override
    public Producto save(Producto p) {
        return dao.save(p);
    }

    @Override
    public void del(Long id) throws MasterResourceDeletedException {

        try {
            dao.deleteById(id);
        }catch (Exception e){
            throw new MasterResourceDeletedException(e.getLocalizedMessage());
        }
    }
}
