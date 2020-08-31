/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sharon
 */
public class SqlCursosHorario extends Conexion{
    
    // REGISTRO DE CURSO EN LA BASE DE DATOS
    public boolean registrarCurso(CursosHorario Curso) throws SQLException{
        PreparedStatement ps=null;
        Connection con= getConexion();
        
        String sql="INSERT INTO cursos(id_horario, id_grado, curso, descripcion) VALUES(?,?,?,?,?)";
        
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1, Curso.getId_horario());
            ps.setInt(2, Curso.getId_grado());
            ps.setString(3, Curso.getCurso());
            ps.setString(4, Curso.getDescripción());
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        } finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
        } 
        }
    }
    
    // REGISTRO DE HORARIO EN LA BASE DE DATOS
    public boolean registrarHorario(CursosHorario Horario) throws SQLException{
        PreparedStatement ps=null;
        Connection con= getConexion();
        
        String sql="INSERT INTO horario(horario) VALUES(?,?)";
        
        try{
            ps=con.prepareStatement(sql);
            ps.setString(1, Horario.getHorario());
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        } finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
        } 
        }
    }
    
    // MODIFICACIÓN DE CURSO EN LA BASE DE DATOS
    public boolean modificarCurso(CursosHorario Curso) throws SQLException{
        PreparedStatement ps=null;
        Connection con= getConexion();
        
        String sql="UPDATE Curso SET id_horario=?, id_grado=?, curso=?, descripcion=? WHERE id=?";
        
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1, Curso.getId_horario());
            ps.setInt(2, Curso.getId_grado());
            ps.setString(3, Curso.getCurso());
            ps.setString(4, Curso.getDescripción());
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        } finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
        } 
        }
    }
    
    // ELIMINACIÓN DE CURSO
    public boolean eliminarCurso(CursosHorario Curso) throws SQLException{
        PreparedStatement ps=null;
        Connection con= getConexion();
        
        String sql="DELETE FROM Curso WHERE id_curso=?";
        
        try{
            ps=con.prepareStatement(sql);
            ps.setString(1, Curso.getCurso());
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        } finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
        } 
        }
    }
    
    
    // BÚSQUEDA DE CURSO EN LA BASE DE DATOS
      public boolean buscarCurso(CursosHorario Curso) throws SQLException{
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con= getConexion();
        
        String sql="SELECT * FROM curso WHERE id_curso=?";
        
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1, Curso.getId_curso());
            rs= ps.executeQuery();
            
            if(rs.next()){
                Curso.setId_curso(Integer.parseInt(rs.getString("id_curso")));
                Curso.setCurso(rs.getString("curso"));
                 Curso.setCurso(rs.getString("descripcion"));
            }
            
            return true;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        } finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
        } 
        }
    }
}


