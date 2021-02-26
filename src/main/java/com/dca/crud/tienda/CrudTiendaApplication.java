package com.dca.crud.tienda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.dca.crud.tienda","com.dca.crud.tienda.commons.models.entity"})
@SpringBootApplication
public class CrudTiendaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudTiendaApplication.class, args);
    }

}
