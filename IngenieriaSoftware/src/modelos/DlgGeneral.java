/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Ahri
 */
public class DlgGeneral extends javax.swing.JDialog {

    /**
     * Creates new form DlgGeneral
     */
    public DlgGeneral(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnManejoRegistro = new javax.swing.JMenuItem();
        mnManejoUsuarios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnExcel = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnPedido = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnVolver = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/1234ds.jpg"))); // NOI18N

        jMenu1.setText("Registro");

        mnManejoRegistro.setText("Manejo de registro");
        mnManejoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnManejoRegistroActionPerformed(evt);
            }
        });
        jMenu1.add(mnManejoRegistro);

        mnManejoUsuarios.setText("Manejo de usuarios");
        mnManejoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnManejoUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(mnManejoUsuarios);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Imprimir");

        mnExcel.setText("Generar Excel");
        mnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExcelActionPerformed(evt);
            }
        });
        jMenu2.add(mnExcel);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Pedidos");

        mnPedido.setText("Realizar pedido");
        mnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPedidoActionPerformed(evt);
            }
        });
        jMenu4.add(mnPedido);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Salir");

        mnVolver.setText("Volver ");
        mnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVolverActionPerformed(evt);
            }
        });
        jMenu3.add(mnVolver);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_mnVolverActionPerformed

    private void mnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExcelActionPerformed
        // TODO add your handling code here:
        DlgImprimir dim = new DlgImprimir(new javax.swing.JDialog(), true);
        dim.setVisible(true);
        dim.dispose();
    }//GEN-LAST:event_mnExcelActionPerformed

    private void mnManejoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnManejoRegistroActionPerformed
        // TODO add your handling code here:
        DlgManejoRegistro dmr = new DlgManejoRegistro(new javax.swing.JDialog(), true);
        dmr.setVisible(true);
        dmr.dispose();
    }//GEN-LAST:event_mnManejoRegistroActionPerformed

    private void mnManejoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnManejoUsuariosActionPerformed
        // TODO add your handling code here:
        DlgManejoUsuario du = new DlgManejoUsuario(new javax.swing.JDialog(), true);
        du.setVisible(true);
        du.dispose();
    }//GEN-LAST:event_mnManejoUsuariosActionPerformed

    private void mnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPedidoActionPerformed
        // TODO add your handling code here:
        DlgRealizarPedidos drp = new DlgRealizarPedidos(new javax.swing.JDialog(), true);
        drp.setVisible(true);
        drp.dispose();
    }//GEN-LAST:event_mnPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(DlgGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgGeneral dialog = new DlgGeneral(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mnExcel;
    private javax.swing.JMenuItem mnManejoRegistro;
    private javax.swing.JMenuItem mnManejoUsuarios;
    private javax.swing.JMenuItem mnPedido;
    private javax.swing.JMenuItem mnVolver;
    // End of variables declaration//GEN-END:variables
}
