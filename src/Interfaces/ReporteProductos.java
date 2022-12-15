/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Productos;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ReporteProductos extends javax.swing.JFrame {

    public static LinkedList<Productos> listProductos = new LinkedList<Productos>();

    public ReporteProductos() {
        initComponents();

        for (int i = 0; i < Registros_Productos.listPro.size(); i++) {
            listProductos.add(Registros_Productos.listPro.get(i));
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcb_filtro = new javax.swing.JComboBox<>();
        jtf_Valor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_productos = new javax.swing.JTable();
        btn_buscar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Reporte Productos ");
        jPanel2.add(jLabel1);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jLabel2.setText("Filtro");

        jLabel3.setText("IdProducto");

        jcb_filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Alimentos", "Medicinas", "Implementos de limpieza" }));
        jcb_filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_filtroActionPerformed(evt);
            }
        });

        jtf_Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_ValorActionPerformed(evt);
            }
        });

        jtb_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "IdProducto", "Nombre", "Precio", "Tipo", "Descripcion", "Stock", "IdProveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtb_productos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtb_productos);

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/salir.png"))); // NOI18N
        jButtonSalir.setBorder(null);
        jButtonSalir.setContentAreaFilled(false);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jtf_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar)
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jcb_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalir)
                        .addGap(24, 24, 24))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jcb_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalir))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_buscar))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_ValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_ValorActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        mostrarProductos(jcb_filtro.getSelectedIndex(), jtf_Valor.getText());
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void jcb_filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_filtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_filtroActionPerformed

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
            java.util.logging.Logger.getLogger(ReporteProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteProductos().setVisible(true);
            }
        });
    }

    public void mostrarProductos(int filtro, String busqueda) {
        //Creacion de la tabla
        if (busqueda.equals("")) {
            busqueda = null;
        }
        String matriz[][] = new String[listProductos.size()][7];
        //Todos los registros
        //Si el text field esta vacio
        if (filtro == 0 && busqueda == null) {
            for (int i = 0; i < listProductos.size(); i++) {
                matriz[i][0] = listProductos.get(i).getIdProducto();
                matriz[i][1] = listProductos.get(i).getNombre();
                matriz[i][2] = "" + listProductos.get(i).getPrecio();
                matriz[i][3] = listProductos.get(i).getTipo();
                matriz[i][4] = listProductos.get(i).getDescripcion();
                matriz[i][5] = listProductos.get(i).getStock();
                matriz[i][6] = listProductos.get(i).getIdProveedor();
            }
        } else {
            //Si el textfiel tiene caracteres
            for (int i = 0; i < listProductos.size(); i++) {
                int g = 0;
                if (listProductos.get(i).getIdProducto().equals(busqueda)) {
                    matriz[g][0] = listProductos.get(i).getIdProducto();
                    matriz[g][1] = listProductos.get(i).getNombre();
                    matriz[g][2] = "" + listProductos.get(i).getPrecio();
                    matriz[g][3] = listProductos.get(i).getTipo();
                    matriz[g][4] = listProductos.get(i).getDescripcion();
                    matriz[g][5] = listProductos.get(i).getStock();
                    matriz[g][6] = listProductos.get(i).getIdProveedor();
                    g++;
                }
            }
        }
        //Alimentos
        if (filtro == 1 && busqueda == null) {
            int g = 0;
            for (int i = 0; i < listProductos.size(); i++) {
                if (listProductos.get(i).getTipo().equalsIgnoreCase("alimento")) {
                    matriz[g][0] = listProductos.get(i).getIdProducto();
                    matriz[g][1] = listProductos.get(i).getNombre();
                    matriz[g][2] = "" + listProductos.get(i).getPrecio();
                    matriz[g][3] = listProductos.get(i).getTipo();
                    matriz[g][4] = listProductos.get(i).getDescripcion();
                    matriz[g][5] = listProductos.get(i).getStock();
                    matriz[g][6] = listProductos.get(i).getIdProveedor();
                    g++;
                }
            }
        } else {
            int g = 0;
            for (int i = 0; i < listProductos.size(); i++) {
                if (listProductos.get(i).getTipo().equalsIgnoreCase("alimento") && listProductos.get(i).getIdProducto().equalsIgnoreCase(busqueda)) {
                    matriz[g][0] = listProductos.get(i).getIdProducto();
                    matriz[g][1] = listProductos.get(i).getNombre();
                    matriz[g][2] = "" + listProductos.get(i).getPrecio();
                    matriz[g][3] = listProductos.get(i).getTipo();
                    matriz[g][4] = listProductos.get(i).getDescripcion();
                    matriz[g][5] = listProductos.get(i).getStock();
                    matriz[g][6] = listProductos.get(i).getIdProveedor();
                    g++;
                }
            }
        }
        //Medicinas
        if (filtro == 2 && busqueda == null) {
            int g = 0;
            for (int i = 0; i < listProductos.size(); i++) {
                if (listProductos.get(i).getTipo().equalsIgnoreCase("medicina")) {
                    matriz[g][0] = listProductos.get(i).getIdProducto();
                    matriz[g][1] = listProductos.get(i).getNombre();
                    matriz[g][2] = "" + listProductos.get(i).getPrecio();
                    matriz[g][3] = listProductos.get(i).getTipo();
                    matriz[g][4] = listProductos.get(i).getDescripcion();
                    matriz[g][5] = listProductos.get(i).getStock();
                    matriz[g][6] = listProductos.get(i).getIdProveedor();
                    g++;
                }
            }
        } else {
            int g = 0;
            for (int i = 0; i < listProductos.size(); i++) {
                if (listProductos.get(i).getTipo().equalsIgnoreCase("medicina") && listProductos.get(i).getIdProducto().equalsIgnoreCase(busqueda)) {
                    matriz[g][0] = listProductos.get(i).getIdProducto();
                    matriz[g][1] = listProductos.get(i).getNombre();
                    matriz[g][2] = "" + listProductos.get(i).getPrecio();
                    matriz[g][3] = listProductos.get(i).getTipo();
                    matriz[g][4] = listProductos.get(i).getDescripcion();
                    matriz[g][5] = listProductos.get(i).getStock();
                    matriz[g][6] = listProductos.get(i).getIdProveedor();
                    g++;
                }
            }
        }
        //Limpieza
        if (filtro == 3 && busqueda == null) {
            int g = 0;
            for (int i = 0; i < listProductos.size(); i++) {
                if (listProductos.get(i).getTipo().equalsIgnoreCase("limpieza")) {
                    matriz[g][0] = listProductos.get(i).getIdProducto();
                    matriz[g][1] = listProductos.get(i).getNombre();
                    matriz[g][2] = "" + listProductos.get(i).getPrecio();
                    matriz[g][3] = listProductos.get(i).getTipo();
                    matriz[g][4] = listProductos.get(i).getDescripcion();
                    matriz[g][5] = listProductos.get(i).getStock();
                    matriz[g][6] = listProductos.get(i).getIdProveedor();
                    g++;
                }
            }

        } else {
            int g = 0;
            for (int i = 0; i < listProductos.size(); i++) {
                if (listProductos.get(i).getTipo().equalsIgnoreCase("limpieza") && listProductos.get(i).getIdProducto().equalsIgnoreCase(busqueda)) {
                    matriz[g][0] = listProductos.get(i).getIdProducto();
                    matriz[g][1] = listProductos.get(i).getNombre();
                    matriz[g][2] = "" + listProductos.get(i).getPrecio();
                    matriz[g][3] = listProductos.get(i).getTipo();
                    matriz[g][4] = listProductos.get(i).getDescripcion();
                    matriz[g][5] = listProductos.get(i).getStock();
                    matriz[g][6] = listProductos.get(i).getIdProveedor();
                    g++;
                }
            }
        }
        //Seteo de la tabla
        jtb_productos.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "IdProducto", "Nombre", "Precio", "Tipo", "Descripcion", "Stock", "IdProveedor"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcb_filtro;
    private javax.swing.JTable jtb_productos;
    private javax.swing.JTextField jtf_Valor;
    // End of variables declaration//GEN-END:variables
}