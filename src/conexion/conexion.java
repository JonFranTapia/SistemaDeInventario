/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author JTC
 */
public class conexion {
    
      Connection conectar =null;
      String usuario="root";
      String contraseña="";
      String bd="bdnegocio";
      String ip="localhost";
      String puerto="3306";
      
      String cadena="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
        
      public Connection estableceConexion(){
          
          try{
              Class.forName("com.mysql.jdbc.Driver");
              conectar = DriverManager.getConnection(cadena,usuario,contraseña);
              //JOptionPane.showMessageDialog(null,"La conexion se ha realizado exitosamente");
              
          }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error al conectar a la base da datos, error: "+e.toString());  
          }
          return conectar;
          
      }


      

      
}
