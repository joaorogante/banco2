
package view;

import controller.ControllerDeposito;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author João
 */

public class FrameDeposito extends javax.swing.JFrame {

    /**
     * Creates new form JanelaDeposito
     */
    public FrameDeposito() {
        initComponents();
        
        c = new ControllerDeposito(this);
    }
   
    //get and setters 

    public ControllerDeposito getC() {
        return c;
    }

    public void setC(ControllerDeposito c) {
        this.c = c;
    }

    public JButton getBtDepositar() {
        return btDepositar;
    }

    public void setBtDepositar(JButton btDepositar) {
        this.btDepositar = btDepositar;
    }

    public JButton getBtMenuDeposito() {
        return btMenuDeposito;
    }

    public void setBtMenuDeposito(JButton btMenuDeposito) {
        this.btMenuDeposito = btMenuDeposito;
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

    public JTextArea getJtxtAreaDeposito() {
        return jtxtAreaDeposito;
    }

    public void setJtxtAreaDeposito(JTextArea jtxtAreaDeposito) {
        this.jtxtAreaDeposito = jtxtAreaDeposito;
    }

    public JLabel getLblSenha() {
        return lblSenha;
    }

    public void setLblSenha(JLabel lblSenha) {
        this.lblSenha = lblSenha;
    }

    public JLabel getLblTituloDeposito() {
        return lblTituloDeposito;
    }

    public void setLblTituloDeposito(JLabel lblTituloDeposito) {
        this.lblTituloDeposito = lblTituloDeposito;
    }

    public JLabel getLblValorReais() {
        return lblValorReais;
    }

    public void setLblValorReais(JLabel lblValorReais) {
        this.lblValorReais = lblValorReais;
    }

    public JTextField getTxtSenhaDeposito() {
        return txtSenhaDeposito;
    }

    public void setTxtSenhaDeposito(JTextField txtSenhaDeposito) {
        this.txtSenhaDeposito = txtSenhaDeposito;
    }

    public JTextField getTxtValorReais() {
        return txtValorReais;
    }

    public void setTxtValorReais(JTextField txtValorReais) {
        this.txtValorReais = txtValorReais;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSenha = new javax.swing.JLabel();
        lblValorReais = new javax.swing.JLabel();
        txtSenhaDeposito = new javax.swing.JTextField();
        txtValorReais = new javax.swing.JTextField();
        btDepositar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtAreaDeposito = new javax.swing.JTextArea();
        btMenuDeposito = new javax.swing.JButton();
        lblTituloDeposito = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Deposito");

        lblSenha.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(51, 51, 51));
        lblSenha.setText(" Senha:");

        lblValorReais.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblValorReais.setForeground(new java.awt.Color(51, 51, 51));
        lblValorReais.setText("Valor de Deposito:");

        btDepositar.setBackground(new java.awt.Color(51, 0, 204));
        btDepositar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btDepositar.setForeground(new java.awt.Color(255, 255, 255));
        btDepositar.setText("DEPOSITO");
        btDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositarActionPerformed(evt);
            }
        });

        jtxtAreaDeposito.setColumns(20);
        jtxtAreaDeposito.setRows(5);
        jtxtAreaDeposito.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(jtxtAreaDeposito);

        btMenuDeposito.setBackground(new java.awt.Color(51, 0, 204));
        btMenuDeposito.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btMenuDeposito.setForeground(new java.awt.Color(255, 255, 255));
        btMenuDeposito.setText("MENU");
        btMenuDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuDepositoActionPerformed(evt);
            }
        });

        lblTituloDeposito.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblTituloDeposito.setForeground(new java.awt.Color(51, 0, 204));
        lblTituloDeposito.setText("Deposito no Banco");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblValorReais, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSenhaDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(txtValorReais)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(lblTituloDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btDepositar)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btMenuDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenhaDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorReais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorReais))
                .addGap(18, 18, 18)
                .addComponent(btDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btMenuDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(403, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositarActionPerformed
       c.Depositar();
    }//GEN-LAST:event_btDepositarActionPerformed

    private void btMenuDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuDepositoActionPerformed
        FrameMenu jm =  new FrameMenu();
        jm.setVisible(true);
        dispose();

    }//GEN-LAST:event_btMenuDepositoActionPerformed

     private ControllerDeposito c;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDepositar;
    private javax.swing.JButton btMenuDeposito;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtxtAreaDeposito;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTituloDeposito;
    private javax.swing.JLabel lblValorReais;
    private javax.swing.JTextField txtSenhaDeposito;
    private javax.swing.JTextField txtValorReais;
    // End of variables declaration//GEN-END:variables
}
