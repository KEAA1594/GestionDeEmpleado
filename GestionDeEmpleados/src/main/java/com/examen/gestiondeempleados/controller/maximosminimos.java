package com.examen.gestiondeempleados.controller;

import com.examen.gestiondeempleados.model.DAO;
import java.sql.ResultSet;
import java.sql.SQLException;

/************************************************
 *     Kevin Eduardo Andrade Arellano           *
 ************************************************/

public class maximosminimos {
    DAO dao = new DAO();
    
    public String mostrar(String mm){
            String val;
            val = dao.maximmin(mm);
            return val;
        }
}
