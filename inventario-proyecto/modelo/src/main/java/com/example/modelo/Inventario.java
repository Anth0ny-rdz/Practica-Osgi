package com.example.modelo;

import java.util.HashMap;
import java.util.Map;

public class Inventario {

    private Map<String, Producto> productos = new HashMap<>();

    public void agregarProducto(Producto producto) {
        productos.put(producto.getCodigo(), producto);
    }

    public Producto obtenerProducto(String codigo) {
        return productos.get(codigo);
    }
}
