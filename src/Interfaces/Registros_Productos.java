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
 * @author Usuario
 */
public class Registros_Productos extends javax.swing.JFrame {

    /**
     * Creates new form Registros_Productos
     */
   public static  LinkedList<Productos> listPro = new LinkedList<Productos>();
    Productos pro = null;
    String idPro = "";
    String nomPro = "";
    String precioPro = "";
    String stock = "";
    String idProveedor = "";
    String descripcion = "";
    String tipoProducto = "";

    public Registros_Productos() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelBuscarCedula = new javax.swing.JLabel();
        txtBuscarCod = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_idProducto = new javax.swing.JTextField();
        CBTipo_Producto = new javax.swing.JComboBox<>();
        txt_nombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        txt_idProvedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPane_Description = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 88, 635, 16));

        jLabel1.setText("REGISTRO DE PRODUCTOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 10, -1, -1));

        jLabel2.setText("Id Producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        labelBuscarCedula.setText("Id Producto");
        getContentPane().add(labelBuscarCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));
        getContentPane().add(txtBuscarCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 348, -1));

        jLabel5.setText("Precio");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel6.setText("Tipo de Producto");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));
        getContentPane().add(txt_idProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        CBTipo_Producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimento", "Medicina", "Productos Limpieza " }));
        CBTipo_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTipo_ProductoActionPerformed(evt);
            }
        });
        getContentPane().add(CBTipo_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 170, -1));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 170, -1));

        jLabel7.setText("ID Provedoor");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        jLabel8.setText("Stock");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));
        getContentPane().add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 150, -1));
        getContentPane().add(txt_idProvedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 150, -1));

        jScrollPane1.setViewportView(txtPane_Description);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 290, 70));

        jLabel9.setText("Descripcion");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 110, -1, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, -1, -1));

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id_Producto", "Nombre Producto", "Precio ", "Tipo Producto", "Descripción", "Stock", "Id_Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableProductos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 590, 100));

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/salir.png"))); // NOI18N
        jButtonSalir.setBorder(null);
        jButtonSalir.setContentAreaFilled(false);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBTipo_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTipo_ProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBTipo_ProductoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        String idProducto = txt_idProducto.getText();
        String nombrePro = txt_nombre.getText();
        Double precio = Double.parseDouble(txtPrecio.getText());
        String stock = txtStock.getText();
        String idProvedoor = txt_idProvedor.getText();
        String descripcion = txtPane_Description.getText();
        String tipo = CBTipo_Producto.getSelectedItem().toString();

        Productos produc = new Productos(idProducto, nombrePro, descripcion, precio, tipo, stock, idProvedoor);
        txt_idProducto.setText("");
        txt_nombre.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        txt_idProvedor.setText("");
        txtPane_Description.setText("");
        CBTipo_Producto.setSelectedItem("Alimento");
        listPro.add(produc);
        mostrar();
    }

    public void mostrar() {
        String matris[][] = new String[listPro.size()][7];
        for (int i = 0; i < listPro.size(); i++) {
            matris[i][0] = listPro.get(i).getIdProducto();
            matris[i][1] = listPro.get(i).getNombre();
            matris[i][2] = ""+listPro.get(i).getPrecio();
            matris[i][3] = listPro.get(i).getTipo();
            matris[i][4] = listPro.get(i).getDescripcion();
            matris[i][5] = listPro.get(i).getStock();
            matris[i][6] = listPro.get(i).getIdProveedor();

        }
        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "Id_Producto", "Nombre Producto", "Precio ", "Tipo Producto", "Descripción", "Stock", "Id_Proveedor"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if (pro != null) {
            String idProducto = txt_idProducto.getText();
            String nombrePro = txt_nombre.getText();
             Double precio = Double.parseDouble(txtPrecio.getText());
            String stock = txtStock.getText();
            String idProvedoor = txt_idProducto.getText();
            String descripcion = txtPane_Description.getText();
            String tipoProducto = CBTipo_Producto.getSelectedItem().toString();
            pro.setIdProducto(idProducto);
            pro.setNombre(nombrePro);
            pro.setPrecio(precio);
            pro.setStock(stock);
            pro.setIdProveedor(idProvedoor);
            pro.setDescripcion(descripcion);
            pro.setTipo(tipoProducto);
            txtBuscarCod.setText("");
            txt_idProducto.setText("");
            txt_nombre.setText("");
            txtPrecio.setText("");
            txtStock.setText("");
            txt_idProvedor.setText("");
            txtPane_Description.setText("");
            CBTipo_Producto.setSelectedItem("");
            pro = null;
            mostrar();
        } else {
            JOptionPane.showMessageDialog(null, "No hay productos para modificar");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < listPro.size(); i++) {
            if (idPro == listPro.get(i).getIdProducto()) {
                listPro.remove(i);
            }
        }
        String matris[][] = new String[listPro.size()][7];
        for (int i = 0; i < listPro.size(); i++) {
            matris[i][0] = listPro.get(i).getIdProducto();
            matris[i][1] = listPro.get(i).getNombre();
            matris[i][2] = ""+listPro.get(i).getPrecio();
            matris[i][3] = listPro.get(i).getStock();
            matris[i][4] = listPro.get(i).getIdProveedor();
            matris[i][5] = listPro.get(i).getDescripcion();
            matris[i][6] = listPro.get(i).getTipo();

        }
        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "Id_Producto", "Nombre Producto", "Precio ", "Tipo Producto", "Descripción", "Stock", "Id_Proveedor"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        String BuscarCod = txtBuscarCod.getText();
        boolean encontrar = false;
        for (int i = 0; i < listPro.size(); i++) {
            if (listPro.get(i).getIdProducto().equalsIgnoreCase(BuscarCod)) {
                pro = listPro.get(i);
                encontrar = true;
            }
        }
        if (encontrar == true) {
            txt_idProducto.setText(pro.getIdProducto());
            txt_nombre.setText(pro.getNombre());
            txtPrecio.setText(""+pro.getPrecio());
            txtStock.setText(pro.getStock());
            txt_idProvedor.setText(pro.getIdProveedor());
            txtPane_Description.setText(pro.getDescripcion());
            CBTipo_Producto.setSelectedItem(pro.getTipo());
        } else {
            txtBuscarCod.setText("");
            txt_idProducto.setText("");
            txt_nombre.setText("");
            txtPrecio.setText("");
            txtStock.setText("");
            txt_idProvedor.setText("");
            txtPane_Description.setText("");
            CBTipo_Producto.setSelectedItem("");
             JOptionPane.showMessageDialog(null, "No se encontro el producto");
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(Registros_Productos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registros_Productos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registros_Productos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registros_Productos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registros_Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBTipo_Producto;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JLabel labelBuscarCedula;
    private javax.swing.JTextField txtBuscarCod;
    private javax.swing.JTextPane txtPane_Description;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txt_idProducto;
    private javax.swing.JTextField txt_idProvedor;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
