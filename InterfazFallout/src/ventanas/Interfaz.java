/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.JOptionPane;

/**
 *
 * @author Adrian
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1Icono = new javax.swing.JLabel();
        jLabelUsu = new javax.swing.JLabel();
        jLabelContra = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        jButtonIniSes = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        jLabel1Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/DFDF.png"))); // NOI18N
        getContentPane().add(jLabel1Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabelUsu.setBackground(new java.awt.Color(0, 102, 51));
        jLabelUsu.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 14)); // NOI18N
        jLabelUsu.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsu.setText("Usuario:");
        getContentPane().add(jLabelUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jLabelContra.setBackground(new java.awt.Color(0, 102, 51));
        jLabelContra.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 14)); // NOI18N
        jLabelContra.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContra.setText("Contraseña:");
        getContentPane().add(jLabelContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        txtusuario.setBackground(new java.awt.Color(0, 102, 51));
        txtusuario.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 14)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(255, 255, 255));
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 110, -1));

        Password.setBackground(new java.awt.Color(0, 102, 51));
        Password.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 110, -1));

        jButtonIniSes.setBackground(new java.awt.Color(0, 102, 51));
        jButtonIniSes.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 14)); // NOI18N
        jButtonIniSes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIniSes.setText("Iniciar Sesión");
        jButtonIniSes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonIniSesMouseClicked(evt);
            }
        });
        jButtonIniSes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniSesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIniSes, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dsdsd.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void jButtonIniSesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniSesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIniSesActionPerformed

    private void jButtonIniSesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIniSesMouseClicked
        String Usuario = "";
        String Contraseña = "";
        
        String Pass = new String (Password.getPassword());
        if(txtusuario.getText().equals(Usuario) && Pass.equals(Contraseña)){
            Saludo Sl = new Saludo ();
            Sl.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Usuario y/o Contraseña incorrecta");
        }
    }//GEN-LAST:event_jButtonIniSesMouseClicked

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonIniSes;
    private javax.swing.JLabel jLabel1Icono;
    private javax.swing.JLabel jLabelContra;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelUsu;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
