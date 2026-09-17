package com.tecnm.merida.market_backend.persistence.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CollectionId;

@Entity
@Table (name = "Productos")

public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    private String nombre;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_ventas")
    private Double precioVentas;

    @Column(name = "cantidad_stock")
    private Integer catidadStock;

    private Boolean estado;
}
