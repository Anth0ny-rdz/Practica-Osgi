package com.example.servicio;

import com.example.modelo.Producto;

public interface InventarioServicio {
    void agregarProducto(Producto producto);
    Producto obtenerProducto(String nombre);
}