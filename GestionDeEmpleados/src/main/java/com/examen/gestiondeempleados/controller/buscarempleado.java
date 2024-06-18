package com.examen.gestiondeempleados.controller;
import com.examen.gestiondeempleados.model.DAO;
import java.util.*;
import java.sql.*;
/************************************************
 *     Kevin Eduardo Andrade Arellano           *
 ************************************************/
public class buscarempleado {
    format form = new format();
    
    public String busqueda(int id,String nombre,long salario){
        String resultado;
        DAO dao = new DAO();
        resultado = form.formatofinal(dao.buscar(id,nombre,salario));
        return resultado;
    }
    public String busqueda(int id,String nombre){
        String resultado;
        DAO dao = new DAO();
        resultado = form.formatofinal(dao.buscar(id,nombre));
        return resultado;
    }
    public String busqueda(int id,long salario){
        String resultado;
        DAO dao = new DAO();
        resultado = form.formatofinal(dao.buscar(id,salario));
        return resultado;
    }
    public String busqueda(String nombre,long salario){
        String resultado;
        DAO dao = new DAO();
        resultado = form.formatofinal(dao.buscar(nombre,salario));
        return resultado;
    }
    public String busqueda(int id){
        String resultado;
        DAO dao = new DAO();
        resultado = form.formatofinal(dao.buscar(id));
        return resultado;
    }
    public String busqueda(String nombre){
        String resultado;
        DAO dao = new DAO();
        resultado = form.formatofinal(dao.buscar(nombre));
        return resultado;
    }
    public String busqueda(long salario){
        String resultado;
        DAO dao = new DAO();
        resultado = form.formatofinal(dao.buscar(salario));
        return resultado;
    }
    
  
}
