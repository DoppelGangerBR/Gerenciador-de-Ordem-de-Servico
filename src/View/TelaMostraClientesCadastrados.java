/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ValidaCliente;
import DAO.ClientesDAO;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alvaro
 */
public class TelaMostraClientesCadastrados extends javax.swing.JFrame implements KeyListener {

    String[] dadosClientes = new String[10];
    boolean status = false;

    public TelaMostraClientesCadastrados() throws SQLException {

        initComponents();
        AtualizaTabelaClientes();
        setIcon();
        AjustaTabela();
        TxtBuscaCliente.addKeyListener(this);

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
        BtnEditar = new javax.swing.JButton();
        BtnRemover = new javax.swing.JButton();
        BtnAdicionar = new javax.swing.JButton();
        BtnVisualizar = new javax.swing.JButton();
        BtnBuscaCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxtBuscaCliente = new javax.swing.JTextField();
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
        TabelaClientes.getTableHeader().setReorderingAllowed(false);
        TabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaClientesMouseClicked(evt);
            }
        });
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
            TabelaClientes.getColumnModel().getColumn(7).setResizable(false);
            TabelaClientes.getColumnModel().getColumn(8).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clientes Cadastrados");

        BtnEditar.setBackground(new java.awt.Color(204, 204, 204));
        BtnEditar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imgs/Edit User Male-50.png"))); // NOI18N
        BtnEditar.setText("Editar");
        BtnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnRemover.setBackground(new java.awt.Color(204, 204, 204));
        BtnRemover.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imgs/Remove User Male-48.png"))); // NOI18N
        BtnRemover.setText("Remover");
        BtnRemover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnRemover.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemoverActionPerformed(evt);
            }
        });

        BtnAdicionar.setBackground(new java.awt.Color(204, 204, 204));
        BtnAdicionar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imgs/Add User Male-48.png"))); // NOI18N
        BtnAdicionar.setText("Adicionar");
        BtnAdicionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAdicionar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdicionarActionPerformed(evt);
            }
        });

        BtnVisualizar.setBackground(new java.awt.Color(204, 204, 204));
        BtnVisualizar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtnVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imgs/Find User Male-48.png"))); // NOI18N
        BtnVisualizar.setText("Visualizar");
        BtnVisualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnVisualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVisualizarActionPerformed(evt);
            }
        });

        BtnBuscaCliente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtnBuscaCliente.setText("Buscar");
        BtnBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscaClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Buscar cliente:");

        TxtBuscaCliente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnAdicionar)
                        .addGap(67, 67, 67)
                        .addComponent(BtnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnEditar)
                        .addGap(83, 83, 83)
                        .addComponent(BtnVisualizar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBuscaCliente)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBuscaCliente)
                    .addComponent(jLabel2)
                    .addComponent(TxtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnRemover, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(BtnVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(88, 88, 88))
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

    private void BtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdicionarActionPerformed
        TelaCadastroAlteracaoVisualizacaoClientes abreCadastro = new TelaCadastroAlteracaoVisualizacaoClientes();
        dispose();
        abreCadastro.setStatus(true);
        abreCadastro.setVisible(true);

    }//GEN-LAST:event_BtnAdicionarActionPerformed

    private void BtnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVisualizarActionPerformed
        TelaCadastroAlteracaoVisualizacaoClientes EnviaDadosPraView;
        EnviaDadosPraView = new TelaCadastroAlteracaoVisualizacaoClientes();
        EnviaDadosPraView.setNome(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 1).toString());
        EnviaDadosPraView.setTelefone(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 2).toString());
        EnviaDadosPraView.setCelular(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 3).toString());
        EnviaDadosPraView.setCpfCnpj(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 4).toString());
        EnviaDadosPraView.setEndereco(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 5).toString());
        EnviaDadosPraView.setBairro(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 6).toString());
        EnviaDadosPraView.setNumero(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 7).toString());
        EnviaDadosPraView.setCidade(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 8).toString());
        EnviaDadosPraView.setEstado(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 9).toString());
        EnviaDadosPraView.setMensagem("Visualização");
        EnviaDadosPraView.AlimentaCampos();
        EnviaDadosPraView.DisativaCampos();
        EnviaDadosPraView.setStatus(true);
        dispose();
        EnviaDadosPraView.setVisible(true);
    }//GEN-LAST:event_BtnVisualizarActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        TelaCadastroAlteracaoVisualizacaoClientes EnviaDadosPraView;
        EnviaDadosPraView = new TelaCadastroAlteracaoVisualizacaoClientes();
        EnviaDadosPraView.setId_cliente(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 0).toString());
        EnviaDadosPraView.setNome(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 1).toString());
        EnviaDadosPraView.setTelefone(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 2).toString());
        EnviaDadosPraView.setCelular(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 3).toString());
        EnviaDadosPraView.setCpfCnpj(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 4).toString());
        EnviaDadosPraView.setEndereco(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 5).toString());
        EnviaDadosPraView.setBairro(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 6).toString());
        EnviaDadosPraView.setNumero(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 7).toString());
        EnviaDadosPraView.setCidade(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 8).toString());
        EnviaDadosPraView.setEstado(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 9).toString());
        EnviaDadosPraView.setMensagem("Alteração");
        EnviaDadosPraView.AlimentaCampos();
        EnviaDadosPraView.setStatus(true);
        EnviaDadosPraView.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnEditarActionPerformed

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    private void AjustaTabela() throws SQLException {
        
        //As linhas abaixo servem para definir um tamanho padrão das colunas na tabela
        TabelaClientes.changeSelection(0, 0, false, false);
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
        TabelaClientes.changeSelection(0, 0, false, false);
        //A linha acima serve para sempre que abrir a tabela, a primeira 
        //linha ja venha selecionada automaticamente
    }

    private void BtnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoverActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o cliente selecionado?", "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            try {
                ValidaCliente removeCliente = new ValidaCliente();
                removeCliente.setId_cliente(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 0).toString());
                removeCliente.removeCliente();
                AjustaTabela();
            } catch (SQLException ex) {
                Logger.getLogger(TelaMostraClientesCadastrados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_BtnRemoverActionPerformed

    private void TabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaClientesMouseClicked
        if (isStatus() == true) {
            retornaCliente();
        }

    }//GEN-LAST:event_TabelaClientesMouseClicked

    private void BtnBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscaClienteActionPerformed
        BuscaCliente();
    }//GEN-LAST:event_BtnBuscaClienteActionPerformed
    private void BuscaCliente() { //LIKE = case sensitive | ILIKE = sem case sensitive
        ClientesDAO dm = new ClientesDAO();
        dm.setSql("SELECT * FROM cadastro_clientes WHERE nome ILIKE '%" + TxtBuscaCliente.getText() + "%' and ativo = 1");
        try {
            TabelaClientes.setModel(dm.AlimentaTabelaClientes());
            AjustaTabela();
        } catch (SQLException ex) {
            Logger.getLogger(TelaMostraClientesCadastrados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AtualizaTabelaClientes() throws SQLException {
        ClientesDAO dm = new ClientesDAO();
        dm.setSql("SELECT * FROM cadastro_clientes WHERE ativo = 1");
        TabelaClientes.setModel(dm.AlimentaTabelaClientes());
    }

    private void retornaCliente() {
        TelaNovaOrdemDeServico retornaOsComDados = new TelaNovaOrdemDeServico();
        retornaOsComDados.setId(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 0).toString());
        retornaOsComDados.setNome(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 1).toString());
        retornaOsComDados.setTelefone(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 2).toString());
        retornaOsComDados.setCelular(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 3).toString());
        retornaOsComDados.setCpf(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 4).toString());
        retornaOsComDados.setEndereco(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 5).toString());
        retornaOsComDados.setBairro(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 6).toString());
        retornaOsComDados.setNumero(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 7).toString());
        retornaOsComDados.setCidade(TabelaClientes.getValueAt(TabelaClientes.getSelectedRow(), 8).toString());
        retornaOsComDados.preencheCampos();
        retornaOsComDados.setVisible(true);
        dispose();
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

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/View/imgs/User-100.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdicionar;
    private javax.swing.JButton BtnBuscaCliente;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnRemover;
    private javax.swing.JButton BtnVisualizar;
    private javax.swing.JTable TabelaClientes;
    private javax.swing.JTextField TxtBuscaCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        BuscaCliente();
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            BuscaCliente();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
