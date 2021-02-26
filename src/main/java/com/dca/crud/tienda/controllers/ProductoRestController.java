package com.dca.crud.tienda.controllers;


import com.dca.crud.tienda.commons.models.entity.Producto;
import com.dca.crud.tienda.commons.models.entity.Producto;
import com.dca.crud.tienda.commons.models.entity.Producto;
import com.dca.crud.tienda.models.services.IProductoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
    @ApiOperation(value = "Retorna lista de Productos", notes = "<br>Retorna una lista con todas las Producto registradas en la BD"
            , response = Producto.class, responseContainer = "List", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Producto.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    public List <Producto> index(){
        return prodSer.findAll();

    }

    @GetMapping("/buscar/{id}")
    @ApiOperation(value = "Retorna una Producto", notes = "<br>Retorna una Producto atraves del ID"
            , response = Producto.class, responseContainer = "Producto", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Producto.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    public Producto finById(@PathVariable Long id){
        return prodSer.findById(id);
    }

    @PostMapping("/crea")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Crea una Producto", notes = "<br>Crea una Producto recibiendo un objeto Producto"
            , response = Producto.class, responseContainer = "Producto", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Producto.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    public Producto crear(@RequestBody Producto p){
        return prodSer.save(p);
    }

    @PutMapping("/edit/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Actualiza la informacion de una Producto", notes = "<br>Actualiza la informacion de una Producto atraves del ID"
            , response = Producto.class, responseContainer = "Producto", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Producto.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
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
    @ApiOperation(value = "Elimina una Producto", notes = "<br>Elimina una Producto atraves del ID"
            , response = Producto.class, responseContainer = "null", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Producto.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    public void del(@PathVariable Long id){
        prodSer.del(id);
    }

}