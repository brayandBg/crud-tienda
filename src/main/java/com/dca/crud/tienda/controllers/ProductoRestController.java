package com.dca.crud.tienda.controllers;


import com.dca.crud.tienda.models.entity.Producto;
import com.dca.crud.tienda.models.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/producto")
public class ProductoRestController {



    @Autowired
    private IProductoService prodSer;

    @GetMapping("/listar")
    public List <Producto> index(){
        return prodSer.findAll();

    }

    @GetMapping("/buscar/{id}")
    public Producto finById(@PathVariable Long id){
        return prodSer.findById(id);
    }

    @PostMapping("/crea")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto crear(@RequestBody Producto p){
        return prodSer.save(p);
    }

    @PutMapping("/edit/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto edit(@RequestBody Producto p, @PathVariable Long id){

        Producto prod = prodSer.findById(id);
        prod.setId(p.getId());
        prod.setName(p.getName());
        prod.setDescpri(p.getDescpri());
        prod.setPrecio(p.getPrecio());
        prod.setUnidad(p.getUnidad());

        return prodSer.save(prod);
    }

    @DeleteMapping("/del/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void del(@PathVariable Long id){
        prodSer.del(id);
    }

}