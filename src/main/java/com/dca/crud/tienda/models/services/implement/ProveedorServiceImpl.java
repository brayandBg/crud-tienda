package com.dca.crud.tienda.models.services.implement;

import com.dca.crud.tienda.commons.models.entity.Proveedor;
import com.dca.crud.tienda.exception.exceptions.MasterResourceDeletedException;
import com.dca.crud.tienda.exception.exceptions.MasterResourceFieldAlreadyExistException;
import com.dca.crud.tienda.exception.exceptions.MasterResourceNotFoundException;
import com.dca.crud.tienda.models.dao.IProveedorDAO;
import com.dca.crud.tienda.models.services.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServiceImpl implements IProveedorService {

    @Autowired
    private IProveedorDAO dao;
    private Proveedor p;

    @Override
    public List<Proveedor> findAll() {
        return (List<Proveedor>) dao.findAll();
    }

    @Override
    public Proveedor findById(long id) throws MasterResourceNotFoundException {
        p = dao.findById(id).orElse(null);
        if (p == null){
            throw new MasterResourceNotFoundException();
        }
        return p;
    }

    @Override
    public Proveedor save(Proveedor p) {
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
