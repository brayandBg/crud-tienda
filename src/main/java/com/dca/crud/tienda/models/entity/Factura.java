package com.dca.crud.tienda.models.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "facturas")
public class Factura implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "id_provee")
    private long idProvee;
    @Column(name = "id_prod")
    private long idProd;
    @Column(name = "cant_prod")
    private long cantProd;

    public long getCantProd() {
        return cantProd;
    }

    public void setCantProd(long cantProd) {
        this.cantProd = cantProd;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdProvee() {
        return idProvee;
    }

    public void setIdProvee(long idProvee) {
        this.idProvee = idProvee;
    }

    public long getIdProd() {
        return idProd;
    }

    public void setIdProd(long idProd) {
        this.idProd = idProd;
    }

    private static final long serialVersionUID = 1l;

}
