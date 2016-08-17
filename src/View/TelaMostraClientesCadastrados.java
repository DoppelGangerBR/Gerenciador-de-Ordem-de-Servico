/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.ClientesDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alvaro
 */
public class TelaMostraClientesCadastrados extends javax.swing.JFrame {

    /**
     * Creates new form TelaMostraClientesCadastrados
     */
    public TelaMostraClientesCadastrados() throws SQLException {
        
        initComponents();
        AtualizaTabelaClientes();
        TabelaClientes.getColumnModel().getColumn(0).setMinWidth(50);
        TabelaClientes.getColumnModel().getColumn(0).setPreferredWidth(50);
        TabelaClientes.getColumnModel().getColumn(0).setMaxWidth(50);
        TabelaClientes.getColumnModel().getColumn(1).setMinWidth(180);
        TabelaClientes.getColumnModel().getColumn(1).setPreferredWidth(180);
        TabelaClientes.getColumnModel().getColumn(1).setMaxWidth(180);
        TabelaClientes.getColumnModel().getColumn(2).setMinWidth(110);
        TabelaClientes.getColumnModel().getColumn(2).setPreferredWidth(110);
        TabelaClientes.getColumnModel().getColumn(2).setMaxWidth(110);
        TabelaClientes.getColumnModel().getColumn(3).setMinWidth(110);
        TabelaClientes.getColumnModel().getColumn(3).setPreferredWidth(110);
        TabelaClientes.getColumnModel().getColumn(3).setMaxWidth(110);
        TabelaClientes.getColumnModel().getColumn(4).setMinWidth(125);
        TabelaClientes.getColumnModel().getColumn(4).setPreferredWidth(125);
        TabelaClientes.getColumnModel().getColumn(4).setMaxWidth(125);
        TabelaClientes.getColumnModel().getColumn(5).setMinWidth(125);
        TabelaClientes.getColumnModel().getColumn(5).setPreferredWidth(125);
        TabelaClientes.getColumnModel().getColumn(5).setMaxWidth(125);
        TabelaClientes.getColumnModel().getColumn(6).setMinWidth(125);
        TabelaClientes.getColumnModel().getColumn(6).setPreferredWidth(125);
        TabelaClientes.getColumnModel().getColumn(6).setMaxWidth(125);
        TabelaClientes.getColumnModel().getColumn(7).setMinWidth(50);
        TabelaClientes.getColumnModel().getColumn(7).setPreferredWidth(50);
        TabelaClientes.getColumnModel().getColumn(7).setMaxWidth(50);
        TabelaClientes.getColumnModel().getColumn(8).setMinWidth(100);
        TabelaClientes.getColumnModel().getColumn(8).setPreferredWidth(100);
        TabelaClientes.getColumnModel().getColumn(8).setMaxWidth(100);
        TabelaClientes.requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        TabelaClientes.setAutoCreateRowSorter(true);
        TabelaClientes.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        TabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Telefone", "Celular", "CPF/CNPJ", "Endereço", "Bairro", "Numero", "Cidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaClientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TabelaClientes.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(TabelaClientes);
        if (TabelaClientes.getColumnModel().getColumnCount() > 0) {
            TabelaClientes.getColumnModel().getColumn(0).setResizable(false);
            TabelaClientes.getColumnModel().getColumn(0).setPreferredWidth(50);
            TabelaClientes.getColumnModel().getColumn(1).setResizable(false);
            TabelaClientes.getColumnModel().getColumn(1).setPreferredWidth(200);
            TabelaClientes.getColumnModel().getColumn(2).setResizable(false);
            TabelaClientes.getColumnModel().getColumn(2).setPreferredWidth(110);
            TabelaClientes.getColumnModel().getColumn(3).setResizable(false);
            TabelaClientes.getColumnModel().getColumn(3).setPreferredWidth(110);
            TabelaClientes.getColumnModel().getColumn(4).setResizable(false);
            TabelaClientes.getColumnModel().getColumn(4).setPreferredWidth(100);
            TabelaClientes.getColumnModel().getColumn(5).setResizable(false);
            TabelaClientes.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clientes Cadastrados");

        jButton1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imgs/Edit User Male-50.png"))); // NOI18N
        jButton1.setText("Editar");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imgs/Remove User Male-48.png"))); // NOI18N
        jButton2.setText("Remover");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imgs/Add User Male-48.png"))); // NOI18N
        jButton3.setText("Adicionar");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imgs/Find User Male-48.png"))); // NOI18N
        jButton4.setText("Visualizar");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jButton1)
                        .addGap(74, 74, 74)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jMenu1.setText("Opções");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new TelaCadastroClientes().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        TelaVisualizarDadosDoCliente EnviaDadosPraView;
        EnviaDadosPraView = new TelaVisualizarDadosDoCliente();
        EnviaDadosPraView.setNomeV(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 1).toString());
        EnviaDadosPraView.setTelefoneV(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 2).toString());
        EnviaDadosPraView.setCelularV(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 3).toString());
        EnviaDadosPraView.setCpfCnpjV(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 4).toString());
        EnviaDadosPraView.setEnderecoV(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 5).toString());
        EnviaDadosPraView.setBairroV(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 6).toString());
        EnviaDadosPraView.setNumeroV(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 7).toString());
        EnviaDadosPraView.setCidadeV(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 8).toString());        
        EnviaDadosPraView.AlimentaCampos();
        EnviaDadosPraView.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new TelaAlterarCliente().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void AtualizaTabelaClientes() throws SQLException{
        DefaultTableModel dm = new ClientesDAO().AlimentaTabelaClientes();
        TabelaClientes.setModel(dm);
    }
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
            java.util.logging.Logger.getLogger(TelaMostraClientesCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMostraClientesCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMostraClientesCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMostraClientesCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaMostraClientesCadastrados().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaMostraClientesCadastrados.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaClientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
