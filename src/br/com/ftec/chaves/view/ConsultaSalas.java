/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.chaves.view;

import br.com.ftec.chaves.controller.ColaboradorDAO;
import br.com.ftec.chaves.controller.ReservaDAO;
import br.com.ftec.chaves.controller.SalaDAO;
import br.com.ftec.chaves.model.Colaborador;
import br.com.ftec.chaves.model.Reserva;
import br.com.ftec.chaves.model.Sala;

/**
 *
 * @author MARCE
 */
public class ConsultaSalas extends javax.swing.JFrame {

    /**
     * Creates new form RetiradaChaves
     */
    public ConsultaSalas() {
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
        pnlConsulta = new javax.swing.JPanel();
        tfData = new javax.swing.JTextField();
        lblTextoData = new javax.swing.JLabel();
        lblTextoTurno = new javax.swing.JLabel();
        tfTurno = new javax.swing.JTextField();
        tfResponsavel = new javax.swing.JTextField();
        lblTextoResponsavel = new javax.swing.JLabel();
        lblTextoSala = new javax.swing.JLabel();
        tfSala = new javax.swing.JTextField();
        btnReserva = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tQuadroDisponibilidade = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 480));

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFundo.setMaximumSize(new java.awt.Dimension(720, 480));
        pnlFundo.setPreferredSize(new java.awt.Dimension(720, 480));

        lblTextoTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTextoTitulo.setForeground(new java.awt.Color(0, 51, 153));
        lblTextoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextoTitulo.setText("Consulta de Salas");
        lblTextoTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pnlConsulta.setBackground(new java.awt.Color(255, 255, 255));

        tfData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataActionPerformed(evt);
            }
        });

        lblTextoData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTextoData.setText("Data:");

        lblTextoTurno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTextoTurno.setText("Turno:");

        tfTurno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        tfResponsavel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfResponsavelActionPerformed(evt);
            }
        });

        lblTextoResponsavel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTextoResponsavel.setText("Responsável:");

        lblTextoSala.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTextoSala.setText("Sala:");

        tfSala.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSalaActionPerformed(evt);
            }
        });

        btnReserva.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnReserva.setText("Reserva");
        btnReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConsultaLayout = new javax.swing.GroupLayout(pnlConsulta);
        pnlConsulta.setLayout(pnlConsultaLayout);
        pnlConsultaLayout.setHorizontalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultaLayout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(btnReserva)
                .addGap(94, 94, 94))
            .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlConsultaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTextoResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlConsultaLayout.createSequentialGroup()
                                .addComponent(lblTextoTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))
                        .addComponent(lblTextoSala, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTextoData, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfResponsavel)
                        .addComponent(tfTurno)
                        .addComponent(tfData)
                        .addComponent(tfSala, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlConsultaLayout.setVerticalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultaLayout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(btnReserva)
                .addContainerGap())
            .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlConsultaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTextoSala, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTextoResponsavel)
                        .addComponent(tfResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTextoTurno))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTextoData)
                        .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(61, Short.MAX_VALUE)))
        );

        tQuadroDisponibilidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tQuadroDisponibilidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Manha", null, null, null, null, "", null},
                {"Tarde", null, null, null, null, "", null},
                {"Noite", null, null, null, null, "", null}
            },
            new String [] {
                "", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"
            }
        ));
        jScrollPane1.setViewportView(tQuadroDisponibilidade);

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                .addComponent(lblTextoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(pnlConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblTextoTitulo)
                .addGap(18, 18, 18)
                .addComponent(pnlConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSalaActionPerformed

    private void btnReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaActionPerformed
        Reserva reserva = new Reserva();
        
        reserva.setDia(tfData.getText());
        reserva.setTurno(tfTurno.getText());
        
        SalaDAO salaDAO = new SalaDAO();
        Sala sala = salaDAO.buscarSalaPorSala(tfSala.getText());
        reserva.setSala(sala);
        
        ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
        Colaborador colaborador = colaboradorDAO.buscarColaboradorPorCpf(tfResponsavel.getText());
        reserva.setColaborador(colaborador);
        
        ReservaDAO reservaDAO = new ReservaDAO();
        reservaDAO.salvar(reserva);
        
    }//GEN-LAST:event_btnReservaActionPerformed

    private void tfDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDataActionPerformed

    private void tfResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfResponsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfResponsavelActionPerformed

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

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaSalas().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReserva;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTextoData;
    private javax.swing.JLabel lblTextoResponsavel;
    private javax.swing.JLabel lblTextoSala;
    private javax.swing.JLabel lblTextoTitulo;
    private javax.swing.JLabel lblTextoTurno;
    private javax.swing.JPanel pnlConsulta;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JTable tQuadroDisponibilidade;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfResponsavel;
    private javax.swing.JTextField tfSala;
    private javax.swing.JTextField tfTurno;
    // End of variables declaration//GEN-END:variables
}
