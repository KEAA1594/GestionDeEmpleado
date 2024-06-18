package com.examen.gestiondeempleados.model;

/************************************************
 *     Kevin Eduardo Andrade Arellano           *
 ************************************************/
import java.sql.*;
public class DAO extends dbconecction{
    private String INSERTAREMPLEADO = "INSERT INTO Empleados VALUES (?,?,?)";
    private String LISTAREMPLEADOS = "SELECT * FROM EMPLEADOS";
    private String SALARIOPROMEDIO = "SELECT AVG(SALARIO) FROM EMPLEADOS";
    private String EMPLEADOSALARIOMAXMIN = "SELECT NOMBRE FROM EMPLEADOS WHERE SALARIO = (SELECT ";
    private String SALARIOMIN = " (SALARIO) FROM EMPLEADOS)";
    private String BUSCAREMPLEADOID = "SELECT * FROM EMPLEADOS WHERE ID = ?";
    private String BUSCAREMPLEADOSALARIO = "SELECT * FROM EMPLEADOS WHERE SALARIO = ?";
    private String BUSCAREMPLEADONOMBRE = "SELECT * FROM EMPLEADOS WHERE NOMBRE = ? ";
    private String BUSCAREMPLEADOIDSALARIO = "SELECT * FROM EMPLEADOS WHERE ID = ? AND SALARIO = ?";
    private String BUSCAREMPLEADOSALARIONOMBRE = "SELECT * FROM EMPLEADOS WHERE NOMBRE = ? AND SALARIO = ?";
    private String BUSCAREMPLEADONOMBREID = "SELECT * FROM EMPLEADOS WHERE ID = ? AND NOMBRE = ? ";
    private String BUSCAREMPLEADO = "SELECT * FROM EMPLEADOS WHERE ID = ? AND NOMBRE = ? AND SALARIO = ?";
    
    public int insert(int id,String nombre,int salario){
        int rowsAfected = 0;
        try{
            Connection conn = dbConnection();
            
            PreparedStatement ps = conn.prepareStatement(INSERTAREMPLEADO);
            
            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setInt(3, salario);
            
            rowsAfected = ps.executeUpdate();
        
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return rowsAfected;
    }
    public ResultSet buscar(int id){
        ResultSet rs = null;
        try{
        Connection conn = dbConnection();
        PreparedStatement ps = conn.prepareStatement(BUSCAREMPLEADOID);
        ps.setInt(1, id);
        
         rs = ps.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet buscar(String nombre){
       ResultSet rs = null;
        try{
        Connection conn = dbConnection();
        
        PreparedStatement ps = conn.prepareStatement(BUSCAREMPLEADONOMBRE);
        ps.setString(1, nombre);
        
         rs = ps.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet buscar(long salario){
        ResultSet rs = null;
        try{
        Connection conn = dbConnection();
        
        PreparedStatement ps = conn.prepareStatement(BUSCAREMPLEADOSALARIO);
        ps.setLong(1, salario);
        
         rs = ps.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet buscar(int id, String nombre){
        ResultSet rs = null;
        try{
        Connection conn = dbConnection();
        
        PreparedStatement ps = conn.prepareStatement(BUSCAREMPLEADONOMBREID);
        ps.setInt(1, id);
        ps.setString(2, nombre);
        
         rs = ps.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet buscar(int id, long salario){
         ResultSet rs = null;
        try{
        Connection conn = dbConnection();
        
        PreparedStatement ps = conn.prepareStatement(BUSCAREMPLEADOIDSALARIO);
        ps.setInt(1, id);
        ps.setLong(2, salario);
        
         rs = ps.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet buscar(String nombre, long salario){
         ResultSet rs = null;
        try{
        Connection conn = dbConnection();
        
        PreparedStatement ps = conn.prepareStatement(BUSCAREMPLEADOSALARIONOMBRE);
        ps.setString(1, nombre);
        ps.setLong(2,salario);
        
         rs = ps.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet buscar(int id, String nombre, long salario){
         ResultSet rs = null;
        try{
        Connection conn = dbConnection();
        
        PreparedStatement ps = conn.prepareStatement(BUSCAREMPLEADO);
        ps.setInt(1, id);
        ps.setString(2, nombre);
        ps.setLong(3, salario);
        
         rs = ps.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet listado(){
        ResultSet rs = null;
        try{
        Connection conn = dbConnection();
        PreparedStatement ps = conn.prepareStatement(LISTAREMPLEADOS);
        
         rs = ps.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet promedio(){
        ResultSet rs = null;
        try{
        Connection conn = dbConnection();
        PreparedStatement ps = conn.prepareStatement(SALARIOPROMEDIO);
        
         rs = ps.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
    public String maximmin(String mm){
    ResultSet rs = null;
        try{
        Connection conn = dbConnection();
        String emplMaxMin = EMPLEADOSALARIOMAXMIN+mm+SALARIOMIN;
        PreparedStatement ps = conn.prepareStatement(emplMaxMin);
        
         rs = ps.executeQuery();
         return String.valueOf(rs.getString(1));
        }catch(SQLException e){
            e.printStackTrace();
        }
        return"";
    }
    
}
