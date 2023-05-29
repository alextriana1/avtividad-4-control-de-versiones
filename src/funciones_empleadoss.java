
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manci
 */
public class funciones_empleadoss extends javax.swing.JInternalFrame {
Conectar con;
    /**
     * Creates new form funciones_empleadoss
     */
    public funciones_empleadoss() {
        initComponents();
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
        title = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrimer_apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSegundo_apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txteps = new javax.swing.JTextField();
        txtrh = new javax.swing.JTextField();
        txtsueldo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Funciones empleados");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(843, 467));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1002, 0, -1, -1));

        title.setFont(new java.awt.Font("Times New Roman", 0, 50)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Funciones empleados");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 130, 30));

        btn_buscar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 80, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cedula");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 130, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtPrimer_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrimer_apellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrimer_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 130, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Primer Apellido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        txtSegundo_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSegundo_apellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtSegundo_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 130, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Segundo Apellido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        btn_registrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 100, 30));

        btn_editar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 100, 30));

        btn_eliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 100, 30));

        btn_limpiar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 100, 30));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 200, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Correo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });
        getContentPane().add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 200, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Celular");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 200, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dirección");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Escriba la cedula");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Requerido");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Requerido");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Requerido");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Requerido");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, -1, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Requerido");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, -1, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Requerido");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("EPS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("RH");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Sueldo");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, -1));
        getContentPane().add(txteps, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 130, 30));
        getContentPane().add(txtrh, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 200, 30));
        getContentPane().add(txtsueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 200, 30));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Requerido");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, -1, -1));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Requerido");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, -1, -1));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Requerido");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_3.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        con=new Conectar();
        java.sql.Connection reg= con.getConnection();
        java.sql.PreparedStatement pps;
        ResultSet rs;
        try{

            pps = reg.prepareStatement("SELECT * FROM empleado WHERE Cedula =?");
            pps.setString(1, txtCedula.getText());

            rs = (ResultSet) pps.executeQuery();

            if(rs.next()){
                txtCedula.setText(rs.getString("cedula"));
                txtNombre.setText(rs.getString("nombre"));
                txtPrimer_apellido.setText(rs.getString("primer_apellido"));
                txtSegundo_apellido.setText(rs.getString("segundo_apellido"));
                txtDireccion.setText(rs.getString("direccion"));
                txtCelular.setText(rs.getString("celular"));
                txtCorreo.setText(rs.getString("correo"));
                txteps.setText(rs.getString("eps"));
                txtrh.setText(rs.getString("rh"));
                txtsueldo.setText(rs.getString("sueldo"));

            }else{
                JOptionPane.showMessageDialog(null, "No existe persona con la cedula");
            }
        }catch (HeadlessException | SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' '|| c>' '))evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtPrimer_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrimer_apellidoKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' '|| c>' '))evt.consume();
    }//GEN-LAST:event_txtPrimer_apellidoKeyTyped

    private void txtSegundo_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundo_apellidoKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' '|| c>' '))evt.consume();
    }//GEN-LAST:event_txtSegundo_apellidoKeyTyped

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed

        con=new Conectar();
        Connection reg= (Connection) con.getConnection();
        PreparedStatement pps;
        ResultSet rs;

        try{

            pps =  (PreparedStatement) reg.prepareStatement("INSERT INTO empleado (cedula, nombre, primer_apellido, segundo_apellido, direccion, celular, correo, eps, rh, sueldo) VALUES(?, ?, ?, ?, ?, ?,?,?,?, ?)");
            pps.setString(1, txtCedula.getText());
            pps.setString(2, txtNombre.getText());
            pps.setString(3, txtPrimer_apellido.getText());
            pps.setString(4, txtSegundo_apellido.getText());
            pps.setString(5, txtDireccion.getText());
            pps.setString(6, txtCelular.getText());
            pps.setString(7, txtCorreo.getText());
            pps.setString(8, txteps.getText());
            pps.setString(9, txtrh.getText());
            pps.setString(10, txtsueldo.getText());
            pps.executeUpdate();
            
               JOptionPane.showMessageDialog(null, "Empleado Registrado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR "+ex.getMessage());
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        con=new Conectar();
        java.sql.Connection reg= con.getConnection();
        java.sql.PreparedStatement pps;
        ResultSet rs;
        try {
            pps = (PreparedStatement) reg.prepareStatement("UPDATE empleado SET nombre=?,primer_apellido=?,segundo_apellido=?,direccion=?,celular=?,correo=?,eps=?,rh=?,sueldo=? WHERE cedula=?");
            pps.setString(1, txtNombre.getText());
            pps.setString(2, txtPrimer_apellido.getText());
            pps.setString(3, txtSegundo_apellido.getText());
            pps.setString(4, txtDireccion.getText());
            pps.setString(5, txtCelular.getText());
            pps.setString(6, txtCorreo.getText());
            pps.setString(7, txteps.getText());
            pps.setString(8, txtrh.getText());
            pps.setString(9, txtsueldo.getText());
            pps.setString(10, txtCedula.getText());
            pps.executeUpdate();
             JOptionPane.showMessageDialog(null, "Datos Actualizados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR "+ex.getMessage());
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        con=new Conectar();
        java.sql.Connection reg= con.getConnection();
        java.sql.PreparedStatement pp1;
        java.sql.PreparedStatement pp2;
        java.sql.PreparedStatement pp3;
        ResultSet rs;
        try {
            pp1 = reg.prepareStatement("DELETE FROM control WHERE cedula=?");
            pp1.setInt(1, Integer.parseInt(txtCedula.getText()));
            pp1.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(funciones_productoss.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pp3 = reg.prepareStatement("DELETE FROM cuenta WHERE cedula=?");
            pp3.setInt(1, Integer.parseInt(txtCedula.getText()));
            pp3.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(funciones_productoss.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pp2 = reg.prepareStatement("DELETE FROM empleado WHERE cedula=?");
            pp2.setInt(1, Integer.parseInt(txtCedula.getText()));
            pp2.executeUpdate();

            int res=pp2.executeUpdate();

            if(res>0){
                JOptionPane.showMessageDialog(null, "Error al eliminar");
            }else{
                JOptionPane.showMessageDialog(null, "Persona eliminada");
            }
        } catch (SQLException ex) {
            Logger.getLogger(funciones_productoss.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txtCedula.setText("");
        txtNombre.setText("");
        txtPrimer_apellido.setText("");
        txtSegundo_apellido.setText("");
        txtDireccion.setText("");
        txtCelular.setText("");
        txtCorreo.setText("");
        txteps.setText("");
        txtrh.setText("");
        txtsueldo.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtCelularKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrimer_apellido;
    private javax.swing.JTextField txtSegundo_apellido;
    private javax.swing.JTextField txteps;
    private javax.swing.JTextField txtrh;
    private javax.swing.JTextField txtsueldo;
    // End of variables declaration//GEN-END:variables
private void limpiarCajas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
