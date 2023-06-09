
import java.security.Principal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manci
 */
public class tabla_ventaa extends javax.swing.JInternalFrame {

    /**
     * Creates new form tabla_ventaa
     */
    public tabla_ventaa() {
       initComponents();
        tabla_de_ventas();
        this.setTitle("ventas");
        
    }

    void tabla_de_ventas(){
       Conectar con=new Conectar();
         Connection Conectar=con.getConnection();
        
        DefaultTableModel modelo=new DefaultTableModel(){
                 
                 
        };
            modelo.addColumn("id venta");
            modelo.addColumn("producto");
            modelo.addColumn("nombre empleado");
            modelo.addColumn("cantidad de productos");
            modelo.addColumn("codigo del producto");
            ventas.setModel(modelo);
        
        String sql = "SELECT*FROM venta";
        
        String dato[]= new String[11];
        try {

        
        Statement st= Conectar.createStatement();
        
        ResultSet rs=st.executeQuery(sql);
        
        while(rs.next()){
           dato[0]= rs.getString(1);
          dato[1]= rs.getString(2);
          dato[2]= rs.getString(3);
          dato[3]= rs.getString(4);
          dato[4]= rs.getString(5);
            modelo.addRow(dato);
        }
        ventas.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btm_actualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ventas = new javax.swing.JTable();
        lvl_title = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Tabla venta");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btm_actualizar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btm_actualizar.setText("Actualizar tabla");
        btm_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btm_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 180, 40));

        ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(ventas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 720, 260));

        lvl_title.setFont(new java.awt.Font("Times New Roman", 0, 50)); // NOI18N
        lvl_title.setForeground(new java.awt.Color(255, 255, 255));
        lvl_title.setText("Listado de ventas");
        getContentPane().add(lvl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 360, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_3.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btm_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_actualizarActionPerformed
        tabla_de_ventas();
    }//GEN-LAST:event_btm_actualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btm_actualizar;
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lvl_title;
    private javax.swing.JTable ventas;
    // End of variables declaration//GEN-END:variables
}
