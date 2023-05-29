
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class inicio_sesion extends javax.swing.JFrame {
    
    Conectar con;
    
       public inicio_sesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Inicio Sesion");
        
    }
    @Override
     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Icono.JPG"));
        return retValue;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btm_salir = new javax.swing.JButton();
        Icono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btm_InicioSesion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        selector = new javax.swing.JComboBox<>();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btm_salir.setBackground(new java.awt.Color(102, 102, 102));
        btm_salir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btm_salir.setText("Salir");
        btm_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btm_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/unnamed.png"))); // NOI18N
        getContentPane().add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 200, 250));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 100, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 160, 30));

        txtusuario.setBackground(new java.awt.Color(153, 153, 153));
        txtusuario.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 200, 30));

        txtpass.setBackground(new java.awt.Color(153, 153, 153));
        txtpass.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtpass.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 200, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Inicio Sesion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        btm_InicioSesion.setBackground(new java.awt.Color(153, 153, 153));
        btm_InicioSesion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btm_InicioSesion.setText("Iniciar Sesion");
        btm_InicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_InicioSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btm_InicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 140, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Rol:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 60, -1));

        selector.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        selector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Administrador", "Empleado" }));
        selector.setToolTipText("");
        selector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorActionPerformed(evt);
            }
        });
        getContentPane().add(selector, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 170, 30));

        Fondo.setBackground(new java.awt.Color(204, 204, 204));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prueba.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 467, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btm_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btm_salirActionPerformed

    private void btm_InicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_InicioSesionActionPerformed

        con = new Conectar();
        Connection reg = con.getConnection();
        ResultSet rs;

        try {

            int resultado = 0;
            String pass = txtpass.getText();
            String usuario = txtusuario.getText();
            String tipo = selector.getSelectedItem().toString();

            String SQL = ("SELECT* FROM cuenta WHERE correo='" + usuario + "' and contraseña='" + pass + "' and tipo='" + tipo + "' ");

            Statement st = reg.createStatement();

            rs = st.executeQuery(SQL);

            if (rs.next()) {
                resultado = 1;
                if (resultado == 1) {      
                    if (selector.getSelectedItem().equals("Administrador")) {
                        menu_principal H = new menu_principal();
                        
                        H.show();
                       
                    } else if (selector.getSelectedItem().equals("Empleado")) {
                        menu_principal H = new menu_principal();
                        H.funciones_p.setVisible(false);
                        H.funciones_v.setVisible(false);
                        H.funciones_e.setVisible(false);
                        H.registrar_pr.setVisible(false);
                        H.funciones_pr.setVisible(false);
                        H.cuenta.setVisible(false);    
                        H.show();

                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Error de acceso");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error de acceso");
            }

        } catch (SQLException ex) {
            Logger.getLogger(menu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
    }//GEN-LAST:event_btm_InicioSesionActionPerformed

    private void selectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectorActionPerformed
    
    
    
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
            java.util.logging.Logger.getLogger(inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new inicio_sesion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Icono;
    private javax.swing.JButton btm_InicioSesion;
    private javax.swing.JButton btm_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> selector;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
    private static class string{

        public string() {
        }
    }
        
        }
   

