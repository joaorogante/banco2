
package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import model.Usuario;
import java.sql.Connection;
import javax.swing.JPanel;


/**
 *
 * @author João
 */

public class FrameMenu extends javax.swing.JFrame {
  
   
    public FrameMenu() {
        
       initComponents();
        
    }

   //get and setters 

    public JButton getBtComprar() {
        return btComprar;
    }

    public void setBtComprar(JButton btComprar) {
        this.btComprar = btComprar;
    }

    public JButton getBtCotação() {
        return btCotação;
    }

    public void setBtCotação(JButton btCotação) {
        this.btCotação = btCotação;
    }

    public JButton getBtDeposito() {
        return btDeposito;
    }

    public void setBtDeposito(JButton btDeposito) {
        this.btDeposito = btDeposito;
    }

    public JButton getBtExtrato() {
        return btExtrato;
    }

    public void setBtExtrato(JButton btExtrato) {
        this.btExtrato = btExtrato;
    }

    public JButton getBtSacar() {
        return btSacar;
    }

    public void setBtSacar(JButton btSacar) {
        this.btSacar = btSacar;
    }

    public JButton getBtSair() {
        return btSair;
    }

    public void setBtSair(JButton btSair) {
        this.btSair = btSair;
    }

    public JButton getBtSaldo() {
        return btSaldo;
    }

    public void setBtSaldo(JButton btSaldo) {
        this.btSaldo = btSaldo;
    }

    public JButton getBtVender() {
        return btVender;
    }

    public void setBtVender(JButton btVender) {
        this.btVender = btVender;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JLabel getTituloMenu() {
        return tituloMenu;
    }

    public void setTituloMenu(JLabel tituloMenu) {
        this.tituloMenu = tituloMenu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloMenu = new javax.swing.JLabel();
        btSaldo = new javax.swing.JButton();
        btComprar = new javax.swing.JButton();
        btCotação = new javax.swing.JButton();
        btExtrato = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btSacar = new javax.swing.JButton();
        btDeposito = new javax.swing.JButton();
        btVender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        tituloMenu.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        tituloMenu.setForeground(new java.awt.Color(0, 0, 153));
        tituloMenu.setText("MENU CONTA");

        btSaldo.setBackground(new java.awt.Color(0, 0, 204));
        btSaldo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btSaldo.setForeground(new java.awt.Color(255, 255, 255));
        btSaldo.setText("SALDO");
        btSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaldoActionPerformed(evt);
            }
        });

        btComprar.setBackground(new java.awt.Color(0, 0, 204));
        btComprar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btComprar.setForeground(new java.awt.Color(255, 255, 255));
        btComprar.setText("COMPRAR");
        btComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComprarActionPerformed(evt);
            }
        });

        btCotação.setBackground(new java.awt.Color(0, 0, 204));
        btCotação.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btCotação.setForeground(new java.awt.Color(255, 255, 255));
        btCotação.setText("COTAÇÃO");
        btCotação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCotaçãoActionPerformed(evt);
            }
        });

        btExtrato.setBackground(new java.awt.Color(0, 0, 204));
        btExtrato.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btExtrato.setForeground(new java.awt.Color(255, 255, 255));
        btExtrato.setText("EXTRATO");
        btExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExtratoActionPerformed(evt);
            }
        });

        btSair.setBackground(new java.awt.Color(0, 0, 204));
        btSair.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btSair.setForeground(new java.awt.Color(255, 255, 255));
        btSair.setText("SAIR");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btSacar.setBackground(new java.awt.Color(0, 0, 204));
        btSacar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btSacar.setForeground(new java.awt.Color(255, 255, 255));
        btSacar.setText("SACAR");
        btSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSacarActionPerformed(evt);
            }
        });

        btDeposito.setBackground(new java.awt.Color(0, 0, 204));
        btDeposito.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btDeposito.setForeground(new java.awt.Color(255, 255, 255));
        btDeposito.setText("DEPÓSITO");
        btDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositoActionPerformed(evt);
            }
        });

        btVender.setBackground(new java.awt.Color(0, 0, 204));
        btVender.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btVender.setForeground(new java.awt.Color(255, 255, 255));
        btVender.setText("VENDER");
        btVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btVender, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(btCotação, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(btSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addComponent(btSacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(tituloMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMenu)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCotação, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btVender, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(411, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaldoActionPerformed
       FrameSaldo js = new FrameSaldo();
       js.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btSaldoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_btSairActionPerformed

    private void btExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExtratoActionPerformed
        FrameExtrato je = new FrameExtrato();
        je.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btExtratoActionPerformed

    private void btDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositoActionPerformed
      
      FrameDeposito jd = new FrameDeposito();
      jd.setVisible(true);
      dispose();
 
   
    }//GEN-LAST:event_btDepositoActionPerformed
  @SuppressWarnings("unchecked")
    private void btComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComprarActionPerformed
       
        FrameComprar jc = new FrameComprar();
        jc.setVisible(true);
        dispose();
    }//GEN-LAST:event_btComprarActionPerformed

    private void btVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVenderActionPerformed
      FrameVender jv = new FrameVender();
      jv.setVisible(true);
       dispose();
    }//GEN-LAST:event_btVenderActionPerformed

    private void btSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSacarActionPerformed
      FrameSaque js = new FrameSaque();
      js.setVisible(true);
       dispose();
    }//GEN-LAST:event_btSacarActionPerformed

    private void btCotaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCotaçãoActionPerformed
      FrameCotacao jc = new FrameCotacao();
      jc.setVisible(true);
       dispose();
    }//GEN-LAST:event_btCotaçãoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btComprar;
    private javax.swing.JButton btCotação;
    private javax.swing.JButton btDeposito;
    private javax.swing.JButton btExtrato;
    private javax.swing.JButton btSacar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSaldo;
    private javax.swing.JButton btVender;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tituloMenu;
    // End of variables declaration//GEN-END:variables
}
