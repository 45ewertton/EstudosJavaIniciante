/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Ewertton
 */
public class TelaGenio extends javax.swing.JFrame {

    /**
     * Creates new form TelaGenio
     */
    public TelaGenio() {
        initComponents();
        lblFrase.setText("<html>Vou pensar em um número entre <strong>1 e 10</strong>, tente adivinhar.</html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblFrase = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtValor = new javax.swing.JSpinner();
        btnAdivinhar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        lblFrase.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase.setText("Frase");
        getContentPane().add(lblFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 170, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Escolha um número entre 1 e 10.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, 20));

        txtValor.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 50, 30));

        btnAdivinhar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdivinhar.setForeground(new java.awt.Color(0, 102, 255));
        btnAdivinhar.setText("Adivinhar");
        btnAdivinhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdivinharActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdivinhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/hhhhhhhhh.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -40, 500, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdivinharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdivinharActionPerformed
        // TODO add your handling code here:
        double numAle = 1 + Math.random() * (11-1);
        int valor = (int) numAle;
        
        int valorUser = Integer.parseInt(txtValor.getValue().toString());
        
        String f1, f2, result;
        f1 = "<html><strong>ACERTOU!!!</strong></html>";
        f2 = "<html><strong>ERROU!!!</strong> Eu pensei no valor: " + valor +"<html>";
        
        result = (valor == valorUser) ? f1 : f2 ;
        lblFrase.setText(result);
    }//GEN-LAST:event_btnAdivinharActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdivinhar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JSpinner txtValor;
    // End of variables declaration//GEN-END:variables
}
