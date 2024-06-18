package com.examen.gestiondeempleados.model;

/************************************************
 *     Kevin Eduardo Andrade Arellano           *
 ************************************************/
import java.sql.*;
import java.util.*;

public class dbconecction {
    propertiesreader prop = new propertiesreader();
    
    protected Connection dbConnection(){
        Connection conn = createConnection();
        return conn;
    }
    private Connection createConnection(){
        
        Connection conn = null;
        try{
            String url = prop.read("db.url");
            conn = DriverManager.getConnection(url);
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return conn;
    }
}
