package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class dataBaseConnection {

    Connection c = null;

    public dataBaseConnection() {

    }

    public Connection ConnectionDB() {
        try {
            
           this.c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ucakBilet", "postgres", "13021302");
            return c;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return c;

    }}
