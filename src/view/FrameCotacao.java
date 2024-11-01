
package view;

import controller.ControllerCotacao;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import model.Usuario;

/**
 *
 * @author João
 */

public class FrameCotacao extends javax.swing.JFrame {

    /**
     * Creates new form JanelaCotacao
     */
    public FrameCotacao() {
         
        initComponents();
        c =  new ControllerCotacao(this);
    }
    
    //getters and setters

    public ControllerCotacao getC() {
        return c;
    }

    public void setC(ControllerCotacao c) {
        this.c = c;
    }

    public JButton getBtCotar() {
        return btCotar;
    }

    public void setBtCotar(JButton btCotar) {
        this.btCotar = btCotar;
    }

    public JButton getBtMenuCota() {
        return btMenuCota;
    }

    public void setBtMenuCota(JButton btMenuCota) {
        this.btMenuCota = btMenuCota;
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

    public JLabel getLbltituloCotacao() {
        return lbltituloCotacao;
    }

    public void setLbltituloCotacao(JLabel lbltituloCotacao) {
        this.lbltituloCotacao = lbltituloCotacao;
    }

    public JTextArea getTxtAreaCotacao() {
        return txtAreaCotacao;
    }

    public void setTxtAreaCotacao(JTextArea txtAreaCotacao) {
        this.txtAreaCotacao = txtAreaCotacao;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaCotacao = new javax.swing.JTextArea();
        lbltituloCotacao = new javax.swing.JLabel();
        btCotar = new javax.swing.JButton();
        btMenuCota = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cotação");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(51, 0, 204));

        txtAreaCotacao.setColumns(20);
        txtAreaCotacao.setRows(5);
        jScrollPane1.setViewportView(txtAreaCotacao);

        lbltituloCotacao.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lbltituloCotacao.setForeground(new java.awt.Color(51, 0, 204));
        lbltituloCotacao.setText("COTAÇÃO DA MOEDA");

        btCotar.setBackground(new java.awt.Color(51, 0, 204));
        btCotar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btCotar.setForeground(new java.awt.Color(255, 255, 255));
        btCotar.setText("COTAÇÃO");
        btCotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCotarActionPerformed(evt);
            }
        });

        btMenuCota.setBackground(new java.awt.Color(0, 0, 204));
        btMenuCota.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btMenuCota.setForeground(new java.awt.Color(255, 255, 255));
        btMenuCota.setText("MENU");
        btMenuCota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuCotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btMenuCota, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbltituloCotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btCotar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltituloCotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btCotar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btMenuCota, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(453, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 172, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMenuCotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuCotaActionPerformed
       FrameMenu jm = new FrameMenu();
       jm.setVisible(true);
       dispose();
    }//GEN-LAST:event_btMenuCotaActionPerformed

    private void btCotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCotarActionPerformed
        c.Cotacao();
    }//GEN-LAST:event_btCotarActionPerformed

     ControllerCotacao c;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCotar;
    private javax.swing.JButton btMenuCota;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltituloCotacao;
    private javax.swing.JTextArea txtAreaCotacao;
    // End of variables declaration//GEN-END:variables
}
