package DAO;

import model.Usuario;
import config.DatabaseConfig;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private final DatabaseConfig conexion;

    public UsuarioDAO() {
        this.conexion = new DatabaseConfig();
    }

    /**
     * Obtiene todos los usuarios de la base de datos
     * @return Array con todos los usuarios registrados
     */
    public Usuario[] obtenerTodosUsuarios() {
        String sql = "SELECT id_user, username, password, nombre, apellido, email, telefono, direccion, tipoUsuario FROM users";
        List<Usuario> listaUsuarios = new ArrayList<>();

        try (Connection conn = conexion.establecerConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Usuario usuario = new Usuario(
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("email"),
                    rs.getString("telefono"),
                    rs.getString("direccion"),
                    rs.getString("tipoUsuario")
                );
                usuario.setIdUser(rs.getInt("id_user"));
                listaUsuarios.add(usuario);
            }

            // Convertir la List a array
            return listaUsuarios.toArray(new Usuario[0]);

        } catch (SQLException e) {
            System.err.println("Error al obtener usuarios: " + e.getMessage());
            return new Usuario[0]; // Retorna array vacío si hay error
        }
    }
}