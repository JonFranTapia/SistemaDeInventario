  
package conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Ventas {
 int id;
 String cliente;
 String vendedor;
 Double total;
 
 public Ventas(){
     
 }

    public Ventas(int id, String cliente, String vendedor, Double total) {
        this.id = id;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
 
    int r;
    public int registrarVenta(Ventas v){
        Connection con;
        conexion cn = new conexion();
        PreparedStatement ps;
        
        String sql = "INSERT INTO ventas(cliente,vendedor,total)VALUES(?,?,?)";
        try {
            con = cn.estableceConexion();
            ps= con.prepareStatement(sql); 
            ps.setString(1,v.getCliente());
            ps.setString(2,v.getVendedor());
            ps.setDouble(3,v.getTotal());
            ps.execute();
           
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        
        return r;  
    }
    public int registraDetalle(detalle Dv){
        conexion cn = new conexion();
        Connection con;
        PreparedStatement ps;
        String sql="INSERT INTO detalle(cod_pro,cantidad,precio,id_Venta)VALUES(?,?,?,?)";
        try {
            con = cn.estableceConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, Dv.getCod_prod());
            ps.setInt(2, Dv.getCantidad());
            ps.setDouble(3,Dv.getPrecio());
            ps.setInt(4, Dv.getId());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        } 
        return r;
    }
    public int  IdVenta(){
        conexion cn = new conexion();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        int id=0;
        String sql ="SELECT MAX(id) FROM ventas";
        try {
            con  = cn.estableceConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()){
                id = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return id;
    }
    
    public boolean actualizarStock(int cant, String cod){
        conexion cn = new conexion();
        Connection con;
        PreparedStatement ps;
        String sql = "UPDATE producto SET cantidadProducto=? WHERE codigoProducto=?";
        try {
            con = cn.estableceConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1,cant);
            ps.setString(2,cod);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
 
}
