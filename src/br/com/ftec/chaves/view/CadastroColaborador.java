/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.chaves.view;

/**
 *
 * @author MARCE
 */
public class CadastroColaborador extends javax.swing.JFrame {

    /**
     * Creates new form RetiradaChaves
     */
    public CadastroColaborador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        lblTextoTitulo = new javax.swing.JLabel();
        pnlCadastro = new javax.swing.JPanel();
        lblTextoNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lblTextoCpf = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        lblTextoSenha = new javax.swing.JLabel();
        tfSenha = new javax.swing.JTextField();
        lblTextoTelefone = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        lblTextoEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        pnlLogos = new javax.swing.JPanel();
        lblLogoFtec = new javax.swing.JLabel();
        lblLogoIbgen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFundo.setPreferredSize(new java.awt.Dimension(720, 480));

        lblTextoTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTextoTitulo.setForeground(new java.awt.Color(0, 51, 153));
        lblTextoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextoTitulo.setText("Cadastro de Colaborador");
        lblTextoTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pnlCadastro.setBackground(new java.awt.Color(255, 255, 255));

        lblTextoNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTextoNome.setText("Nome:");

        tfNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        lblTextoCpf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTextoCpf.setText("CPF:");

        tfCpf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lblTextoSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTextoSenha.setText("Senha:");

        tfSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lblTextoTelefone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTextoTelefone.setText("Telefone:");

        tfTelefone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lblTextoEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTextoEmail.setText("Email:");

        tfEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");

        btnSalvar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastroLayout = new javax.swing.GroupLayout(pnlCadastro);
        pnlCadastro.setLayout(pnlCadastroLayout);
        pnlCadastroLayout.setHorizontalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroLayout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addContainerGap())
            .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCadastroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlCadastroLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTextoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTextoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTextoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTextoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.LEADING))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlCadastroLayout.setVerticalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroLayout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addContainerGap())
            .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCadastroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTextoNome))
                    .addGap(18, 18, 18)
                    .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTextoCpf))
                    .addGap(18, 18, 18)
                    .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTextoSenha))
                    .addGap(18, 18, 18)
                    .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTextoTelefone))
                    .addGap(18, 18, 18)
                    .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTextoEmail))
                    .addGap(25, 25, 25)
                    .addComponent(btnSalvar)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnlLogos.setBackground(new java.awt.Color(255, 255, 255));

        lblLogoFtec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ftec/chaves/view/recouse/logo_ftec.png"))); // NOI18N

        lblLogoIbgen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ftec/chaves/view/recouse/logo_ibgen.png"))); // NOI18N

        javax.swing.GroupLayout pnlLogosLayout = new javax.swing.GroupLayout(pnlLogos);
        pnlLogos.setLayout(pnlLogosLayout);
        pnlLogosLayout.setHorizontalGroup(
            pnlLogosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogoIbgen, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlLogosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLogosLayout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(lblLogoFtec)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlLogosLayout.setVerticalGroup(
            pnlLogosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogosLayout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(lblLogoIbgen, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlLogosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLogosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblLogoFtec, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(125, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTextoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(pnlLogos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(pnlCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTextoTitulo)
                .addGap(58, 58, 58)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlLogos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroColaborador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblLogoFtec;
    private javax.swing.JLabel lblLogoIbgen;
    private javax.swing.JLabel lblTextoCpf;
    private javax.swing.JLabel lblTextoEmail;
    private javax.swing.JLabel lblTextoNome;
    private javax.swing.JLabel lblTextoSenha;
    private javax.swing.JLabel lblTextoTelefone;
    private javax.swing.JLabel lblTextoTitulo;
    private javax.swing.JPanel pnlCadastro;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlLogos;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSenha;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
