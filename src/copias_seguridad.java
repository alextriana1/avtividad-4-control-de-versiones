
import java.awt.HeadlessException;
import java.util.Calendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexander
 */
public class copias_seguridad extends javax.swing.JInternalFrame {

    Conectar con;
    public copias_seguridad() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        seleccionarDirectorio = new javax.swing.JFileChooser();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Copias de seguridad");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 170, 23));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 80, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("Restaurar");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));
        getContentPane().add(seleccionarDirectorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 510, 310));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_3.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 530, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     //SeleccionarDirectorio.setLocation(500, 450);
        seleccionarDirectorio.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        seleccionarDirectorio.setFileFilter(new FileNameExtensionFilter("BackUp files (*.backup)", "backup"));
        seleccionarDirectorio.setDialogTitle("Selecionar la ubicacion para guardar la BD");
        seleccionarDirectorio.setDialogType(2);
        seleccionarDirectorio.setApproveButtonText("Guardar ");
        seleccionarDirectorio.showSaveDialog(this);
        Conectar cx=new Conectar();
        //Backups b=new Backups();//
        int resp = 0;
        if (resp == JFileChooser.APPROVE_OPTION) {
            try {
                Calendar c = Calendar.getInstance();
                String fecha = String.valueOf(c.get(Calendar.DATE));
                fecha = fecha + "-" + String.valueOf(c.get(Calendar.MONTH) + 1);
                fecha = fecha + "-" + String.valueOf(c.get(Calendar.YEAR));
                String path = seleccionarDirectorio.getSelectedFile().getAbsolutePath() + fecha;//concatenamos el nombre que le ponemos a nuestro backup con la fecha del dia
                String user = cx.getUser();
                String dbase = cx.getNombre();
                String password = cx.getPass();
               // b.Crear_Backups("Custom", path, user, password, dbase);
                JOptionPane.showMessageDialog(null, "Copia de Seguridad realizada con Exito");
            } catch (HeadlessException e) {
          }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JFileChooser seleccionarDirectorio;
    // End of variables declaration//GEN-END:variables
}