/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import javax.swing.JOptionPane;

/**
 *
 * @author JTC
 */
public class Loginn extends javax.swing.JFrame {

    /**
     * Creates new form Loginn
     */
    public Loginn() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        contrase = new javax.swing.JPasswordField();
        contra = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        iniciar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(31, 65, 169));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ellipse.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 190, 170));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ellipse (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Inicio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingrese su usuario y contraseña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        txtusuario.setBackground(new java.awt.Color(31, 65, 169));
        txtusuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(255, 255, 255));
        txtusuario.setText("Usuario");
        txtusuario.setBorder(null);
        txtusuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtusuarioMouseClicked(evt);
            }
        });
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 200, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Email.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 270, 40));

        contrase.setBackground(new java.awt.Color(31, 65, 169));
        contrase.setForeground(new java.awt.Color(255, 255, 255));
        contrase.setText("Contraseña");
        contrase.setBorder(null);
        contrase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contraseMouseClicked(evt);
            }
        });
        jPanel1.add(contrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        contra.setBackground(new java.awt.Color(31, 65, 169));
        contra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contra.setForeground(new java.awt.Color(255, 255, 255));
        contra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Password.png"))); // NOI18N
        jPanel1.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 270, 40));

        jLabel2.setBackground(new java.awt.Color(31, 65, 169));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        iniciar.setBackground(new java.awt.Color(31, 65, 169));
        iniciar.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        iniciar.setForeground(new java.awt.Color(255, 255, 255));
        iniciar.setText("Iniciar");
        iniciar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });
        jPanel1.add(iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 270, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vector 1.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed

       String usuario="admin";
       String contra="12345";
       
       String pass=new String(contrase.getPassword());
       
       if (txtusuario.getText().equals(usuario)&& pass.equals(contra)){
           
        FormProducto objetoFormulario= new FormProducto();
        objetoFormulario.setVisible(true);
        dispose();
       }
       else{
           JOptionPane.showMessageDialog(this, "Usuario/contraseña incorrecta");
           contrase.setText("Contraseña");
       }
    }//GEN-LAST:event_iniciarActionPerformed

    private void txtusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMouseClicked
        txtusuario.setText("");     
    }//GEN-LAST:event_txtusuarioMouseClicked

    private void contraseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseMouseClicked
        contrase.setText("");
    }//GEN-LAST:event_contraseMouseClicked

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
            java.util.logging.Logger.getLogger(Loginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contra;
    private javax.swing.JPasswordField contrase;
    private javax.swing.JButton iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}