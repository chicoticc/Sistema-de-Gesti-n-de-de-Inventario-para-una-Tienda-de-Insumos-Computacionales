/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import config.DAO;
import config.DatabaseConfig;

public class ProductoController {

    DAO dataAccesObject = new DAO();
    DatabaseConfig conexion = new DatabaseConfig();

    public void guardarProducto(String idProducto, String nombre, String descripcion, int precio, int cantidad) {
        String sqlGuardar = "INSERT INTO Productos (id_producto, nombre, descripcion, precio, cantidad) VALUES " +
                "('" + idProducto + "','" + nombre + "','" + descripcion + "','" + precio + "','" + cantidad + "')";
        int filas = dataAccesObject.agregar(sqlGuardar);
    }

    public void modificarProducto(String idProducto, String nombre, String descripcion, int precio, int cantidad) {
        String sqlModificar = "UPDATE Productos SET nombre = '" + nombre + "', " +
                "descripcion = '" + descripcion + "', " +
                "precio = '" + precio + "', " +
                "cantidad = '" + cantidad + "' WHERE id_producto = '" + idProducto + "'";
        int registroModificar = dataAccesObject.eliminarModificar(sqlModificar);
    }

    public void eliminarProducto(String idProducto) {
        String sqlEliminar = "DELETE FROM Productos WHERE id_producto = " + idProducto;
        int registroEliminado = dataAccesObject.eliminarModificar(sqlEliminar);
    }
}
