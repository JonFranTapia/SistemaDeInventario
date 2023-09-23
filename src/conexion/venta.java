
package conexion;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javafx.scene.text.Font;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class venta extends javax.swing.JFrame {

    public venta() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    int item;
    Double  totalPagar = 0.00;

    Ventas v = new Ventas();
    detalle Dv = new detalle();
    producto pro = new producto();
    CProductos objetoProductos = new CProductos();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        LabTotal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TVenta = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDpi = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtVendedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(31, 65, 169));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nueva Venta");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        LabTotal.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        LabTotal.setForeground(new java.awt.Color(255, 255, 255));
        LabTotal.setText("-----");
        jPanel1.add(LabTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Codigo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Descripción ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingrese el codigo de producto");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Precio");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 180, -1));

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 50, -1));

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 60, -1));

        txtPrecio.setEditable(false);
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 60, -1));
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 100, -1));

        TVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCIÓN", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(TVenta);
        if (TVenta.getColumnModel().getColumnCount() > 0) {
            TVenta.getColumnModel().getColumn(0).setPreferredWidth(30);
            TVenta.getColumnModel().getColumn(1).setPreferredWidth(100);
            TVenta.getColumnModel().getColumn(2).setPreferredWidth(30);
            TVenta.getColumnModel().getColumn(3).setPreferredWidth(30);
            TVenta.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 560, 120));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cantidad");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 190, -1));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nit/Dpi");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        txtDpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDpiActionPerformed(evt);
            }
        });
        jPanel1.add(txtDpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 110, -1));

        jToggleButton1.setText("Generar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vector 1.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Stock Disponible");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Total a pagar");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        txtVendedor.setText("Jonathan Tapia");
        jPanel1.add(txtVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 80, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ellipse (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton2.setBackground(new java.awt.Color(39, 79, 199));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vector 1 (1).png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ellipse.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 190, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtDpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDpiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDpiActionPerformed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
      if (evt.getKeyCode() == KeyEvent.VK_ENTER){
          if(!"".equals(txtCodigo.getText())){
              String cod = txtCodigo.getText();
              pro = objetoProductos.BuscarPro(cod);
              if(pro.getNombre() !=null){
                  txtNombre.setText(""+pro.getNombre());
                  txtPrecio.setText(""+pro.getPrecio());
                  txtStock.setText(""+pro.getCantidad());
                  txtCantidad.requestFocus();
              }
              else{
                  txtNombre.setText("" );
                  txtPrecio.setText("");
                  txtStock.setText("");
                  txtCodigo.requestFocus();
                  JOptionPane.showMessageDialog(null,"Producto no encontrado");
              }
              
          }else{
              JOptionPane.showMessageDialog(null,"Ingrese codigo");
               txtCodigo.requestFocus();
          }
      }
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed
        
        DefaultTableModel modelo = new DefaultTableModel();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
          if(!"".equals(txtCantidad.getText())){
              String cod = txtCodigo.getText();
              String nombre = txtNombre.getText();
              int cant= Integer.parseInt(txtCantidad.getText());
              float precio =Float.parseFloat(txtPrecio.getText());
              float total = cant * precio;
              int stock = Integer.parseInt(txtStock.getText()); 
              if (stock >= cant){
                  item = item + 1;
                  modelo =  (DefaultTableModel) TVenta.getModel();
                  ArrayList lista = new ArrayList();
                  lista.add(item);
                  lista.add(cod);
                  lista.add(nombre);
                  lista.add(cant);
                  lista.add(precio);
                  lista.add(total);
                  Object[] o =new Object[5];
                  o[0]= lista.get(1);
                  o[1]= lista.get(2);
                  o[2]= lista.get(3); 
                  o[3]= lista.get(4);
                  o[4]= lista.get(5); 
                  modelo.addRow(o);
                  TVenta.setModel(modelo);
                  totalPagar();
                  limpiar();
                  txtCodigo.requestFocus();
              }
              else{
                  JOptionPane.showMessageDialog(null,"Stock no disponible");
              }     
          }else{
                  JOptionPane.showMessageDialog(null,"Ingrese cantidad");
              }     
              
        }
    
        
    }//GEN-LAST:event_txtCantidadKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel) TVenta.getModel();
        modelo.removeRow(TVenta.getSelectedRow());
        totalPagar();
        txtCodigo.requestFocus();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
        RegistrarVenta();
        registrarDetalle();
        actualizarStock();
        limpiarVenta();
        txtCliente.setText("");
        txtDpi.setText("");
        LabTotal.setText("----");
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       FormProducto form = new FormProducto();
       form.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabTotal;
    private javax.swing.JTable TVenta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDpi;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables


     public void totalPagar(){
         
         totalPagar=0.00;
         int numFila = TVenta.getRowCount();
         for (int i = 0; i < numFila; i++) {
             double cal = Double.parseDouble(String.valueOf(TVenta.getModel().getValueAt(i, 4)));
             totalPagar= totalPagar+ cal;
         }
         LabTotal.setText(String.format("%.2f",totalPagar));
         
     }
     public void limpiar(){
         txtCantidad.setText("");
         txtCodigo.setText("");
         txtNombre.setText("");
         txtPrecio.setText("");
         txtStock.setText("");
     }
     public void RegistrarVenta(){
         String cliente = txtCliente.getText();
         String vendedor = txtVendedor.getText();
         Double monto = totalPagar;
         v.setCliente(cliente);
         v.setVendedor(vendedor);
         v.setTotal(monto);
         v.registrarVenta(v);
         
     }
     public void registrarDetalle(){
         int id = v.IdVenta();
         for (int i = 0; i < TVenta.getRowCount(); i++) {
             String cod = TVenta.getValueAt(i,0).toString();
             int  cant = Integer.parseInt(TVenta.getValueAt(i, 2).toString());
             double precio = Double.parseDouble(TVenta.getValueAt(i, 3).toString());
             Dv.setCod_prod(cod);
             Dv.setCantidad(cant);
             Dv.setPrecio(precio);
             Dv.setId(id);
             v.registraDetalle(Dv);

         }
     }
     public void actualizarStock(){
         
         for (int i = 0; i < TVenta.getRowCount(); i++) {
             String cod = TVenta.getValueAt(i, 0).toString();
             int cant =  Integer.parseInt(TVenta.getValueAt(i, 2).toString()); 
             pro = objetoProductos.BuscarPro(cod);
             int StockActual= pro.getCantidad()- cant;
             v.actualizarStock(StockActual, cod);
         }
         
     }
     
     public void limpiarVenta(){
         DefaultTableModel modelo = new DefaultTableModel();
         modelo = (DefaultTableModel) TVenta.getModel();
         int fila = TVenta.getRowCount();
         for (int i = 0; i < fila; i++) {
             modelo.removeRow(0);
         }
     }

     public void pdf(){
         
         try {
             FileOutputStream archivo;
             File file = new File("scr/PDF/venta.pdf");
             archivo = new FileOutputStream(file);
             Document doc = new Document();
             PdfWriter.getInstance(doc, archivo);
             doc.open();
             Image img = Image.getInstance("src/imgenes/2.png");
             
             Paragraph fech = new Paragraph();
             
             Font negrita = new Font(Font.Family.TIMES_ROMAN,12,Font.BOLD,BaseColor.BLUE);
             
             
             
             
             doc.close();
             archivo.close();
         } catch (Exception e) {
         }
         
     
     }
     

}

