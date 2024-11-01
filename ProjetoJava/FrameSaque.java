
package view;

import controller.ControllerSaque;
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

public class FrameSaque extends javax.swing.JFrame {
   
    /**
     * Creates new form JanelaSaque
     */
    public FrameSaque() {
     
        initComponents();
        
        c = new ControllerSaque(this);
    }
    
    //geters and setters

    public ControllerSaque getC() {
        return c;
    }

    public void setC(ControllerSaque c) {
        this.c = c;
    }

    public JButton getBtMenuSaque() {
        return btMenuSaque;
    }

    public void setBtMenuSaque(JButton btMenuSaque) {
        this.btMenuSaque = btMenuSaque;
    }

    public JButton getBtSacar() {
        return btSacar;
    }

    public void setBtSacar(JButton btSacar) {
        this.btSacar = btSacar;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getLblSenhas() {
        return lblSenhas;
    }

    public void setLblSenhas(JLabel lblSenhas) {
        this.lblSenhas = lblSenhas;
    }

    public JLabel getLblValorSaque1() {
        return lblValorSaque1;
    }

    public void setLblValorSaque1(JLabel lblValorSaque1) {
        this.lblValorSaque1 = lblValorSaque1;
    }

    public JLabel getLbltituloSaque() {
        return lbltituloSaque;
    }

    public void setLbltituloSaque(JLabel lbltituloSaque) {
        this.lbltituloSaque = lbltituloSaque;
    }

    public JTextArea getTxtAreaSaque() {
        return txtAreaSaque;
    }

    public void setTxtAreaSaque(JTextArea txtAreaSaque) {
        this.txtAreaSaque = txtAreaSaque;
    }

    public JTextField getTxtSenhaSaque() {
        return txtSenhaSaque;
    }

    public void setTxtSenhaSaque(JTextField txtSenhaSaque) {
        this.txtSenhaSaque = txtSenhaSaque;
    }

    public JTextField getTxtValorSaque() {
        return txtValorSaque;
    }

    public void setTxtValorSaque(JTextField txtValorSaque) {
        this.txtValorSaque = txtValorSaque;
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbltituloSaque = new javax.swing.JLabel();
        lblSenhas = new javax.swing.JLabel();
        txtSenhaSaque = new javax.swing.JTextField();
        lblValorSaque1 = new javax.swing.JLabel();
        txtValorSaque = new javax.swing.JTextField();
        btSacar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaSaque = new javax.swing.JTextArea();
        btMenuSaque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Saque");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1247, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbltituloSaque.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lbltituloSaque.setForeground(new java.awt.Color(0, 0, 204));
        lbltituloSaque.setText("SAQUE");

        lblSenhas.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblSenhas.setForeground(new java.awt.Color(51, 51, 51));
        lblSenhas.setText("Senha:");

        lblValorSaque1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblValorSaque1.setForeground(new java.awt.Color(51, 51, 51));
        lblValorSaque1.setText("Valor de Saque:");

        txtValorSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorSaqueActionPerformed(evt);
            }
        });

        btSacar.setBackground(new java.awt.Color(0, 0, 204));
        btSacar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btSacar.setForeground(new java.awt.Color(255, 255, 255));
        btSacar.setText("SACAR");
        btSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSacarActionPerformed(evt);
            }
        });

        txtAreaSaque.setColumns(20);
        txtAreaSaque.setRows(5);
        txtAreaSaque.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(txtAreaSaque);

        btMenuSaque.setBackground(new java.awt.Color(0, 0, 204));
        btMenuSaque.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btMenuSaque.setForeground(new java.awt.Color(255, 255, 255));
        btMenuSaque.setText("MENU");
        btMenuSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuSaqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btMenuSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSenhas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValorSaque1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtValorSaque, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(txtSenhaSaque)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(lbltituloSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltituloSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenhas)
                    .addComponent(txtSenhaSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorSaque1)
                    .addComponent(txtValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btMenuSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(496, 496, 496)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(350, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMenuSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuSaqueActionPerformed
         FrameMenu jm = new FrameMenu();
         jm.setVisible(true);
         dispose();
    }//GEN-LAST:event_btMenuSaqueActionPerformed

    private void btSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSacarActionPerformed
        c.SacarReais();
    }//GEN-LAST:event_btSacarActionPerformed

    private void txtValorSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorSaqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorSaqueActionPerformed

   private ControllerSaque c;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMenuSaque;
    private javax.swing.JButton btSacar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSenhas;
    private javax.swing.JLabel lblValorSaque1;
    private javax.swing.JLabel lbltituloSaque;
    private javax.swing.JTextArea txtAreaSaque;
    private javax.swing.JTextField txtSenhaSaque;
    private javax.swing.JTextField txtValorSaque;
    // End of variables declaration//GEN-END:variables
}
