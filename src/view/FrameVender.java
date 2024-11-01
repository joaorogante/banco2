
package view;

import controller.ControllerCotacao;
import controller.ControllerVender;
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

public class FrameVender extends javax.swing.JFrame {
   

    /**
     * Creates new form JanelaVender
     */
    public FrameVender() {
     
        initComponents();
        c = new ControllerVender(this);
       
    }

   //geters and setters

    public ControllerVender getC() {
        return c;
    }

    public void setC(ControllerVender c) {
        this.c = c;
    }

    public JButton getBtMenuVender() {
        return btMenuVender;
    }

    public void setBtMenuVender(JButton btMenuVender) {
        this.btMenuVender = btMenuVender;
    }

    public JButton getBtVender() {
        return btVender;
    }

    public void setBtVender(JButton btVender) {
        this.btVender = btVender;
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

    public JLabel getLblSenhaOpcaoCompra() {
        return lblSenhaOpcaoCompra;
    }

    public void setLblSenhaOpcaoCompra(JLabel lblSenhaOpcaoCompra) {
        this.lblSenhaOpcaoCompra = lblSenhaOpcaoCompra;
    }

    public JLabel getLblSenhaVenda() {
        return lblSenhaVenda;
    }

    public void setLblSenhaVenda(JLabel lblSenhaVenda) {
        this.lblSenhaVenda = lblSenhaVenda;
    }

    public JLabel getLblValorVenda() {
        return lblValorVenda;
    }

    public void setLblValorVenda(JLabel lblValorVenda) {
        this.lblValorVenda = lblValorVenda;
    }

    public JLabel getLbltituloVender() {
        return lbltituloVender;
    }

    public void setLbltituloVender(JLabel lbltituloVender) {
        this.lbltituloVender = lbltituloVender;
    }

    public JTextArea getTxtAreaCotacaoVenda() {
        return txtAreaCotacaoVenda;
    }

    public void setTxtAreaCotacaoVenda(JTextArea txtAreaCotacaoVenda) {
        this.txtAreaCotacaoVenda = txtAreaCotacaoVenda;
    }

    public JTextField getTxtOpcaoMoedaVenda() {
        return txtOpcaoMoedaVenda;
    }

    public void setTxtOpcaoMoedaVenda(JTextField txtOpcaoMoedaVenda) {
        this.txtOpcaoMoedaVenda = txtOpcaoMoedaVenda;
    }

    public JTextField getTxtValorVenda() {
        return txtValorVenda;
    }

    public void setTxtValorVenda(JTextField txtValorVenda) {
        this.txtValorVenda = txtValorVenda;
    }

    public JTextField getTxtsenhaVenda() {
        return txtsenhaVenda;
    }

    public void setTxtsenhaVenda(JTextField txtsenhaVenda) {
        this.txtsenhaVenda = txtsenhaVenda;
    }

    

   
    
    @SuppressWarnings(value = "unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbltituloVender = new javax.swing.JLabel();
        lblSenhaVenda = new javax.swing.JLabel();
        txtsenhaVenda = new javax.swing.JTextField();
        lblSenhaOpcaoCompra = new javax.swing.JLabel();
        txtOpcaoMoedaVenda = new javax.swing.JTextField();
        lblValorVenda = new javax.swing.JLabel();
        txtValorVenda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btVender = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaCotacaoVenda = new javax.swing.JTextArea();
        btMenuVender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vender");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbltituloVender.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lbltituloVender.setForeground(new java.awt.Color(0, 0, 204));
        lbltituloVender.setText("VENDER");

        lblSenhaVenda.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblSenhaVenda.setForeground(new java.awt.Color(51, 51, 51));
        lblSenhaVenda.setText("Digite a senha:");

        lblSenhaOpcaoCompra.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblSenhaOpcaoCompra.setForeground(new java.awt.Color(51, 51, 51));
        lblSenhaOpcaoCompra.setText("Escolha uma Opção:");

        txtOpcaoMoedaVenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblValorVenda.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblValorVenda.setForeground(new java.awt.Color(51, 51, 51));
        lblValorVenda.setText("Valor para Vender:");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Digite a opção: 6 -Bitcoin 7 - Ethereum 8 - Ripple");

        btVender.setBackground(new java.awt.Color(0, 0, 204));
        btVender.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btVender.setForeground(new java.awt.Color(255, 255, 255));
        btVender.setText("VENDER");
        btVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVenderActionPerformed(evt);
            }
        });

        txtAreaCotacaoVenda.setColumns(20);
        txtAreaCotacaoVenda.setRows(5);
        txtAreaCotacaoVenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(txtAreaCotacaoVenda);

        btMenuVender.setBackground(new java.awt.Color(0, 0, 204));
        btMenuVender.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btMenuVender.setForeground(new java.awt.Color(255, 255, 255));
        btMenuVender.setText("MENU");
        btMenuVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuVenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSenhaOpcaoCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValorVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValorVenda)
                            .addComponent(txtOpcaoMoedaVenda))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSenhaVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbltituloVender, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsenhaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(397, 397, 397)
                                .addComponent(btVender, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(18, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(btMenuVender, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltituloVender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenhaVenda)
                    .addComponent(txtsenhaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenhaOpcaoCompra)
                    .addComponent(txtOpcaoMoedaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorVenda)
                    .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVender))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btMenuVender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMenuVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuVenderActionPerformed
       FrameMenu jm = new FrameMenu();
       jm.setVisible(true);
       dispose();
      
        
    }//GEN-LAST:event_btMenuVenderActionPerformed

    private void btVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVenderActionPerformed
        c.vender();
    }//GEN-LAST:event_btVenderActionPerformed

   
   private ControllerVender c;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMenuVender;
    private javax.swing.JButton btVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSenhaOpcaoCompra;
    private javax.swing.JLabel lblSenhaVenda;
    private javax.swing.JLabel lblValorVenda;
    private javax.swing.JLabel lbltituloVender;
    private javax.swing.JTextArea txtAreaCotacaoVenda;
    private javax.swing.JTextField txtOpcaoMoedaVenda;
    private javax.swing.JTextField txtValorVenda;
    private javax.swing.JTextField txtsenhaVenda;
    // End of variables declaration//GEN-END:variables
}
