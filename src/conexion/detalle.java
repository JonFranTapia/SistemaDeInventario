
package conexion;

public class detalle {
    int id;
    String cod_prod;
    int cantidad;
    double precio;
    int id_Venta;
    
    public detalle(){
        
    }

    public detalle(int id, String cod_prod, int cantidad, double precio, int id_Venta) {
        this.id = id;
        this.cod_prod = cod_prod;
        this.cantidad = cantidad;
        this.precio = precio;
        this.id_Venta = id_Venta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(String cod_prod) {
        this.cod_prod = cod_prod;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId_Venta() {
        return id_Venta;
    }

    public void setId_Venta(int id_Venta) {
        this.id_Venta = id_Venta;
    }
    
    
}
