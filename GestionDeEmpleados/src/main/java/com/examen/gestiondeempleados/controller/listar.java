package com.examen.gestiondeempleados.controller;

import com.examen.gestiondeempleados.model.DAO;
import java.sql.*;

/************************************************
 *     Kevin Eduardo Andrade Arellano           *
 ************************************************/
public class listar {
    DAO dao = new DAO();
    format form = new format();
        
        public String mostrar(){
            ResultSet rs = dao.listado();
            String empleados = form.formatofinal(rs);
            return empleados;
        }
}
