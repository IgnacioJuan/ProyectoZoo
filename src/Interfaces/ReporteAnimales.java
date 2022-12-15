/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Animal;
import static Interfaces.RegistroAnimal.*;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class ReporteAnimales extends javax.swing.JFrame {
 private DefaultTableModel modelo ;
   int contador=0;        

    public ReporteAnimales() {
        initComponents();
       this.setLocationRelativeTo(null);
       CargarModelo();
      CargarDatos();
    }

   private void CargarModelo(){ //establecemos un modelo de tabla
    try{
        String datos[][]={};
        String columna[]={"ID ANIMAL","NOMBRE CIENTIFICO","NOMBRE VULGAR","PESO","EDAD","SEXO","ORIGEN","FECHA INGRESO", "FECHA NACIMIENTO","DESCRIPCION"};
        modelo=new DefaultTableModel(datos,columna);
        jTableAnimales.setModel(modelo);
    }catch(Exception e){
        System.out.println(e);
    }
}
private void CargarDatos(){
    Animal aanimal;
    try{
        for (int i = 0; i < RegistroAnimal.listaanimal.size(); i++) {
            aanimal=(Animal)RegistroAnimal.listaanimal.get(i);
            modelo.insertRow(contador, new Object[]{});
            modelo.setValueAt(aanimal.getIdAnimal(), contador, 0);
            modelo.setValueAt(aanimal.getNombre_cienti(), contador, 1);
            modelo.setValueAt(aanimal.getNombre_vulga(), contador, 2);
            modelo.setValueAt(aanimal.getPeso(), contador, 3);
            modelo.setValueAt(aanimal.getEdad(), contador, 4);
            modelo.setValueAt(aanimal.getSexo(),contador,5);
            modelo.setValueAt(aanimal.getOrigen(),contador,6);
            modelo.setValueAt(aanimal.getFecha_ingreso(), contador, 7);
            modelo.setValueAt(aanimal.getFecha_nacimiento(), contador, 8);
            modelo.setValueAt(aanimal.getDescripcion(), contador, 9);
            
            
        }
    }catch(Exception ex){
        System.out.println(ex);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAnimales = new javax.swing.JTable();
        txtConsultarAnimales = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableAnimales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID ANIMAL", "NOMBRE CIENTIFICO", "NOMBRE VULGAR", "PESO", "EDAD", "SEXO", "ORIGEN", "FECHA INGRESO", "FECHA NACIMIENTO", "DESCRIPCION"
            }
        ));
        jScrollPane1.setViewportView(jTableAnimales);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 830, 300));

        txtConsultarAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultarAnimalesActionPerformed(evt);
            }
        });
        jPanel1.add(txtConsultarAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 450, -1));

        jButtonBuscar.setForeground(new java.awt.Color(102, 51, 0));
        jButtonBuscar.setText("BUSCAR");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, -1, -1));

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/salir.png"))); // NOI18N
        jButtonSalir.setBorder(null);
        jButtonSalir.setContentAreaFilled(false);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
       
        String valor = txtConsultarAnimales.getText();
        
        for (int i = 0; i < jTableAnimales.getRowCount(); i++) {
            if (jTableAnimales.getValueAt(i, 0).equals(valor)||jTableAnimales.getValueAt(i, 1).equals(valor) ||jTableAnimales.getValueAt(i, 2).equals(valor)||jTableAnimales.getValueAt(i, 7).equals(valor)||jTableAnimales.getValueAt(i, 8).equals(valor)   ) {
                //    Tablaxd.requestFocus();
                jTableAnimales.changeSelection(i, 0, false, false);
                animal.setText(String.valueOf(jTableAnimales.getValueAt(i, 0)));
                nombrecien.setText(String.valueOf(jTableAnimales.getValueAt(i, 1)));
                nombrevulg.setText(String.valueOf(jTableAnimales.getValueAt(i, 2)));
                peso.setText(String.valueOf(jTableAnimales.getValueAt(i, 3)));
                edad.setText(String.valueOf(jTableAnimales.getValueAt(i, 4)));
                origen.setText(String.valueOf(jTableAnimales.getValueAt(i, 6)));
                fecha_ingreso.setDate(Date.(jTableAnimales.getValueAt(i, 7)));
                fecha_nacimiento.setDate(Date.valueOf(jTableAnimales.getValueAt(i, 8)));
                descripcion.setText(String.valueOf(jTableAnimales.getValueAt(i, 9)));
                String sexo = (String.valueOf(jTableAnimales.getValueAt(i, 5)));

                if ("Macho".equals(sexo)) {
                    macho.setSelected(true);
                } else if ("hembra" == sexo) {
                    hembra.setSelected(true);
                }
            }
            
        }   
              
            


    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void txtConsultarAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultarAnimalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultarAnimalesActionPerformed

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
            java.util.logging.Logger.getLogger(ReporteAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ReporteAnimales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAnimales;
    private javax.swing.JTextField txtConsultarAnimales;
    // End of variables declaration//GEN-END:variables
}
