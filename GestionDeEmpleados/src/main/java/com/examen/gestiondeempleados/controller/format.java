package com.examen.gestiondeempleados.controller;
import java.util.*;
import java.sql.*;
/************************************************
 *     Kevin Eduardo Andrade Arellano           *
 ************************************************/
public class format {
    final int SIZENOMBRE = 80;
    final int SIZESALARIO = 20;
    final int SIZEID = 20;
    final int FULL = SIZENOMBRE+SIZESALARIO+SIZEID;
    
    public String iniciofinal(int size){
        String base = "";
        for (int i = 0; i<size ;i++){
            base += "-";
        }
        return base;
    }
    public String formatofinal(String nombre){
        String resultado = "";
        resultado = iniciofinal(SIZENOMBRE)+"\n";
        resultado += "|"+nombre;
        for (int i = resultado.length()+1; i < SIZENOMBRE;i++){
            resultado += "_";
        }
        resultado += "|\n";
        resultado += iniciofinal(SIZENOMBRE);
        
        return resultado;
    }
    public String formatofinal(ResultSet rs){
        String resultado = "";
        resultado = iniciofinal(FULL)+"\n";
        String aux;
        int id;
        String nombre;
        int salario;
       try{
        while(rs.next()){
                aux = "";
                id = rs.getInt("ID");
                nombre = rs.getString("Nombre");
                salario = rs.getInt("Salario");
                
                aux += "|"+String.valueOf(id);
                for(int i = aux.length()+1;i<SIZEID;i++){
                    aux += " ";
                }
                aux += "|"+nombre;
                for(int i = aux.length()+1;i<SIZEID+SIZENOMBRE;i++){
                    aux += " ";
                }
                aux += "|"+String.valueOf(salario);
                for(int i = aux.length()+1;i<FULL;i++){
                    aux += " ";
                }
                aux += "|\n";
                resultado += aux;
            }
        resultado += iniciofinal(FULL);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return resultado;
    }
}