package model;

import config.DatabaseConfig;
import controlador.UsuarioControlador;

public class Principal {

    public static void main(String[] args) {
        DatabaseConfig connection = new DatabaseConfig();
        connection.establecerConexion();
        
        
        UsuarioControlador usuarioService = new UsuarioControlador();
        
        System.out.println("Obteniendo todos los usuarios...");
        usuarioService.mostrarTodosUsuarios();
        
    }

}
