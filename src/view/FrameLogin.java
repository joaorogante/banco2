
package view;

import view.FrameCadastro;
import controller.ControllerLogin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Usuario;

/**
 *
 * @author João
 */

public class FrameLogin extends javax.swing.JFrame {
   

    
    public FrameLogin() {
       
        initComponents();
        
        c = new ControllerLogin(this);
    }
    
    //get and setters da janela 

    public ControllerLogin getC() {
        return c;
    }

    public void setC(ControllerLogin c) {
        this.c = c;
    }

    public JButton getBtLogar() {
        return btLogar;
    }

    public void setBtLogar(JButton btLogar) {
        this.btLogar = btLogar;
    }

    public JButton getBtNaoCadastrado() {
        return btNaoCadastrado;
    }

    public void setBtNaoCadastrado(JButton btNaoCadastrado) {
        this.btNaoCadastrado = btNaoCadastrado;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JLabel getLblCpfl() {
        return lblCpfl;
    }

    public void setLblCpfl(JLabel lblCpfl) {
        this.lblCpfl = lblCpfl;
    }

    public JLabel getLblLogin() {
        return lblLogin;
    }

    public void setLblLogin(JLabel lblLogin) {
        this.lblLogin = lblLogin;
    }

    public JLabel getLblMoeda() {
        return lblMoeda;
    }

    public void setLblMoeda(JLabel lblMoeda) {
        this.lblMoeda = lblMoeda;
    }

    public JLabel getLblNaoCadastrado() {
        return lblNaoCadastrado;
    }

    public void setLblNaoCadastrado(JLabel lblNaoCadastrado) {
        this.lblNaoCadastrado = lblNaoCadastrado;
    }

    public JLabel getLblSenhal() {
        return lblSenhal;
    }

    public void setLblSenhal(JLabel lblSenhal) {
        this.lblSenhal = lblSenhal;
    }

    public JTextField getTxtCpf() {
        return txtCpf;
    }

    public void setTxtCpf(JTextField txtCpf) {
        this.txtCpf = txtCpf;
    }

    public JTextField getTxtSenhal() {
        return txtSenhal;
    }

    public void setTxtSenhal(JTextField txtSenhal) {
        this.txtSenhal = txtSenhal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMoeda = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblCpfl = new javax.swing.JLabel();
        lblSenhal = new javax.swing.JLabel();
        txtSenhal = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        btLogar = new javax.swing.JButton();
        btNaoCadastrado = new javax.swing.JButton();
        lblNaoCadastrado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        lblLogin.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(0, 0, 204));
        lblLogin.setText("LOGIN DO BANCO");

        lblCpfl.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCpfl.setForeground(new java.awt.Color(0, 0, 204));
        lblCpfl.setText("CPF:");

        lblSenhal.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblSenhal.setForeground(new java.awt.Color(0, 0, 204));
        lblSenhal.setText("SENHA:");

        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        btLogar.setBackground(new java.awt.Color(0, 0, 204));
        btLogar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btLogar.setForeground(new java.awt.Color(255, 255, 255));
        btLogar.setText("ENTRAR");
        btLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogarActionPerformed(evt);
            }
        });

        btNaoCadastrado.setBackground(new java.awt.Color(0, 0, 204));
        btNaoCadastrado.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btNaoCadastrado.setForeground(new java.awt.Color(255, 255, 255));
        btNaoCadastrado.setText("CADASTRO");
        btNaoCadastrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNaoCadastradoActionPerformed(evt);
            }
        });

        lblNaoCadastrado.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblNaoCadastrado.setText("Vem fazer parte do nosso Banco!!!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSenhal)
                            .addComponent(lblCpfl))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenhal, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNaoCadastrado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogin)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btNaoCadastrado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(btLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogin)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSenhal)
                            .addComponent(txtSenhal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCpfl)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNaoCadastrado)
                    .addComponent(btLogar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNaoCadastrado)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(846, Short.MAX_VALUE)
                .addComponent(lblMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                .addComponent(lblMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        String cpf = txtCpf.getText();
    }//GEN-LAST:event_txtCpfActionPerformed

    private void btNaoCadastradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNaoCadastradoActionPerformed
        // btLogin
        FrameCadastro jc = new FrameCadastro();
        jc.setVisible(true);
        dispose();   
    }//GEN-LAST:event_btNaoCadastradoActionPerformed

    private void btLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogarActionPerformed
      c.loginCliente();
    }//GEN-LAST:event_btLogarActionPerformed

    private ControllerLogin c;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogar;
    private javax.swing.JButton btNaoCadastrado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCpfl;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblMoeda;
    private javax.swing.JLabel lblNaoCadastrado;
    private javax.swing.JLabel lblSenhal;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtSenhal;
    // End of variables declaration//GEN-END:variables

}
