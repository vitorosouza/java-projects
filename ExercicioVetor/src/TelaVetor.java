
import java.util.Arrays;
import javax.swing.DefaultListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vítor
 */
public class TelaVetor extends javax.swing.JFrame {

        int vetor[] = new int[5];
        DefaultListModel lista = new DefaultListModel();
        int selecionado = 0;
    /**
     * Creates new form TelaVetor
     */
    public TelaVetor() {
        initComponents();
        for (int c = 0; c < vetor.length; c ++){
            lista.addElement(vetor[c]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNum = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnOrdem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSelecionado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstVetor = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, -1));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        btnRemover.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        btnOrdem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOrdem.setText("Ordernar");
        btnOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdemActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrdem, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("vetor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 37, -1));

        lblSelecionado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSelecionado.setText("[0]");
        getContentPane().add(lblSelecionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 37, -1));

        lstVetor.setModel(lista);
        lstVetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstVetorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstVetor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 170, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        vetor[selecionado] = Integer.parseInt(txtNum.getValue().toString());
        lista.removeAllElements();
        for (int c = 0; c < vetor.length; c++ ){
            lista.addElement(vetor[c]);
        }
    }//GEN-LAST:event_btnAddActionPerformed
 
    private void lstVetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstVetorMouseClicked
        selecionado = lstVetor.getSelectedIndex();
        lblSelecionado.setText("[" + selecionado + "]");
    }//GEN-LAST:event_lstVetorMouseClicked

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        vetor [selecionado] = 0;
        lista.removeAllElements();
        for (int c = 0; c < vetor.length; c++){
            lista.addElement(vetor[c]);
        }
        
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdemActionPerformed
        // TODO add your handling code here:
        Arrays.sort(vetor);
        lista.removeAllElements();
        for (int c = 0; c < vetor.length; c++){
            lista.addElement(vetor[c]);
        }
        
    }//GEN-LAST:event_btnOrdemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVetor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnOrdem;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSelecionado;
    private javax.swing.JList<String> lstVetor;
    private javax.swing.JSpinner txtNum;
    // End of variables declaration//GEN-END:variables
}
