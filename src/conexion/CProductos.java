
package conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;




/**
 *
 * @author JTC
 */
public class CProductos {

    String codigoProducto;
    String nombreProducto;
    String precioUnitario;
    String cantidadProducto;
    String fechaIntruduccion;

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(String precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(String cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getFechaIntruduccion() {
        return fechaIntruduccion;
    }

    public void setFechaIntruduccion(String fechaIntruduccion) {
        this.fechaIntruduccion = fechaIntruduccion;
    }
    
  
    public void InsertarProducto(JTextField paramCodigo,JTextField paramNombre,JTextField paramPrecio,JTextField paramCantidad,JTextField paramFecha){
        
        setCodigoProducto(paramCodigo.getText());
        setNombreProducto(paramNombre.getText());
        setPrecioUnitario(paramPrecio.getText());
        setCantidadProducto(paramCantidad.getText());
        setFechaIntruduccion(paramFecha.getText());
        conexion objetoConexion= new conexion();
        String consulta ="INSERT INTO `producto`(`codigoProducto`,`nombreProducto`, `precoUnitario`, `cantidadProducto`, `fechaIntroduccion`) VALUES (?,?,?,?,?);"; 
      
        try{
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
            
            cs.setString(1,getCodigoProducto());
            cs.setString(2,getNombreProducto());
            cs.setString(3,getPrecioUnitario());
            cs.setString(4,getCantidadProducto());
            cs.setString(5,getFechaIntruduccion());
            cs.execute();
            JOptionPane.showMessageDialog(null,"Producto Ingresado Correctamente");
       
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se insertó correctamente el propducto"+e.toString());
        } 
       

        
    }
    
    public void MostrarProducto(JTable paramTotalProductos, String cadena){
        conexion objetoConexion= new conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        
       
        String sql="";
        
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Fecha");
        
        paramTotalProductos.setModel(modelo);
        
        sql="SELECT * FROM `producto` WHERE  nombreProducto like '%"+cadena+"%';";
        String[] datos = new String[5];
        Statement st;
        
        try{
          st= objetoConexion.estableceConexion().createStatement();
          ResultSet rs=st.executeQuery(sql); 
          while(rs.next()){
              datos[0]=rs.getString(1);
              datos[1]=rs.getString(2);
              datos[2]=rs.getString(3);
              datos[3]=rs.getString(4);
              datos[4]=rs.getString(5);
              
              modelo.addRow(datos);
               
          }
          paramTotalProductos.setModel(modelo);
            
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Nose pudo mosttrar los registros, error: "+e.toString());
            
        }
    }
    public void seleccionaProductos(JTable paramTableProductos,JTextField paramCodigo,JTextField paramNombre, JTextField paramPrecio,JTextField paramCantidad,JTextField paramFecha){
        try{
            
            int fila= paramTableProductos.getSelectedRow();
            
            if(fila>=0){
                paramCodigo.setText((paramTableProductos.getValueAt(fila, 0 ).toString()));
                paramNombre.setText((paramTableProductos.getValueAt(fila, 1 ).toString()));
                paramPrecio.setText((paramTableProductos.getValueAt(fila, 2 ).toString()));
                paramCantidad.setText((paramTableProductos.getValueAt(fila, 3 ).toString()));
                paramFecha.setText((paramTableProductos.getValueAt(fila, 4 ).toString()));
                
            }
            else{
            
             paramCodigo.setText("");
             paramNombre.setText("");
             paramPrecio.setText("");
             paramCantidad.setText("");
             paramFecha.setText("");
             
            
            }
             
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Fila no seleccionada"+e.toString());
        }
    }
    public void modificarProducto(JTextField codigo,JTextField nombre,JTextField precio,JTextField cantidad,JTextField fecha){
        
        setCodigoProducto(codigo.getText());
        setNombreProducto(nombre.getText());
        setPrecioUnitario(precio.getText());
        setCantidadProducto(cantidad.getText());
        setFechaIntruduccion(fecha.getText());
        
        
        conexion objetoConexion =  new conexion();
        String consulta= "UPDATE `producto` SET `nombreProducto`=?,`precoUnitario`=?,`cantidadProducto`=?,`fechaIntroduccion`=? WHERE `codigoProducto`=?;";
        
        try {
            CallableStatement cs =objetoConexion.estableceConexion().prepareCall(consulta);
            
           
            cs.setString(1, getNombreProducto());
            cs.setString(2, getPrecioUnitario());
            cs.setString(3, getCantidadProducto());
            cs.setString(4, getFechaIntruduccion());
             cs.setString(5, getCodigoProducto());
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Modificacion exitosa");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se modifico. error: "+e.toString());
        }
    }
     
    public void eliminarProducto(JTextField codigo){
        
        setCodigoProducto(codigo.getText());
        
        conexion objetoConexion= new conexion();
        
        String consulta= "DELETE FROM `producto` WHERE `codigoProducto`=?;";
        
        try {
            CallableStatement cs =objetoConexion.estableceConexion().prepareCall(consulta);
            
            cs.setString(1,getCodigoProducto());
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar error: "+e.toString());
        }
        
        
    }
    public void buscarProducto(JTextField buscar,JTextField codigo,JTextField nombre,JTextField precio,JTextField cantidad,JTextField fecha){
  
        String cosulta= "SELECT `codigoProducto`, `nombreProducto`, `precoUnitario`, `cantidadProducto`, `fechaIntroduccion` FROM `producto` WHERE `codigoProducto`=?;";
        conexion objetoConexion = new conexion();
        
        try {
            CallableStatement cs =objetoConexion.estableceConexion().prepareCall(cosulta);
            
            cs.setString(1, buscar.getText());
            cs.execute();
            
            ResultSet rs= cs.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Registro encontrado");
                codigo.setText(rs.getString("codigoProducto"));
                nombre.setText(rs.getString("nombreProducto"));
                precio.setText(rs.getString("precoUnitario"));
                cantidad.setText(rs.getString("cantidadProducto"));
                fecha.setText(rs.getString("fechaIntroduccion"));
                buscar.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null,"Registro no encontrado");
                codigo.setText("");
                nombre.setText("");
                precio.setText("");
                cantidad.setText("");
                fecha.setText("");
                buscar.setText("");
            }
                
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error: "+e.toString());
        }
        
    }
     public producto BuscarPro(String cod){
        String sql="SELECT*FROM producto WHERE codigoProducto=?";
        producto pro = new producto();
        conexion cn = new conexion();
        Connection con;
        ResultSet rs;
        PreparedStatement ps;
         try {
             con= cn.estableceConexion();
             ps = con.prepareStatement(sql);
             ps.setString(1, cod);
             rs = ps.executeQuery();
             if(rs.next()){
                 pro.setNombre(rs.getString("nombreProducto"));
                 pro.setPrecio(rs.getDouble("precoUnitario"));
                 pro.setCantidad(rs.getInt("cantidadProducto"));  
             }
         } catch (SQLException e) {
             System.out.println(e.toString());
         }
         return pro;
         
     }

   

}

