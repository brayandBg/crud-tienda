package com.dca.crud.tienda.controllers;


import com.dca.crud.tienda.models.entity.Factura;
import com.dca.crud.tienda.models.services.IFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/factura")
public class FacturaRestController {



    @Autowired
    private IFacturaService factSer;

    @GetMapping("/listar")
    public List <Factura> index(){
        return factSer.findAll();

    }

    @GetMapping("/buscar/{id}")
    public Factura finById(@PathVariable Long id){
        return factSer.findById(id);
    }

    @PostMapping("/crea")
    @ResponseStatus(HttpStatus.CREATED)
    public Factura crear(@RequestBody Factura p){
        return factSer.save(p);
    }

    @PutMapping("/edit/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Factura edit(@RequestBody Factura f, @PathVariable Long id){
        Factura fact = factSer.findById(id);
        fact.setId(f.getId());
        fact.setIdProd(f.getIdProd());
        fact.setCantProd(f.getCantProd());
        fact.setIdProvee(f.getIdProvee());

        return factSer.save(fact);
    }

    @DeleteMapping("/del/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void del(@PathVariable Long id){
        factSer.del(id);
    }

}