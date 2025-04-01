package DAO;

import utils.DatabaseUtils;
import config.DatabaseConfig;

public class ProductoDAO {
    DatabaseUtils dbUtils = new DatabaseUtils();
    DatabaseConfig conexion = new DatabaseConfig();

    public void guardarProducto(String idProducto, String nombre, String descripcion, int precio, int cantidad) {
        String sqlGuardar = "INSERT INTO Productos (id_producto, nombre, descripcion, precio, cantidad) VALUES " +
                "('" + idProducto + "','" + nombre + "','" + descripcion + "','" + precio + "','" + cantidad + "')";
        int filas = dbUtils.agregar(sqlGuardar);
    }

    public void modificarProducto(String idProducto, String nombre, String descripcion, int precio, int cantidad) {
        String sqlModificar = "UPDATE Productos SET nombre = '" + nombre + "', " +
                "descripcion = '" + descripcion + "', " +
                "precio = '" + precio + "', " +
                "cantidad = '" + cantidad + "' WHERE id_producto = '" + idProducto + "'";
        int registroModificar = dbUtils.eliminarModificar(sqlModificar);
    }

    public void eliminarProducto(String idProducto) {
        String sqlEliminar = "DELETE FROM Productos WHERE id_producto = " + idProducto;
        int registroEliminado = dbUtils.eliminarModificar(sqlEliminar);
    }
}


