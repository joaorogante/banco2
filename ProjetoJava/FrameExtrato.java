
package view;

import controller.ControllerExtrato;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.Usuario;

/**
 *
 * @author João
 */

public class FrameExtrato extends javax.swing.JFrame {
        private Usuario clienteLogado;


    /**
     * Creates new form JanelaExtrato
     */
    public FrameExtrato() {
        this.clienteLogado = clienteLogado;
        initComponents();
        c = new ControllerExtrato(this);
    }
    
    
    //getters and setters

    public Usuario getClienteLogado() {
        return clienteLogado;
    }

    public void setClienteLogado(Usuario clienteLogado) {
        this.clienteLogado = clienteLogado;
    }

    public ControllerExtrato getC() {
        return c;
    }

    public void setC(ControllerExtrato c) {
        this.c = c;
    }

    public JButton getBtConsultarExtrato1() {
        return btConsultarExtrato1;
    }

    public void setBtConsultarExtrato1(JButton btConsultarExtrato1) {
        this.btConsultarExtrato1 = btConsultarExtrato1;
    }

    public JButton getBtMenuExtrato() {
        return btMenuExtrato;
    }

    public void setBtMenuExtrato(JButton btMenuExtrato) {
        this.btMenuExtrato = btMenuExtrato;
    }

    public JLabel getImg() {
        return img;
    }

    public void setImg(JLabel img) {
        this.img = img;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getLblsenhaExtrato() {
        return lblsenhaExtrato;
    }

    public void setLblsenhaExtrato(JLabel lblsenhaExtrato) {
        this.lblsenhaExtrato = lblsenhaExtrato;
    }

    public JLabel getLbltituloExtrato() {
        return lbltituloExtrato;
    }

    public void setLbltituloExtrato(JLabel lbltituloExtrato) {
        this.lbltituloExtrato = lbltituloExtrato;
    }

    public JTextArea getTxtAreaExtrato() {
        return txtAreaExtrato;
    }

    public void setTxtAreaExtrato(JTextArea txtAreaExtrato) {
        this.txtAreaExtrato = txtAreaExtrato;
    }

    public JTextField getTxtSenhae() {
        return txtSenhae;
    }

    public void setTxtSenhae(JTextField txtSenhae) {
        this.txtSenhae = txtSenhae;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbltituloExtrato = new javax.swing.JLabel();
        lblsenhaExtrato = new javax.swing.JLabel();
        txtSenhae = new javax.swing.JTextField();
        btConsultarExtrato1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaExtrato = new javax.swing.JTextArea();
        btMenuExtrato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Extrato");

        lbltituloExtrato.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lbltituloExtrato.setForeground(new java.awt.Color(51, 0, 204));
        lbltituloExtrato.setText("EXTRATO");

        lblsenhaExtrato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblsenhaExtrato.setForeground(new java.awt.Color(51, 51, 51));
        lblsenhaExtrato.setText(" Senha:");

        btConsultarExtrato1.setBackground(new java.awt.Color(51, 0, 204));
        btConsultarExtrato1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btConsultarExtrato1.setForeground(new java.awt.Color(255, 255, 255));
        btConsultarExtrato1.setText("CONSULTAR");
        btConsultarExtrato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarExtrato1ActionPerformed(evt);
            }
        });

        txtAreaExtrato.setColumns(20);
        txtAreaExtrato.setRows(5);
        txtAreaExtrato.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(txtAreaExtrato);

        btMenuExtrato.setBackground(new java.awt.Color(0, 0, 204));
        btMenuExtrato.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btMenuExtrato.setForeground(new java.awt.Color(255, 255, 255));
        btMenuExtrato.setText("MENU");
        btMenuExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuExtratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btMenuExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblsenhaExtrato)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSenhae, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(btConsultarExtrato1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(lbltituloExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltituloExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsenhaExtrato)
                    .addComponent(txtSenhae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btConsultarExtrato1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btMenuExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196)
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(283, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMenuExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuExtratoActionPerformed
       FrameMenu jm = new FrameMenu();
       jm.setVisible(true);
       dispose();
       
    }//GEN-LAST:event_btMenuExtratoActionPerformed

    private void btConsultarExtrato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarExtrato1ActionPerformed
       c.notaExtrato();
    }//GEN-LAST:event_btConsultarExtrato1ActionPerformed

       private ControllerExtrato c;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultarExtrato1;
    private javax.swing.JButton btMenuExtrato;
    private javax.swing.JLabel img;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblsenhaExtrato;
    private javax.swing.JLabel lbltituloExtrato;
    private javax.swing.JTextArea txtAreaExtrato;
    private javax.swing.JTextField txtSenhae;
    // End of variables declaration//GEN-END:variables
}
