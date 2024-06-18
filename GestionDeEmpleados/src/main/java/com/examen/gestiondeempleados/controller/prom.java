package com.examen.gestiondeempleados.controller;

import com.examen.gestiondeempleados.model.DAO;
import java.sql.ResultSet;
import java.sql.SQLException;

/************************************************
 *     Kevin Eduardo Andrade Arellano           *
 ************************************************/
public class prom {
    DAO dao = new DAO();
    format form = new format();
        
        public String mostrar(){
            ResultSet rs;
            int salario = 0;
            try{
            rs = dao.promedio();
            salario = rs.getInt(1) ;
                
            }catch(SQLException e){
            e.printStackTrace();
        }
            return String.valueOf(salario);
        }
}
