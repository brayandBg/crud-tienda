package com.dca.crud.tienda.controllers;



import com.dca.crud.tienda.commons.models.entity.Factura;
import com.dca.crud.tienda.exception.exceptions.MasterResourceDeletedException;
import com.dca.crud.tienda.exception.exceptions.MasterResourceFieldAlreadyExistException;
import com.dca.crud.tienda.exception.exceptions.MasterResourceNotFoundException;
import com.dca.crud.tienda.models.services.IFacturaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/factura")
public class FacturaRestController {



    @Autowired
    private IFacturaService factSer;


    @ApiOperation(value = "Retorna lista de facturas", notes = "<br>Retorna una lista con todas las Factura registradas en la BD"
            , response = Factura.class, responseContainer = "List", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Factura.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    @GetMapping("/listar")
    public List <Factura> index(){
        return factSer.findAll();

    }

    @GetMapping("/buscar/{id}")
    @ApiOperation(value = "Retorna una factura", notes = "<br>Retorna una Factura atraves del ID"
            , response = Factura.class, responseContainer = "Factura", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Factura.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    public Factura finById(@PathVariable Long id) throws MasterResourceNotFoundException {
        return factSer.findById(id);
    }

    @PostMapping("/crea")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Crea una factura", notes = "<br>Crea una Factura recibiendo un objeto factura"
            , response = Factura.class, responseContainer = "Factura", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Factura.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    public Factura crear(@RequestBody Factura p) throws MasterResourceFieldAlreadyExistException {
        return factSer.save(p);
    }

    @PutMapping("/edit/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Actualiza la informacion de una factura", notes = "<br>Actualiza la informacion de una Factura atraves del ID"
            , response = Factura.class, responseContainer = "Factura", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Factura.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    public Factura edit(@RequestBody Factura f, @PathVariable Long id) throws MasterResourceNotFoundException, MasterResourceFieldAlreadyExistException {
        Factura fact = factSer.findById(id);
        fact.setId(f.getId());
        fact.setIdProd(f.getIdProd());
        fact.setCantProd(f.getCantProd());
        fact.setIdProvee(f.getIdProvee());

        return factSer.save(fact);
    }

    @DeleteMapping("/del/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation(value = "Elimina una factura", notes = "<br>Elimina una Factura atraves del ID"
            , response = Factura.class, responseContainer = "null", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Factura.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    public void del(@PathVariable Long id) throws MasterResourceDeletedException {
        factSer.del(id);
    }

}