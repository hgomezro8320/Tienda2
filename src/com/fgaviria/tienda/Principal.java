/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fgaviria.tienda;

import Configuracion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fgavi
 */
public class Principal extends javax.swing.JFrame {
    
    Conexion cn = new Conexion();
    DefaultTableModel model;
    Connection con;
    Statement st;
    ResultSet rs;
    int id = 0;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        listar();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtProd = new javax.swing.JTextField();
        txtCan = new javax.swing.JTextField();
        txtPre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnAgr = new javax.swing.JButton();
        btnEdi = new javax.swing.JButton();
        btnEli = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PRODUCTOS DE LA TIENDA");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel2.setText("ID:");

        jLabel3.setText("Productos:");

        jLabel4.setText("Cantidad:");

        jLabel5.setText("Precio:");

        txtId.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCan)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnAgr.setText("Agregar");
        btnAgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrActionPerformed(evt);
            }
        });

        btnEdi.setText("Editar");
        btnEdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdiActionPerformed(evt);
            }
        });

        btnEli.setText("Eliminar");
        btnEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnAgr)
                .addGap(98, 98, 98)
                .addComponent(btnEdi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEli)
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgr, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEdi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEli, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Productos"));

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Cantidad", "Precio"
            }
        ));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);
        if (TablaDatos.getColumnModel().getColumnCount() > 0) {
            TablaDatos.getColumnModel().getColumn(0).setMinWidth(40);
            TablaDatos.getColumnModel().getColumn(0).setPreferredWidth(40);
            TablaDatos.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrActionPerformed
        Agregar(); 
        listar();
        nuevo();
    }//GEN-LAST:event_btnAgrActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        int row = TablaDatos.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "No se Selecciono");
        } else {
            id = Integer.parseInt((String) TablaDatos.getValueAt(row, 0).toString());
            String prod = (String) TablaDatos.getValueAt(row, 1);
            int can = (int) TablaDatos.getValueAt(row, 2);
            int val = (int) TablaDatos.getValueAt(row, 3);
            txtId.setText("" + id);
            txtProd.setText(prod);
            txtCan.setText("" + can);
            txtPre.setText("" + val);

        }
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void btnEdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdiActionPerformed
        Modificar(); 
        listar();
        nuevo();
    }//GEN-LAST:event_btnEdiActionPerformed

    private void btnEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliActionPerformed
        Eliminar();
        listar();
        nuevo();
    }//GEN-LAST:event_btnEliActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    void listar() {
        String sql = "select * from productos";
        try {
            con = cn.getConexion();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            Object[] tienda = new Object[4]; 
            model = (DefaultTableModel) TablaDatos.getModel();
            while (rs.next()) {
                tienda[0] = rs.getInt("id");
                tienda[1] = rs.getString("producto");
                tienda[2] = rs.getInt("cantidad");
                tienda[3] = rs.getInt("valor_unitario");
                model.addRow(tienda);
            }
            TablaDatos.setModel(model);

        } catch (Exception e) {
        }

    }
    
    void Agregar() {
        String prod = txtProd.getText();
        String can = txtCan.getText().trim();
        String val = txtPre.getText().trim();
        try {
            if (prod.equals("") || (can.equals("")) || (val.equals(""))) {
                JOptionPane.showMessageDialog(null, "Debe Ingresar Datos");
                limpiarTabla(model);               
            } else {
                String sql = "insert into productos(producto,cantidad,valor_unitario) values('" + prod + "'," + can + "," + val + ")";
                con = cn.getConexion();
                st = con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Producto Registrado con Exito");
                limpiarTabla(model);
            }

        } catch (Exception e) {
        }
    }
    
    void nuevo() {
        txtId.requestFocus();
        txtProd.setText("");
        txtCan.setText("");
        txtPre.setText("");
    }
    
    void Modificar() {
        String prod = txtProd.getText();
        String can = txtCan.getText();
        String val = txtPre.getText();
        String sql = "update productos set producto='" + prod + "',cantidad=" + can + ",valor_unitario=" + val + " where Id=" + id;
        try {
            if (prod != null || val != null) {
                con = cn.getConexion();
                st = con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Producto Modificado");
                limpiarTabla(model);
            } else {
                JOptionPane.showMessageDialog(null, "Error datos no seleccionados");
                limpiarTabla(model);
            }
        } catch (Exception e) {
        }

    }
    
    void Eliminar() {
        String sql = "delete from productos where id=" + id;        
        int fila = TablaDatos.getSelectedRow();
        try {
            if (fila < 0) {
                JOptionPane.showMessageDialog(null,"Producto no Seleccionado");
                limpiarTabla(model);
            } else {
                con = cn.getConexion();
                st = con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Producto Eliminado");
                limpiarTabla(model);
            }
        }catch (Exception e) {}

    }
    
    void limpiarTabla(DefaultTableModel model) {
        for (int i = 0; i <= TablaDatos.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btnAgr;
    private javax.swing.JButton btnEdi;
    private javax.swing.JButton btnEli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCan;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPre;
    private javax.swing.JTextField txtProd;
    // End of variables declaration//GEN-END:variables
}