package com.example.cliente;

import com.example.servicio.InventarioServicio;
import com.example.modelo.Producto;
import org.osgi.framework.BundleActivator;

public class ClienteApp implements BundleActivator {

    private InventarioServicio servicio;

    @Override
    public void start(org.osgi.framework.BundleContext bundleContext) throws Exception {
        // Aquí puedes iniciar tu lógica de cliente
    }

    @Override
    public void stop(org.osgi.framework.BundleContext bundleContext) throws Exception {
        // Aquí puedes detener cualquier proceso necesario al cerrar la aplicación
    }

    public static void main(String[] args) {
        // Aquí puedes iniciar tu aplicación cliente
        ClienteApp cliente = new ClienteApp();
        cliente.iniciarCliente();
    }

    private void iniciarCliente() {
        // Aquí puedes escribir la lógica de tu aplicación cliente
        Producto producto = new Producto();
        // Usa el servicio de inventario
        // servicio.metodoDelServicio(producto);
    }
}
