package com.dca.crud.tienda.controllers;


import com.dca.crud.tienda.models.entity.Proveedor;
import com.dca.crud.tienda.models.services.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/proveedor")
public class ProveedorRestController {



    @Autowired
    private IProveedorService proveSer;

    @GetMapping("/listar")
    public List <Proveedor> index(){
        return proveSer.findAll();

    }

    @GetMapping("/buscar/{id}")
    public Proveedor finById(@PathVariable Long id){
        return proveSer.findById(id);
    }

    @PostMapping("/crea")
    @ResponseStatus(HttpStatus.CREATED)
    public Proveedor crear(@RequestBody Proveedor p){
        return proveSer.save(p);
    }

    @PutMapping("/edit/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Proveedor edit(@RequestBody Proveedor p, @PathVariable Long id){
        Proveedor pro = proveSer.findById(id);
        pro.setId(p.getId());
        pro.setName(p.getName());

        return proveSer.save(pro);
    }

    @DeleteMapping("/del/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void del(@PathVariable Long id){
        proveSer.del(id);
    }

}
