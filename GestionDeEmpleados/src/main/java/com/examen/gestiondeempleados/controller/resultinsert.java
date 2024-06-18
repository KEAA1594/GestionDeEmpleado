package com.examen.gestiondeempleados.controller;

import com.examen.gestiondeempleados.model.DAO;

/************************************************
 *     Kevin Eduardo Andrade Arellano           *
 ************************************************/
public class resultinsert {
    public String setinsert(int id,String nombre,int salario){
        DAO dao = new DAO();
        int a = dao.insert(id, nombre, salario);
    return "done";
    }
}
