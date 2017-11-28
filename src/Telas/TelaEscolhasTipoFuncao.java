
package Telas;

import Classes.ClasseOperacoes;
import javax.swing.JOptionPane;

public class TelaEscolhasTipoFuncao extends javax.swing.JFrame {

    ClasseOperacoes op = new ClasseOperacoes();
    
    public TelaEscolhasTipoFuncao() {
        initComponents();
        opcaoC.setEnabled(false);
        opcaoF.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        opcaoA = new javax.swing.JRadioButton();
        opcaoB = new javax.swing.JRadioButton();
        opcaoC = new javax.swing.JRadioButton();
        opcaoD = new javax.swing.JRadioButton();
        opcaoE = new javax.swing.JRadioButton();
        opcaoF = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de opções");

        jLabel1.setText("ESCOLHA DENTRE OS EXEMPLOS ABAIXO O FORMATO DE SUA FUNÇÃO");

        opcaoA.setText("1 / X");
        opcaoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoAActionPerformed(evt);
            }
        });

        opcaoB.setText("<html>1 / X<sup>2</sup> </html>");
        opcaoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoBActionPerformed(evt);
            }
        });

        opcaoC.setText("sen X");

        opcaoD.setText("<html>e<sup>3x</sup> </html>");
        opcaoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoDActionPerformed(evt);
            }
        });

        opcaoE.setText("<html>e<sup>x^2</sup> </html>");
        opcaoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoEActionPerformed(evt);
            }
        });

        opcaoF.setText("cos X");

        jLabel2.setText("a)");

        jLabel3.setText("b)");

        jLabel4.setText("c)");

        jLabel5.setText("d)");

        jLabel6.setText("e)");

        jLabel7.setText("f)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel2))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(opcaoC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(opcaoA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(opcaoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcaoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcaoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcaoF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcaoA)
                            .addComponent(jLabel2))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcaoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcaoC)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcaoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcaoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcaoF)
                            .addComponent(jLabel7))))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void opcaoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoBActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Opção B selecionada ?");
            if(i == 0){
                new TelaOpcaoB().setVisible(true);
                op.setOpcaoEscolhida("b");
                this.dispose();
            }else{
                opcaoB.setSelected(false);
            } 
    }//GEN-LAST:event_opcaoBActionPerformed

    private void opcaoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoAActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Opção A selecionada ?");
            if(i == 0){
                new TelaOpcaoA().setVisible(true);
                op.setOpcaoEscolhida("a");
                this.dispose();
            }else{
                opcaoA.setSelected(false);
            }
    }//GEN-LAST:event_opcaoAActionPerformed

    private void opcaoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoDActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Opção D selecionada ?");
            if(i == 0){
                new TelaOpcaoD().setVisible(true);
                op.setOpcaoEscolhida("d");
                this.dispose();
            }else{
                opcaoD.setSelected(false);
            }
    }//GEN-LAST:event_opcaoDActionPerformed

    private void opcaoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoEActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Opção E selecionada ?");
            if(i == 0){
                new TelaOpcaoD().setVisible(true);
                op.setOpcaoEscolhida("e");
                this.dispose();
            }else{
                opcaoE.setSelected(false);
            }
    }//GEN-LAST:event_opcaoEActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaEscolhasTipoFuncao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEscolhasTipoFuncao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEscolhasTipoFuncao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEscolhasTipoFuncao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEscolhasTipoFuncao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton opcaoA;
    private javax.swing.JRadioButton opcaoB;
    private javax.swing.JRadioButton opcaoC;
    private javax.swing.JRadioButton opcaoD;
    private javax.swing.JRadioButton opcaoE;
    private javax.swing.JRadioButton opcaoF;
    // End of variables declaration//GEN-END:variables
}
