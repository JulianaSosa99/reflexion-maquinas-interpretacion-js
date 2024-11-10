package com.maquina_interpretacion.productoApi.Models;

// ProductoV3.java
public class ProductoV3 {
    private String nombre;
    private String descripcion;
    private String categoria;
    private double descuento;
    private double precioFinal;

    // Constructor
    public ProductoV3(String nombre, String descripcion, String categoria, double descuento, double precioFinal) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.descuento = descuento;
        this.precioFinal = precioFinal;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
}

