
package Interfaces;

import java.util.LinkedList;
import Clases.Veterinario;
import Clases.Cuidadores;
import Clases.Guardia;
import javax.swing.JOptionPane;
public class RegistroUsuario extends javax.swing.JFrame {
    //Array
    LinkedList<Veterinario> listaveterinarios=new LinkedList<>();
    LinkedList<Cuidadores> listacuidadores=new LinkedList<>();
    LinkedList<Guardia> listaguardias=new LinkedList<>();
    
    public RegistroUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CBTIpoRegistro = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        TablaUsuarios = new javax.swing.JScrollPane();
        TableUsuarios = new javax.swing.JTable();
        jButtonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/users.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONTRASEÑA:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CEDULA:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        CBTIpoRegistro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veterinario", "Guardia", "Cuidador" }));
        CBTIpoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTIpoRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(CBTIpoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 110, 30));

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 110, 40));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 180, 40));
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 180, 40));
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 180, 40));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registrar como:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        TableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cedula", "Usuario", "Contraseña", "Tipo"
            }
        ));
        TableUsuarios.setRowHeight(30);
        TablaUsuarios.setViewportView(TableUsuarios);

        getContentPane().add(TablaUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 530, 140));

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/salir.png"))); // NOI18N
        jButtonSalir.setBorder(null);
        jButtonSalir.setContentAreaFilled(false);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        if (txtCedula.getText().equals("")||txtUsuario.getText().equals("")||
            txtContraseña.getText().equals("")||CBTIpoRegistro.getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Revise existen campos vacios");
        }else{
            //GUARDAR VETERINARIOS
        Veterinario miveterinario=new Veterinario();
        miveterinario.setDNI(this.txtCedula.getText());
        miveterinario.setUsuario(this.txtUsuario.getText());
        miveterinario.setContraseña(this.txtContraseña.getText());
        miveterinario.setCargo(this.CBTIpoRegistro.getSelectedItem().toString());
        listaveterinarios.add(miveterinario);
        //GUARDAR CUIDADORES
        Cuidadores micuidador=new Cuidadores();
        micuidador.setDNI(this.txtCedula.getText());
        micuidador.setUsuario(this.txtUsuario.getText());
        micuidador.setContraseña(this.txtContraseña.getText());
        micuidador.setCargo(this.CBTIpoRegistro.getSelectedItem().toString());
        //GUARDAR GUARDIAS
        Guardia miguardia=new Guardia();
        miguardia.setDNI(this.txtCedula.getText());
        miguardia.setUsuario(this.txtUsuario.getText());
        miguardia.setContraseña(this.txtContraseña.getText());
        miguardia.setCargo(this.CBTIpoRegistro.getSelectedItem().toString());
        MostrarVeterinarios();
        MostrarCuidadores();
        MostrarGuardias();
        //Actualizar Datos
        txtCedula.setText("");
        txtUsuario.setText("");
        txtContraseña.setText("");
        CBTIpoRegistro.setSelectedIndex(0);
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed
    public void MostrarVeterinarios(){
        String matriz[][]=new String[listaveterinarios.size()][4];
        for (int i = 0; i < listaveterinarios.size(); i++) {
            matriz[i][0]=listaveterinarios.get(i).getDNI();
            matriz[i][1]=listaveterinarios.get(i).getUsuario();
            matriz[i][2]=listaveterinarios.get(i).getContraseña();
            matriz[i][3]=listaveterinarios.get(i).getCargo();
            TableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Cedula", "Usuario", "Contraseña", "Tipo"
            }
        ));
        }
    }
    public void MostrarCuidadores(){
    String matriz[][]=new String[listacuidadores.size()][4];
        for (int i = 0; i < listacuidadores.size(); i++) {
            matriz[i][0]=listacuidadores.get(i).getDNI();
            matriz[i][1]=listacuidadores.get(i).getUsuario();
            matriz[i][2]=listacuidadores.get(i).getContraseña();
            matriz[i][3]=listacuidadores.get(i).getCargo();
            TableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Cedula", "Usuario", "Contraseña", "Tipo"
            }
        ));
        }
        }

    public void MostrarGuardias(){
    String matriz[][]=new String[listaguardias.size()][4];
        for (int i = 0; i < listaguardias.size(); i++) {
            matriz[i][0]=listaguardias.get(i).getDNI();
            matriz[i][1]=listaguardias.get(i).getUsuario();
            matriz[i][2]=listaguardias.get(i).getContraseña();
            matriz[i][3]=listaguardias.get(i).getCargo();
        TableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Cedula", "Usuario", "Contraseña", "Tipo"
            }
        ));
        }
}
    private void CBTIpoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTIpoRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBTIpoRegistroActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        Menu remenu = new Menu();
        remenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBTIpoRegistro;
    private javax.swing.JScrollPane TablaUsuarios;
    private javax.swing.JTable TableUsuarios;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
