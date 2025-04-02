package DAO;

import utils.DatabaseUtils;
import config.DatabaseConfig;

public class ProductoDAO {
    DatabaseUtils dbUtils = new DatabaseUtils();

    public void guardarProducto(String idProducto, String nombre, String descripcion, int precio, int cantidad) {
        try {
            String sqlGuardar = "INSERT INTO Productos (id_producto, nombre, descripcion, precio, cantidad) VALUES " +
                    "('" + idProducto + "','" + nombre + "','" + descripcion + "','" + precio + "','" + cantidad + "')";
            int filas = dbUtils.agregar(sqlGuardar);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void modificarProducto(String idProducto, String nombre, String descripcion, int precio, int cantidad) {
        try {
            String sqlModificar = "UPDATE Productos SET nombre = '" + nombre + "', " +
                    "descripcion = '" + descripcion + "', " +
                    "precio = '" + precio + "', " +
                    "cantidad = '" + cantidad + "' WHERE id_producto = '" + idProducto + "'";
            int registroModificar = dbUtils.eliminarModificar(sqlModificar);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void eliminarProducto(String idProducto) {
        try {
            String sqlEliminar = "DELETE FROM Productos WHERE id_producto = " + idProducto;
            int registroEliminado = dbUtils.eliminarModificar(sqlEliminar);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


