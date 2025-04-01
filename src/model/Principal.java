package model;

import config.DatabaseConfig;
import controller.ProductoController;

public class Principal {

    public static void main(String[] args) {
        ProductoController producto = new ProductoController();
        producto.modificarProducto("2198", "Telefono Xiaomi Redmi Note 12", "Telefono Huawei", 60000, 5);
    }

}
