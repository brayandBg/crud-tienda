package com.dca.crud.tienda.controllers;



import com.dca.crud.tienda.commons.models.entity.Proveedor;
import com.dca.crud.tienda.commons.models.entity.Proveedor;
import com.dca.crud.tienda.models.services.IProveedorService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
    @ApiOperation(value = "Retorna lista de Proveedores", notes = "<br>Retorna una lista con todas las Proveedor registradas en la BD"
            , response = Proveedor.class, responseContainer = "List", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Proveedor.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    public List <Proveedor> index(){
        return proveSer.findAll();

    }

    @GetMapping("/buscar/{id}")
    @ApiOperation(value = "Retorna una Proveedor", notes = "<br>Retorna una Proveedor atraves del ID"
            , response = Proveedor.class, responseContainer = "Proveedor", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Proveedor.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    public Proveedor finById(@PathVariable Long id){
        return proveSer.findById(id);
    }

    @PutMapping("/edit/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Actualiza la informacion de una Proveedor", notes = "<br>Actualiza la informacion de una Proveedor atraves del ID"
            , response = Proveedor.class, responseContainer = "Proveedor", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Proveedor.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    public Proveedor edit(@RequestBody Proveedor p, @PathVariable Long id){
        Proveedor pro = proveSer.findById(id);
        pro.setId(p.getId());
        pro.setName(p.getName());

        return proveSer.save(pro);
    }

    @PostMapping("/crea")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Crea una Proveedor", notes = "<br>Crea una Proveedor recibiendo un objeto Proveedor"
            , response = Proveedor.class, responseContainer = "Proveedor", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Proveedor.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    public Proveedor crear(@RequestBody Proveedor p){
        return proveSer.save(p);
    }

    @DeleteMapping("/del/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation(value = "Elimina una Proveedor", notes = "<br>Elimina una Proveedor atraves del ID"
            , response = Proveedor.class, responseContainer = "null", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Proveedor.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    public void del(@PathVariable Long id){
        proveSer.del(id);
    }

}
