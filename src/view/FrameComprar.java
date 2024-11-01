
package view;

import controller.ControllerComprar;
import controller.ControllerCotacao;
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

public class FrameComprar extends javax.swing.JFrame {
  
   
    public FrameComprar() {
        initComponents();
        c = new ControllerComprar(this);
         
    }
    
    //GETTERS AND SETTERS

    public ControllerComprar getC() {
        return c;
    }

    public void setC(ControllerComprar c) {
        this.c = c;
    }

    public JButton getBtComprar() {
        return btComprar;
    }

    public void setBtComprar(JButton btComprar) {
        this.btComprar = btComprar;
    }

    public JButton getBtMenuCompra() {
        return btMenuCompra;
    }

    public void setBtMenuCompra(JButton btMenuCompra) {
        this.btMenuCompra = btMenuCompra;
    }

    public JLabel getImg2() {
        return img2;
    }

    public void setImg2(JLabel img2) {
        this.img2 = img2;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
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

    public JLabel getLblSenhaCompra() {
        return lblSenhaCompra;
    }

    public void setLblSenhaCompra(JLabel lblSenhaCompra) {
        this.lblSenhaCompra = lblSenhaCompra;
    }

    public JLabel getLblSenhaOpcaoCompra() {
        return lblSenhaOpcaoCompra;
    }

    public void setLblSenhaOpcaoCompra(JLabel lblSenhaOpcaoCompra) {
        this.lblSenhaOpcaoCompra = lblSenhaOpcaoCompra;
    }

    public JLabel getLblValorCompra() {
        return lblValorCompra;
    }

    public void setLblValorCompra(JLabel lblValorCompra) {
        this.lblValorCompra = lblValorCompra;
    }

    public JLabel getLbltituloCompra() {
        return lbltituloCompra;
    }

    public void setLbltituloCompra(JLabel lbltituloCompra) {
        this.lbltituloCompra = lbltituloCompra;
    }

    public JTextArea getTxtAreaCotacaoCompra() {
        return txtAreaCotacaoCompra;
    }

    public void setTxtAreaCotacaoCompra(JTextArea txtAreaCotacaoCompra) {
        this.txtAreaCotacaoCompra = txtAreaCotacaoCompra;
    }

    public JTextField getTxtOpcaoMoedaCompra() {
        return txtOpcaoMoedaCompra;
    }

    public void setTxtOpcaoMoedaCompra(JTextField txtOpcaoMoedaCompra) {
        this.txtOpcaoMoedaCompra = txtOpcaoMoedaCompra;
    }

    public JTextField getTxtValorCompra() {
        return txtValorCompra;
    }

    public void setTxtValorCompra(JTextField txtValorCompra) {
        this.txtValorCompra = txtValorCompra;
    }

    public JTextField getTxtsenhaCompra() {
        return txtsenhaCompra;
    }

    public void setTxtsenhaCompra(JTextField txtsenhaCompra) {
        this.txtsenhaCompra = txtsenhaCompra;
    }

    
    
    
    @SuppressWarnings(value = "unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbltituloCompra = new javax.swing.JLabel();
        lblSenhaCompra = new javax.swing.JLabel();
        txtsenhaCompra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblSenhaOpcaoCompra = new javax.swing.JLabel();
        lblValorCompra = new javax.swing.JLabel();
        txtOpcaoMoedaCompra = new javax.swing.JTextField();
        txtValorCompra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaCotacaoCompra = new javax.swing.JTextArea();
        btComprar = new javax.swing.JButton();
        btMenuCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comprar");

        lbltituloCompra.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lbltituloCompra.setForeground(new java.awt.Color(0, 0, 204));
        lbltituloCompra.setText("COMPRAR");

        lblSenhaCompra.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblSenhaCompra.setForeground(new java.awt.Color(0, 0, 204));
        lblSenhaCompra.setText(" Senha:");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Digite a opção de compra 7 - Bitcoin 8 - Ethereum 9 - Ripple");

        lblSenhaOpcaoCompra.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblSenhaOpcaoCompra.setForeground(new java.awt.Color(0, 0, 204));
        lblSenhaOpcaoCompra.setText("Opção:");

        lblValorCompra.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblValorCompra.setForeground(new java.awt.Color(0, 0, 204));
        lblValorCompra.setText("Valor:");

        txtOpcaoMoedaCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtAreaCotacaoCompra.setColumns(20);
        txtAreaCotacaoCompra.setRows(5);
        txtAreaCotacaoCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(txtAreaCotacaoCompra);

        btComprar.setBackground(new java.awt.Color(0, 0, 204));
        btComprar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btComprar.setForeground(new java.awt.Color(255, 255, 255));
        btComprar.setText("COMPRAR");
        btComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComprarActionPerformed(evt);
            }
        });

        btMenuCompra.setBackground(new java.awt.Color(0, 0, 153));
        btMenuCompra.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btMenuCompra.setForeground(new java.awt.Color(255, 255, 255));
        btMenuCompra.setText("MENU");
        btMenuCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSenhaOpcaoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorCompra))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtValorCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtOpcaoMoedaCompra)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSenhaCompra)
                        .addGap(26, 26, 26)
                        .addComponent(txtsenhaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(lbltituloCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(btMenuCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbltituloCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsenhaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenhaCompra))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenhaOpcaoCompra)
                    .addComponent(txtOpcaoMoedaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorCompra)
                    .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMenuCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1477, Short.MAX_VALUE)
                .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(574, 574, 574))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(322, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMenuCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuCompraActionPerformed
      FrameMenu  jm = new FrameMenu();
      jm.setVisible(true);
      dispose();
    }//GEN-LAST:event_btMenuCompraActionPerformed

    private void btComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComprarActionPerformed
       c.comprar();
    }//GEN-LAST:event_btComprarActionPerformed

    
   
     private ControllerComprar c;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btComprar;
    private javax.swing.JButton btMenuCompra;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSenhaCompra;
    private javax.swing.JLabel lblSenhaOpcaoCompra;
    private javax.swing.JLabel lblValorCompra;
    private javax.swing.JLabel lbltituloCompra;
    private javax.swing.JTextArea txtAreaCotacaoCompra;
    private javax.swing.JTextField txtOpcaoMoedaCompra;
    private javax.swing.JTextField txtValorCompra;
    private javax.swing.JTextField txtsenhaCompra;
    // End of variables declaration//GEN-END:variables
}
