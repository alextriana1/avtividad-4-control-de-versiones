/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.print.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author alexander
 */
public class factura_2 extends javax.swing.JInternalFrame implements Printable {
Calendar fechaActual=new GregorianCalendar();  
    
   public static DefaultTableModel modelo2;
    public factura_2() {
        initComponents();
        fechaSistema();
        
        modelo2=new DefaultTableModel();
        modelo2.addColumn("ID venta");
        modelo2.addColumn("Factura");
        modelo2.addColumn("ID producto");
        modelo2.addColumn("Nombre");
        modelo2.addColumn("Empleado");
        modelo2.addColumn("Cantidad");
        modelo2.addColumn("Precio");
        modelo2.addColumn("IVA");
        modelo2.addColumn("Total");
        recibir_venta.setModel(modelo2);
        
 
    }
    
    private void fechaSistema(){
    
    fecha.setCalendar(fechaActual);
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recibo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        recibir_total = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        recibir_venta = new javax.swing.JTable();
        title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(774, 534));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recibo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Total a pagar");
        recibo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        recibir_total.setEditable(false);
        recibo.add(recibir_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 140, 30));

        recibir_venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(recibir_venta);

        recibo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 740, 200));

        title.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        title.setText("Big Pharma");
        recibo.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 150, 40));
        recibo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono_2.png"))); // NOI18N
        recibo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 90));

        jLabel1.setText("Correo:BigPharma3067@gmail.com");
        recibo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 180, 20));

        jLabel5.setText("Telefono: 3928841");
        recibo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 100, 20));

        jLabel6.setText("Direccion: calle 80 bis sur#91-90");
        recibo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 20));

        fecha.setDateFormatString("yyyy/MM/d h:m:s");
        recibo.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 200, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setText("Gracias por su compra");
        recibo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 370, 50));

        getContentPane().add(recibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 450));

        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 120, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
PrinterJob grap = PrinterJob.getPrinterJob();
grap.setPrintable(this);
boolean top = grap.printDialog();
if(top){
grap.print();
    }
}
catch(PrinterException pex){
JOptionPane.showMessageDialog(null,"Error al imprimir","error/n"+pex ,JOptionPane.INFORMATION_MESSAGE);
}
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField recibir_total;
    private javax.swing.JTable recibir_venta;
    private javax.swing.JPanel recibo;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graf, PageFormat pagefor, int index) throws PrinterException {

     if(index>0){
         return NO_SUCH_PAGE;
     }   
     Graphics2D hub = (Graphics2D) graf;   
     hub.translate(pagefor.getImageableX()+30,pagefor.getImageableY()+30);
     hub.scale(1.0,1.0);
     
     recibo.printAll(graf);
     return PAGE_EXISTS;
    }
  
}
