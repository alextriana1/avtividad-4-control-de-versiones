import java.security.Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.swing.JTextField;
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

public class registrar_ventaa extends javax.swing.JInternalFrame {
  
    
Conectar con;
double totalp;
double totalf;
int can;
int ivat;
   double preu;
   double tpag;
   int idv;
   int idf;
   double iva;
    /**
     * Creates new form registrar_ventaa
     */
DefaultTableModel modelo=new DefaultTableModel();
    public registrar_ventaa() {
                initComponents();
        this.setTitle("REGISTRAR VENTA");
        txt_id_venta.setText(getIdVenta());
        txtfactura.setText(getfactura());
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_id_venta = new javax.swing.JTextField();
        id_ventap = new javax.swing.JLabel();
        input_nombrep = new javax.swing.JTextField();
        txt_producto = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JLabel();
        input_nombreempleadop = new javax.swing.JTextField();
        txt_empleado = new javax.swing.JLabel();
        input_codp = new javax.swing.JTextField();
        txt_codigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ventas = new javax.swing.JTable();
        btm_buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        input_cantidadp = new javax.swing.JTextField();
        agregar_pr = new javax.swing.JButton();
        genven = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtfactura = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtiva = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registrar Venta");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_id_venta.setEditable(false);
        txt_id_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_ventaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 140, 30));

        id_ventap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id_ventap.setForeground(new java.awt.Color(255, 255, 255));
        id_ventap.setText("id_venta");
        getContentPane().add(id_ventap, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        input_nombrep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nombrepActionPerformed(evt);
            }
        });
        input_nombrep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_nombrepKeyTyped(evt);
            }
        });
        getContentPane().add(input_nombrep, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 140, 30));

        txt_producto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_producto.setForeground(new java.awt.Color(255, 255, 255));
        txt_producto.setText("Nombre Producto");
        getContentPane().add(txt_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        txt_cantidad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_cantidad.setForeground(new java.awt.Color(255, 255, 255));
        txt_cantidad.setText("Cantidad");
        getContentPane().add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        input_nombreempleadop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nombreempleadopActionPerformed(evt);
            }
        });
        input_nombreempleadop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_nombreempleadopKeyTyped(evt);
            }
        });
        getContentPane().add(input_nombreempleadop, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 140, 30));

        txt_empleado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_empleado.setForeground(new java.awt.Color(255, 255, 255));
        txt_empleado.setText("Nombre empleado");
        getContentPane().add(txt_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 20));

        input_codp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_codpActionPerformed(evt);
            }
        });
        input_codp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_codpKeyTyped(evt);
            }
        });
        getContentPane().add(input_codp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 140, 30));

        txt_codigo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_codigo.setForeground(new java.awt.Color(255, 255, 255));
        txt_codigo.setText("Id producto");
        getContentPane().add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Precio producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        txt_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioActionPerformed(evt);
            }
        });
        getContentPane().add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 140, 30));

        ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID venta", "Num. Factura", "ID producto", "Nombre producto", "Nombre empleado", "Cantidad productos", "Precio", "IVA", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ventas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 720, 260));

        btm_buscar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btm_buscar.setText("Buscar");
        btm_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btm_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 80, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total a pagar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 420, -1, -1));

        total.setEditable(false);
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 410, 120, 40));
        getContentPane().add(input_cantidadp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 140, 30));

        agregar_pr.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        agregar_pr.setText("Agregar Producto");
        agregar_pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_prActionPerformed(evt);
            }
        });
        getContentPane().add(agregar_pr, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 140, 40));

        genven.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        genven.setText("Generar venta");
        genven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genvenActionPerformed(evt);
            }
        });
        getContentPane().add(genven, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 130, 40));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Requerido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Requerido");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Requerido");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Requerido");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Requerido");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 50)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registrar venta");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 518, 70));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Numero de factura");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        txtfactura.setEditable(false);
        txtfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfacturaActionPerformed(evt);
            }
        });
        getContentPane().add(txtfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 140, 30));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Requerido");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        cancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancelar.setText("Cancelar Venta");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, 140, 40));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("IVA");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        txtiva.setEditable(false);
        getContentPane().add(txtiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 140, 30));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Requerido");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_3.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1220, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_id_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_ventaActionPerformed

    }//GEN-LAST:event_txt_id_ventaActionPerformed

    private void input_nombrepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nombrepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_nombrepActionPerformed

    private void input_nombrepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_nombrepKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' '|| c>' '))evt.consume();
    }//GEN-LAST:event_input_nombrepKeyTyped

    private void input_nombreempleadopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nombreempleadopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_nombreempleadopActionPerformed

    private void input_nombreempleadopKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_nombreempleadopKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' '|| c>' '))evt.consume();
    }//GEN-LAST:event_input_nombreempleadopKeyTyped

    private void input_codpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_codpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_codpActionPerformed

    private void input_codpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_codpKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_input_codpKeyTyped

     private String getIdVenta(){
        String idV = null;
        try {
            con = new Conectar();
            Connection reg= con.getConnection();
            PreparedStatement pss;
            ResultSet rss;
            //Preparando el script
            String sql = "select max(id_venta)+1 from venta";
            pss = reg.prepareStatement(sql);
            //Enviando valor encontrado
            rss = pss.executeQuery();
            //Si existe alguna respuesta
            if(rss.next()){
                idV = rss.getString(1);
            }
            return idV;
        } catch (SQLException ex) {
            Logger.getLogger(registrar_ventaa.class.getName()).log(Level.SEVERE, null, ex);
            return idV;
        }
    }
     
     private String getfactura(){
        String idf = null;
        try {
            con = new Conectar();
            Connection reg= con.getConnection();
            PreparedStatement pss;
            ResultSet rss;
            //Preparando el script
            String sql = "select max(n°factura)+1 from venta";
            pss = reg.prepareStatement(sql);
            //Enviando valor encontrado
            rss = pss.executeQuery();
            //Si existe alguna respuesta
            if(rss.next()){
                idf = rss.getString(1);
            }
            return idf;
        } catch (SQLException ex) {
            Logger.getLogger(registrar_ventaa.class.getName()).log(Level.SEVERE, null, ex);
            return idf;
        }
    }


    private void txt_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioActionPerformed

    private void btm_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_buscarActionPerformed
        con=new Conectar();
        Connection reg= con.getConnection();
        PreparedStatement pps;
        ResultSet rs;

        try {
            pps = reg.prepareStatement("SELECT* FROM producto WHERE id_producto=?");
            pps.setString(1,input_codp.getText());

            rs=pps.executeQuery();

            if(rs.next()){
                txt_precio.setText(rs.getString("precio"));
                input_nombrep.setText(rs.getString("nombre_producto"));
                txtiva.setText(rs.getString("iva"));
            }else{
                JOptionPane.showMessageDialog(null, "Producto no encontrado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(funciones_productoss.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btm_buscarActionPerformed

    private void agregar_prActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_prActionPerformed
       agregarPro();
       
       
    }//GEN-LAST:event_agregar_prActionPerformed

    private void genvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genvenActionPerformed
        getIdVenta();
        guardarventa();
txt_id_venta.setText(getIdVenta());
txtfactura.setText(getfactura());

factura_2.recibir_total.setText(total.getText());

for (int i=0;i<ventas.getRowCount();i++){
    String Datos[]=new String[9];
    Datos[0]=ventas.getValueAt(i,0).toString();
    Datos[1]=ventas.getValueAt(i,1).toString();
    Datos[2]=ventas.getValueAt(i,2).toString();
    Datos[3]=ventas.getValueAt(i,3).toString();
    Datos[4]=ventas.getValueAt(i,4).toString();
    Datos[5]=ventas.getValueAt(i,5).toString();
    Datos[6]=ventas.getValueAt(i,6).toString();
    Datos[7]=ventas.getValueAt(i,7).toString();
    Datos[8]=ventas.getValueAt(i,8).toString();
    
    factura_2.modelo2.addRow(Datos);
}
modelo.setRowCount(0);
total.setText("");
    }//GEN-LAST:event_genvenActionPerformed

    private void txtfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfacturaActionPerformed
       
    }//GEN-LAST:event_txtfacturaActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
    modelo.setRowCount(0);   // TODO add your handling code here:
    }//GEN-LAST:event_cancelarActionPerformed


void agregarPro(){
            
            double totali;       
            double ivai;
    modelo=(DefaultTableModel)ventas.getModel();
    
    idv =Integer.parseInt(txt_id_venta.getText()) ;
    idf =Integer.parseInt(txtfactura.getText()) ;
    iva =Integer.parseInt(txtiva.getText());
    int sumaid=idv;
    for (int i = 0; i < ventas.getRowCount(); i++) {
        sumaid++;
    }
    int idp=Integer.parseInt(input_codp.getText());
    String nomp= input_nombrep.getText() ;
    String nome = input_nombreempleadop.getText();
     can=Integer.parseInt(input_cantidadp.getText());    
     preu=Integer.parseInt(txt_precio.getText());
    totali=can*preu;
    ivai=(can*preu)*iva/100+totali;
    ArrayList lista=new ArrayList();
    lista.add(sumaid);
    lista.add(idf);
    lista.add(idp);
    lista.add(nomp);
    lista.add(nome);
    lista.add(can);
    lista.add(preu);
    lista.add(iva);
    lista.add(ivai);
    Object[] ob=new Object[9];
    ob[0]=lista.get(0);
    ob[1]=lista.get(1);
    ob[2]=lista.get(2);
    ob[3]=lista.get(3);
    ob[4]=lista.get(4);
    ob[5]=lista.get(5);         
    ob[6]=lista.get(6);
    ob[7]=lista.get(7);
    ob[8]=lista.get(8);
    modelo.addRow(ob);
    ventas.setModel(modelo);
    calculartotal();   
}

void calculartotal(){
   totalf =0;
   for (int i = 0; i < ventas.getRowCount(); i++) {
        can=Integer.parseInt(ventas.getValueAt(i, 5).toString());
        preu=Double.parseDouble(ventas.getValueAt(i, 6).toString());
        iva=Double.parseDouble(ventas.getValueAt(i, 7).toString());
        totalp=Double.parseDouble(ventas.getValueAt(i, 8).toString());
        totalf=totalp+totalf;
        total.setText(""+totalf);
    }
    
}

private void eliminarfila(){
    int fila=ventas.getSelectedRow();
   if(fila>0){
       modelo.removeRow(fila);
   }else{
       JOptionPane.showMessageDialog(null, "Seleccionar fila");
   }
}

void guardarventa(){
      try {
          for (int i = 0; i <ventas.getRowCount(); i++) {
            con=new Conectar();
            Connection reg= con.getConnection();
            PreparedStatement pps;

            pps = reg.prepareStatement("INSERT INTO venta (id_venta,n°factura,producto,nombre_empleado,cantidad_productos,id_producto)VALUES(?,?,?,?,?,?)");
            pps.setString(1,ventas.getValueAt(i, 0).toString());
            pps.setString(2,ventas.getValueAt(i, 1).toString());
            pps.setString(3,ventas.getValueAt(i, 3).toString());
            pps.setString(4,ventas.getValueAt(i, 4).toString());
            pps.setString(5,ventas.getValueAt(i, 5).toString());
            pps.setString(6,ventas.getValueAt(i, 2).toString());
            pps.executeUpdate();
          
            
            //tabla_de_ventas();
            txt_id_venta.setText(getIdVenta());
            txtfactura.setText(getfactura());
          }
          JOptionPane.showMessageDialog(null, "Datos Guardados");
          
          
        }

        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error"+ex.getMessage());
        }
}
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_pr;
    private javax.swing.JButton btm_buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton genven;
    private javax.swing.JLabel id_ventap;
    private javax.swing.JTextField input_cantidadp;
    private javax.swing.JTextField input_codp;
    private javax.swing.JTextField input_nombreempleadop;
    private javax.swing.JTextField input_nombrep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField total;
    private javax.swing.JLabel txt_cantidad;
    private javax.swing.JLabel txt_codigo;
    private javax.swing.JLabel txt_empleado;
    public javax.swing.JTextField txt_id_venta;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JLabel txt_producto;
    private javax.swing.JTextField txtfactura;
    private javax.swing.JTextField txtiva;
    private javax.swing.JTable ventas;
    // End of variables declaration//GEN-END:variables
}
