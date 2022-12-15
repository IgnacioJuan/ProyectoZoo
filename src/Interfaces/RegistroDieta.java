package Interfaces;

import Clases.Animal;
import Clases.DetalleDieta;
import Clases.Dieta;
import Clases.Productos;
import java.awt.Component;
import java.util.*;
import javax.swing.JOptionPane;

public class RegistroDieta extends javax.swing.JFrame {

    public static LinkedList dieta = new LinkedList();
 //   DetalleDieta opdieta =new Dieta();
    public int buscar;

    public RegistroDieta() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIdProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtConsultar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdAnimal = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();
        txtIdDieta = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SpinnerCantidad = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 0), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 220, -1));

        jLabel1.setForeground(new java.awt.Color(153, 102, 0));
        jLabel1.setText("ID PRODUCTO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setText("REGISTRO DE DIETA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel3.setForeground(new java.awt.Color(153, 102, 0));
        jLabel3.setText("CANTIDAD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));
        jPanel1.add(txtConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 180, -1));

        jLabel4.setForeground(new java.awt.Color(153, 102, 0));
        jLabel4.setText("ID ANIMAL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));
        jPanel1.add(txtIdAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 220, -1));

        jButtonEliminar.setForeground(new java.awt.Color(153, 102, 0));
        jButtonEliminar.setText("ELIMINAR");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 100, -1));

        txtIdDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdDietaActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 220, -1));

        jButtonGuardar.setForeground(new java.awt.Color(153, 102, 0));
        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        jButtonConsultar.setForeground(new java.awt.Color(153, 102, 0));
        jButtonConsultar.setText("CONSULTAR");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/salir.png"))); // NOI18N
        jButtonSalir.setBorder(null);
        jButtonSalir.setContentAreaFilled(false);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, -1, -1));

        jButtonActualizar.setForeground(new java.awt.Color(153, 102, 0));
        jButtonActualizar.setText("ACTUALIZAR");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/006.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 70));

        jLabel6.setForeground(new java.awt.Color(153, 102, 0));
        jLabel6.setText("ID DIETA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));
        jPanel1.add(SpinnerCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
       Menu remenu = new Menu();
        remenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
   Integer Cant;
        String cant;
        try {
            String consultar = txtConsultar.getText().trim();
          //  Dieta diet;
            DetalleDieta ddiet;
            for (int i = 0; i < RegistroDieta.dieta.size(); i++) {
                ddiet = (DetalleDieta) RegistroDieta.dieta.get(i);
                if (consultar.equalsIgnoreCase(ddiet.getIdDieta())) {
                    txtIdDieta.setText(ddiet.getIdDieta());
                    txtIdAnimal.setText(ddiet.getIdAnimal());
                    txtIdProducto.setText(ddiet.getIdProducto());
                    cant=String.valueOf(ddiet.getCantidad().toString());
                    SpinnerCantidad.setValue(Integer.parseInt(cant));
                    buscar = i;
                    JOptionPane.showMessageDialog(null, "Se ha encontrado la Dieta");
                }else{
                    JOptionPane.showMessageDialog(null, "No Se ha encontrado la Dieta"); 
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        ///limpiamos el campo
        txtConsultar.setText("");
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        int res = JOptionPane.showConfirmDialog(RegistroDieta.this, "Esta seguro de Modificar los datos \nde esta Dieta", "confirmacion", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            try {
                String idDieta = txtIdDieta.getText();
                String idAnimal = txtIdAnimal.getText();
                String idProducto = txtIdProducto.getText();
                Integer Cant =Integer.parseInt(SpinnerCantidad.getValue().toString());

                DetalleDieta ddiet = new DetalleDieta(idDieta,idAnimal,Cant,idProducto);
                RegistroDieta.dieta.set(buscar, ddiet);
                JOptionPane.showMessageDialog(null, "Dieta Modificada");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        LimpiarDatos();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
            System.out.println("Se ha presinado el Boton guardar");
        Integer Cant;
        String edad = "";
        String CAnimal=txtIdAnimal.getText().trim();
        String CProducto= txtIdProducto.getText();
        try {
            if (txtIdAnimal.getText().equals("") || txtIdDieta.getText().equals("") || txtIdProducto.getText().equals("") || SpinnerCantidad.getValue().equals(0)) {
                JOptionPane.showMessageDialog(null, "No ha rellenado todos los campos");
            } else {
                String idDieta = txtIdDieta.getText();
                String idAnimal = txtIdAnimal.getText();
                 String idProducto= txtIdProducto.getText();
                for (int i = 0; i < Registros_Productos.listPro.size(); i++) {
                    Productos pro;
                pro = (Productos) Registros_Productos.listPro.get(i);
                if (CProducto.equalsIgnoreCase(pro.getIdProducto())) {
                   idProducto = CProducto;
                }else{
                JOptionPane.showMessageDialog(null, "No se ha encontrado el IdProducto");

                }
                }
                
                Cant = Integer.parseInt(SpinnerCantidad.getValue().toString());
                Animal ani;
                for (int i = 0; i < RegistroAnimal.listaanimal.size(); i++) {
                ani = (Animal) RegistroAnimal.listaanimal.get(i);
                if (CAnimal.equalsIgnoreCase(ani.getIdAnimal())) {
                   idAnimal = CAnimal;
                }else{
                JOptionPane.showMessageDialog(null, "No se ha encontrado el IdAnimal");

                }
                DetalleDieta ddieta = new DetalleDieta(idDieta,idAnimal, Cant, idProducto);
                dieta.add(ddieta);
                JOptionPane.showMessageDialog(null, "Se ha guardado correctamente");
            
              }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        LimpiarDatos();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int res = JOptionPane.showConfirmDialog(RegistroDieta.this, "Esta seguro de eliminar esta Dieta", "confirmacion", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            try {
                RegistroDieta.dieta.remove(buscar);
                txtIdDieta.setText("");
                txtIdAnimal.setText("");
                txtIdProducto.setText("");
                SpinnerCantidad.setValue(0);

                JOptionPane.showMessageDialog(null, "Dieta Eliminada");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void txtIdDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdDietaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdDietaActionPerformed

    public void LimpiarDatos() {
        //limpiar datos
        txtIdDieta.setText("");
        txtIdAnimal.setText("");
        txtIdProducto.setText("");
        SpinnerCantidad.setValue(0);

    }

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
            java.util.logging.Logger.getLogger(RegistroDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDieta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JSpinner SpinnerCantidad;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtConsultar;
    public static javax.swing.JTextField txtIdAnimal;
    public static javax.swing.JTextField txtIdDieta;
    public static javax.swing.JTextField txtIdProducto;
    // End of variables declaration//GEN-END:variables
}
