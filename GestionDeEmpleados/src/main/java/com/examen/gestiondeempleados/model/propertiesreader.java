package com.examen.gestiondeempleados.model;

/************************************************
 *     Kevin Eduardo Andrade Arellano           *
 ************************************************/
import java.util.*;
import java.io.*;

public class propertiesreader {
    
    protected String read(String property){
    Properties prop = connect();
    
    return prop.getProperty(property);
    } 
    
    private Properties connect(){
        Properties prop = null;
        try{
            prop = new Properties();
            prop.load(new FileInputStream("./assets/config.properties"));
        }catch(IOException e){
            e.printStackTrace();
        }
    
    
    return prop;
    }
}
