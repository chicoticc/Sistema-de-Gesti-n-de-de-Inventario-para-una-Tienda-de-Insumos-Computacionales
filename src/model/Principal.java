package model;

import config.DatabaseConfig;

public class Principal {

    public static void main(String[] args) {
        DatabaseConfig connection = new DatabaseConfig();
        connection.establecerConexion();
    }

}
