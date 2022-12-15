
package Interfaces;


import javax.swing.JOptionPane;
import Clases.Admin;
public class LoginInterfaz extends javax.swing.JFrame {
  //variables
    public static String password;
    boolean correcto=false;
    public LoginInterfaz() {
        initComponents();
      setLocationRelativeTo(null); //centrar la ventana
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtContraseña = new javax.swing.JPasswordField();
        contraseña = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ButtonIniciarS = new javax.swing.JButton();
        Icon = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        btnRestablecerContraseña = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 422));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        ButtonSalir.setBorder(null);
        ButtonSalir.setBorderPainted(false);
        ButtonSalir.setContentAreaFilled(false);
        ButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtContraseña.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 190, 30));

        contraseña.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        contraseña.setForeground(new java.awt.Color(153, 102, 0));
        contraseña.setText("CONTRASEÑA:");
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, 20));

        TxtUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 190, 30));

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 65)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NIA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("SimSun-ExtB", 1, 65)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 102, 0));
        jLabel2.setText("ZOO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("SimSun-ExtB", 1, 65)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 102, 0));
        jLabel5.setText("NAR");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("SimSun-ExtB", 1, 65)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ZOOLOGICO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/colorbi.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 340, 340));

        ButtonIniciarS.setBackground(new java.awt.Color(204, 102, 0));
        ButtonIniciarS.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        ButtonIniciarS.setText("INICIAR SECION");
        ButtonIniciarS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonIniciarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIniciarSActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonIniciarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 120, 30));

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/login.png"))); // NOI18N
        jPanel1.add(Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, 250));

        usuario.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(153, 102, 0));
        usuario.setText("USUARIO:");
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, 20));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/unnamed.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-830, 0, 1160, 500));

        btnRestablecerContraseña.setText("RESTABLECER CONTRASEÑA");
        btnRestablecerContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestablecerContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRestablecerContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonSalirActionPerformed

    private void ButtonIniciarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIniciarSActionPerformed
        Admin  miadmin=new Admin();
        RestablecerContraseña ventana=new RestablecerContraseña();
        miadmin.setUsuario("Admin");
        String user=miadmin.getUsuario();
        miadmin.setContraseña("admin123");
         password=miadmin.getContraseña();
         String usuario=this.TxtUsuario.getText();
         String contraseña=this.txtContraseña.getText();
        if (usuario.trim().equals(user)&&contraseña.trim().equals(ventana.nuevacontraseña)) {
            correcto=true;
            Menu acceso=new Menu();
            acceso.setVisible(true);
            this.setVisible(false);
        }else{
            if (usuario.trim().equals(user)&&contraseña.trim().equals(password)) {
            correcto=true;
            Menu acceso=new Menu();
            acceso.setVisible(true);
            this.setVisible(false); 
        }
        }
        if (usuario.trim().equals(user)) {
            JOptionPane.showMessageDialog(null, "Usuario Correcto");
        }else{
            JOptionPane.showMessageDialog(null, "Usuario Incorrecto");
        }
        if (contraseña.trim().equals(ventana.nuevacontraseña)) {
            JOptionPane.showMessageDialog(null, "Contraseña Correcta");
        }else
            if (contraseña.trim().equals(password)) {
            JOptionPane.showMessageDialog(null, "Contraseña Correcta");
        }else{
            JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");         
        }
    }//GEN-LAST:event_ButtonIniciarSActionPerformed

    private void btnRestablecerContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestablecerContraseñaActionPerformed
      RestablecerContraseña acceso=new RestablecerContraseña();
      acceso.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btnRestablecerContraseñaActionPerformed
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(LoginInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(LoginInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(LoginInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(LoginInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonIniciarS;
    private javax.swing.JButton ButtonSalir;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Icon;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JButton btnRestablecerContraseña;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
