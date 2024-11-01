
package view;

import controller.ControllerSaldo;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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

public class FrameSaldo extends javax.swing.JFrame {
   

  
    public FrameSaldo() {
        
        initComponents();
        
        c = new ControllerSaldo(this);
    }
    
    //getters and setters 

    public ControllerSaldo getC() {
        return c;
    }

    public void setC(ControllerSaldo c) {
        this.c = c;
    }

    public JButton getBtConsultarSaldo() {
        return btConsultarSaldo;
    }

    public void setBtConsultarSaldo(JButton btConsultarSaldo) {
        this.btConsultarSaldo = btConsultarSaldo;
    }

    public JButton getBtMenuSaldo() {
        return btMenuSaldo;
    }

    public void setBtMenuSaldo(JButton btMenuSaldo) {
        this.btMenuSaldo = btMenuSaldo;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
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

    public JTextArea getJtxtAreaSaldo() {
        return jtxtAreaSaldo;
    }

    public void setJtxtAreaSaldo(JTextArea jtxtAreaSaldo) {
        this.jtxtAreaSaldo = jtxtAreaSaldo;
    }

    public JLabel getLblTituloSaldo() {
        return lblTituloSaldo;
    }

    public void setLblTituloSaldo(JLabel lblTituloSaldo) {
        this.lblTituloSaldo = lblTituloSaldo;
    }

    public JTextField getTxtSenhas() {
        return txtSenhas;
    }

    public void setTxtSenhas(JTextField txtSenhas) {
        this.txtSenhas = txtSenhas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloSaldo = new javax.swing.JLabel();
        btConsultarSaldo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSenhas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtAreaSaldo = new javax.swing.JTextArea();
        btMenuSaldo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Saldo");

        lblTituloSaldo.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblTituloSaldo.setForeground(new java.awt.Color(0, 0, 153));
        lblTituloSaldo.setText("VER SALDO");

        btConsultarSaldo.setBackground(new java.awt.Color(0, 0, 153));
        btConsultarSaldo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btConsultarSaldo.setForeground(new java.awt.Color(255, 255, 255));
        btConsultarSaldo.setText("CONSULTAR");
        btConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarSaldoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText(" Senha:");

        jtxtAreaSaldo.setColumns(20);
        jtxtAreaSaldo.setRows(5);
        jtxtAreaSaldo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(jtxtAreaSaldo);

        btMenuSaldo.setBackground(new java.awt.Color(0, 0, 153));
        btMenuSaldo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btMenuSaldo.setForeground(new java.awt.Color(255, 255, 255));
        btMenuSaldo.setText("MENU");
        btMenuSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuSaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btMenuSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(txtSenhas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btConsultarSaldo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(lblTituloSaldo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloSaldo)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSenhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btConsultarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btMenuSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 859, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMenuSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuSaldoActionPerformed
       FrameMenu jm =  new FrameMenu();
       jm.setVisible(true);
       dispose();
       
    }//GEN-LAST:event_btMenuSaldoActionPerformed

    private void btConsultarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarSaldoActionPerformed
        try {
            c.consultarSaldo();
        } catch (SQLException ex) {
            Logger.getLogger(FrameSaldo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btConsultarSaldoActionPerformed

    private ControllerSaldo c;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultarSaldo;
    private javax.swing.JButton btMenuSaldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtxtAreaSaldo;
    private javax.swing.JLabel lblTituloSaldo;
    private javax.swing.JTextField txtSenhas;
    // End of variables declaration//GEN-END:variables
}
