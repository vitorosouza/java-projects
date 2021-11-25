package com.cursoemvideo.equacao;

public class telaEquacao extends javax.swing.JFrame {

    public telaEquacao() {
        initComponents();
        panResultado.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtA = new javax.swing.JSpinner();
        txtB = new javax.swing.JSpinner();
        txtC = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();
        panResultado = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblDelta = new javax.swing.JLabel();
        lblRaiz = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 121, -1, -1));

        txtA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtAStateChanged(evt);
            }
        });
        getContentPane().add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 60, 30));

        txtB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtBStateChanged(evt);
            }
        });
        getContentPane().add(txtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 60, -1));

        txtC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtCStateChanged(evt);
            }
        });
        getContentPane().add(txtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 60, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("<html>x<SUP>2</SUP>+</html>");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("x +");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("= 0");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        lblB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblB.setForeground(new java.awt.Color(255, 0, 0));
        lblB.setText("B");
        getContentPane().add(lblB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        lblA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblA.setForeground(new java.awt.Color(255, 0, 0));
        lblA.setText("A");
        getContentPane().add(lblA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        lblC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblC.setForeground(new java.awt.Color(255, 0, 0));
        lblC.setText("C");
        getContentPane().add(lblC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("<html>&Delta; =  </html>");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("<html><sup>2</sup>- 4 </html>");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 50, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText(".");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 20, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText(".");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 20, -1));

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Equação do 2º Grau");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 238, -1));

        btnCalc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCalc.setText("<html>Calcular &Delta; </html>");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("<html>Valor de &Delta;</html>");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Tipo de Raízes");

        lblDelta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDelta.setForeground(new java.awt.Color(0, 0, 255));
        lblDelta.setText(" ");

        lblRaiz.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRaiz.setForeground(new java.awt.Color(0, 0, 255));
        lblRaiz.setText(" ");

        javax.swing.GroupLayout panResultadoLayout = new javax.swing.GroupLayout(panResultado);
        panResultado.setLayout(panResultadoLayout);
        panResultadoLayout.setHorizontalGroup(
            panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDelta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        panResultadoLayout.setVerticalGroup(
            panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDelta))
                .addGap(28, 28, 28)
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblRaiz))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 234, 380, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtAStateChanged
        // TODO add your handling code here:
        lblA.setText(txtA.getValue().toString());
    }//GEN-LAST:event_txtAStateChanged

    private void txtBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtBStateChanged
        // TODO add your handling code here:
         lblB.setText(txtB.getValue().toString());
    }//GEN-LAST:event_txtBStateChanged

    private void txtCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtCStateChanged
        // TODO add your handling code here:
        lblC.setText(txtC.getValue().toString());
    }//GEN-LAST:event_txtCStateChanged

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // TODO add your handling code here:
        int a = Integer.parseInt(txtA.getValue().toString());
        int b = Integer.parseInt(txtB.getValue().toString());
        int c = Integer.parseInt(txtC.getValue().toString());
        
        double d = Math.pow(b, 2) - 4 * a * c;
        lblDelta.setText(String.format("%.1f", d));
        
        if (d<0){
            lblRaiz.setText("Não existem raízes Reais");
        } else{
            lblRaiz.setText("Existem raízes Reais");
        }
        
        
        panResultado.setVisible(true);
        
    }//GEN-LAST:event_btnCalcActionPerformed

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
            java.util.logging.Logger.getLogger(telaEquacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaEquacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaEquacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaEquacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaEquacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblDelta;
    private javax.swing.JLabel lblRaiz;
    private javax.swing.JPanel panResultado;
    private javax.swing.JSpinner txtA;
    private javax.swing.JSpinner txtB;
    private javax.swing.JSpinner txtC;
    // End of variables declaration//GEN-END:variables
}
