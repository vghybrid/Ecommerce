package com.tienda.tienda_de_ropa.dtos;

import com.tienda.tienda_de_ropa.models.Producto;
import com.tienda.tienda_de_ropa.models.ProductoTalle;

import java.util.ArrayList;
import java.util.List;

public class ProductoDTO {

    private long id;

    private List<String> imagenes = new ArrayList<>();

    private String nombre;

    private int stock;

    private Double precio;

    private ProductoTalle talle;

    public ProductoDTO() {}

    public ProductoDTO(Producto producto) {
        this.id = producto.getId();
        this.imagenes = producto.getImages();
        this.nombre = producto.getNombre();
        this.stock = producto.getStock();
        this.precio = producto.getPrecio();
        this.talle = producto.getTalle();
    }

    public long getId() {
        return id;
    }

    public List<String> getImagenes() {
        return imagenes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public Double getPrecio() {
        return precio;
    }

    public ProductoTalle getTalle() {
        return talle;
    }
}
