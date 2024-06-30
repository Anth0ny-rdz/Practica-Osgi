package com.example.servicio;

import com.example.modelo.Inventario;
import com.example.modelo.Producto;
import org.osgi.service.component.annotations.Component;

@Component
public class InventarioServicioImpl implements InventarioServicio {

    private Inventario inventario = new Inventario();

    @Override
    public void agregarProducto(Producto producto) {
        inventario.agregarProducto(producto);
    }

    @Override
    public Producto obtenerProducto(String codigo) {
        return inventario.obtenerProducto(codigo);
    }
}
