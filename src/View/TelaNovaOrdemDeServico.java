package View;

import Controller.ValidaOS;
import DAO.OrdemServicoDAO;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;

public class TelaNovaOrdemDeServico extends javax.swing.JFrame implements KeyListener {

    String[] dadosOs = new String[9];
    private String Nome, Endereco, Bairro, Cidade, Numero, Telefone, Celular, Cpf, id, estado;
    private String Equipamento, Marca, Modelo, Acessorio, NumSerie, ProblemaReclamado, obsos;
    private String aberta_fechada, statusOs;
    private int id_os;

    public TelaNovaOrdemDeServico() {
        initComponents();
        setIcon();
        addKeyListener(this);
        TxtProblemaReclamadoOS.addKeyListener(this);
        TxtNomeCliente.addKeyListener(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtEnderecoCliente = new javax.swing.JTextField();
        TxtBairroCliente = new javax.swing.JTextField();
        TxtCidadeCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtCelularCliente = new javax.swing.JFormattedTextField();
        TxtCpfCnpj = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        LabelNumeroOs = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TxtNumeroEndCliente = new javax.swing.JTextField();
        TxtNomeCliente = new javax.swing.JTextField();
        BtnBuscaCliente = new javax.swing.JButton();
        TxtTelefone = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TxtEquipOs = new javax.swing.JTextField();
        TxtModelEquipOs = new javax.swing.JTextField();
        TxtMarcaEquipOs = new javax.swing.JTextField();
        TxtNumSerieEquipOs = new javax.swing.JTextField();
        TxtAcessorioObsOs = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtProblemaReclamadoOS = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtObs = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        LabelStatus = new javax.swing.JLabel();
        BtnSalvar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Nova ordem de serviço");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Informações do cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Nome.:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Endereço.:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Bairro.:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Cidade.:");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("CPF.:");

        TxtEnderecoCliente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        TxtBairroCliente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        TxtCidadeCliente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Telefone.:");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("Celular.:");

        try {
            TxtCelularCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtCelularCliente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        TxtCpfCnpj.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setText("Nº OS:");

        LabelNumeroOs.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel15.setText("Nº");

        TxtNumeroEndCliente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        TxtNomeCliente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        BtnBuscaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imgs/Search-16.png"))); // NOI18N
        BtnBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscaClienteActionPerformed(evt);
            }
        });

        try {
            TxtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtTelefone.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TxtEnderecoCliente)
                                .addComponent(TxtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNumeroEndCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtCelularCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelNumeroOs, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabelNumeroOs, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(TxtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BtnBuscaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel15)
                                .addComponent(TxtNumeroEndCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TxtCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TxtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Informações sobre Serviço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 12))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 153));
        jLabel9.setText("Equipamento.:");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setText("Marca.:");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel11.setText("Modelo.:");

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel12.setText("Nº de Serie.:");

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel13.setText("Acessorios:");

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 153));
        jLabel14.setText("Problema reclamado.:");

        TxtEquipOs.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        TxtModelEquipOs.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        TxtMarcaEquipOs.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        TxtNumSerieEquipOs.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        TxtAcessorioObsOs.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        TxtProblemaReclamadoOS.setColumns(20);
        TxtProblemaReclamadoOS.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TxtProblemaReclamadoOS.setLineWrap(true);
        TxtProblemaReclamadoOS.setRows(5);
        jScrollPane1.setViewportView(TxtProblemaReclamadoOS);

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel16.setText("Observações:");

        TxtObs.setColumns(20);
        TxtObs.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TxtObs.setLineWrap(true);
        TxtObs.setRows(5);
        jScrollPane2.setViewportView(TxtObs);

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel17.setText("STATUS:");

        LabelStatus.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtAcessorioObsOs, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtModelEquipOs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtEquipOs))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(TxtMarcaEquipOs, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel10))
                                    .addComponent(TxtNumSerieEquipOs, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(LabelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEquipOs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtMarcaEquipOs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtModelEquipOs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNumSerieEquipOs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAcessorioObsOs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        BtnSalvar.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        BtnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imgs/Save Close-50.png"))); // NOI18N
        BtnSalvar.setText("Salvar");
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });

        BtnCancelar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imgs/Cancel-48.png"))); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalvar)
                    .addComponent(BtnCancelar))
                .addContainerGap())
        );

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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ConfirmaSaida();
    }//GEN-LAST:event_formWindowClosing

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
        try {
            SalvaOs();
        } catch (JRException ex) {
            Logger.getLogger(TelaNovaOrdemDeServico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnSalvarActionPerformed
    private void SalvaOs() throws JRException {
        boolean status = false;
        ValidaOS controllerOs = new ValidaOS();
        if ((getId()) == null) {
            JOptionPane.showMessageDialog(null, "Nenhum cliente selecionado\nPor favor, tente novamente!");
        } else {
            controllerOs.setIdCliente(getId());
            controllerOs.setId_os(LabelNumeroOs.getText());
            controllerOs.setNomeCliente(TxtNomeCliente.getText());
            controllerOs.setEnderecoCliente(TxtEnderecoCliente.getText());
            controllerOs.setNumeroEnderecoCliente(TxtNumeroEndCliente.getText());
            controllerOs.setTelefoneCliente(TxtTelefone.getText());
            controllerOs.setCelularCliente(TxtCelularCliente.getText());
            controllerOs.setBairroCliente(TxtBairroCliente.getText());
            controllerOs.setCpfCnpjCliente(TxtCelularCliente.getText());
            controllerOs.setCidadeCliente(TxtCidadeCliente.getText());
            controllerOs.setEquipamentoOs(TxtEquipOs.getText());
            controllerOs.setMarcaEquipOs(TxtMarcaEquipOs.getText());
            controllerOs.setModeloEquipOs(TxtModelEquipOs.getText());
            controllerOs.setNumeroSerieOs(TxtNumSerieEquipOs.getText());
            controllerOs.setAcessorioOs(TxtAcessorioObsOs.getText());
            controllerOs.setProblemaReclamadoOs(TxtProblemaReclamadoOS.getText());
            controllerOs.setObsOs(TxtObs.getText());
            try {
                status = controllerOs.VerificaCamposObrigatorios();
            } catch (SQLException ex) {
                Logger.getLogger(TelaNovaOrdemDeServico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (status == true) {
            dispose();
        }
    }
    private void BtnBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscaClienteActionPerformed
        try {
            TelaMostraClientesCadastrados selecionaCliente = new TelaMostraClientesCadastrados();
            selecionaCliente.setStatus(true);
            selecionaCliente.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(TelaNovaOrdemDeServico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnBuscaClienteActionPerformed
    private void ConfirmaSaida() {
        int x = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar a abertura da OS?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            dispose();
        }
    }
    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        ConfirmaSaida();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        OrdemServicoDAO retornaId = new OrdemServicoDAO();
        if (LabelNumeroOs.getText().equals("")) {
            try {

                LabelNumeroOs.setText(Integer.toString(retornaId.retornaID()));
            } catch (SQLException ex) {
                Logger.getLogger(TelaNovaOrdemDeServico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            LabelNumeroOs.setText(String.valueOf(getId_os()));
        }

    }//GEN-LAST:event_formWindowOpened
    public void preencheCamposBuscaCliente() {
        TxtTelefone.setText(getTelefone());
        TxtNomeCliente.setText(getNome());
        TxtCelularCliente.setText(getCelular());
        TxtCpfCnpj.setText(getCpf());
        TxtEnderecoCliente.setText(getEndereco());
        TxtBairroCliente.setText(getBairro());
        TxtNumeroEndCliente.setText(getNumero());
        TxtCidadeCliente.setText(getCidade());
    }

    public void VisualizaOs() {
        PreencheCamposVisualizacaoOs();
    }

    private void PreencheCamposVisualizacaoOs() {
        TravaCampos();
        setaStatus();
        LabelNumeroOs.setText(Integer.toString(getId_os()));
        TxtNomeCliente.setText(getNome());
        TxtAcessorioObsOs.setText(getAcessorio());
        TxtBairroCliente.setText(getBairro());
        TxtCelularCliente.setText(getCelular());
        TxtCidadeCliente.setText(getCidade());
        TxtCpfCnpj.setText(getCpf());
        TxtEnderecoCliente.setText(getEndereco());
        TxtEquipOs.setText(getEquipamento());
        TxtMarcaEquipOs.setText(getMarca());
        TxtModelEquipOs.setText(getModelo());
        TxtNumSerieEquipOs.setText(getNumSerie());
        TxtNumeroEndCliente.setText(getNumero());
        TxtProblemaReclamadoOS.setText(getProblemaReclamado());
        TxtTelefone.setText(getTelefone());
        TxtObs.setText(getObsos());
        BtnCancelar.setText("Fechar");
    }
    private void setaStatus(){
        if(getStatusOs().equals("OK")){
            LabelStatus.setText("OK");
            LabelStatus.setBackground(Color.green);
        }if(getStatusOs().equals("Em atraso 3-7 dias")){
            LabelStatus.setText("Em atraso 3-7 dias");
            LabelStatus.setBackground(Color.yellow);
        }if(getStatusOs().equals("Em atraso +7 dias")){
            LabelStatus.setText("Em atraso +7 dias");
            LabelStatus.setBackground(Color.red);
        }if(getStatusOs().equals("FECHADA")){
            LabelStatus.setText("FECHADA");
            LabelStatus.setBackground(Color.blue);
        }
    }

    private void TravaCampos() {
        TxtNomeCliente.setEditable(false);
        TxtAcessorioObsOs.setEditable(false);
        TxtBairroCliente.setEditable(false);
        TxtCelularCliente.setEditable(false);
        TxtCidadeCliente.setEditable(false);
        TxtCpfCnpj.setEditable(false);
        TxtEnderecoCliente.setEditable(false);
        TxtEquipOs.setEditable(false);
        TxtMarcaEquipOs.setEditable(false);
        TxtModelEquipOs.setEditable(false);
        TxtNumSerieEquipOs.setEditable(false);
        TxtNumeroEndCliente.setEditable(false);
        TxtProblemaReclamadoOS.setEditable(false);
        TxtTelefone.setEditable(false);
        TxtObs.setEditable(false);
        BtnBuscaCliente.setVisible(false);
        BtnSalvar.setEnabled(false);
    }

    private void limpaCampos() {
        TxtNomeCliente.setText("");
        TxtTelefone.setText("");
        TxtCelularCliente.setText("");
        TxtCpfCnpj.setText("");
        TxtCpfCnpj.setText("");
        TxtEnderecoCliente.setText("");
        TxtBairroCliente.setText("");
        TxtNumeroEndCliente.setText("");
        TxtCidadeCliente.setText("");
    }

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
            java.util.logging.Logger.getLogger(TelaNovaOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNovaOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNovaOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNovaOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNovaOrdemDeServico().setVisible(true);
            }
        });
    }

    public String[] getDadosOs() {
        return dadosOs;
    }

    public void setDadosOs(String[] dadosOs) {
        this.dadosOs = dadosOs;
    }

    public String getNome() {
        return Nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/View/imgs/clipboard-icon.png")));
    }

    public String getEquipamento() {
        return Equipamento;
    }

    public void setEquipamento(String Equipamento) {
        this.Equipamento = Equipamento;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getAcessorio() {
        return Acessorio;
    }

    public void setAcessorio(String Acessorio) {
        this.Acessorio = Acessorio;
    }

    public String getNumSerie() {
        return NumSerie;
    }

    public void setNumSerie(String NumSerie) {
        this.NumSerie = NumSerie;
    }

    public String getProblemaReclamado() {
        return ProblemaReclamado;
    }

    public void setProblemaReclamado(String ProblemaReclamado) {
        this.ProblemaReclamado = ProblemaReclamado;
    }

    public int getId_os() {
        return id_os;
    }

    public void setId_os(int id_os) {
        this.id_os = id_os;
    }

    public String getObsos() {
        return obsos;
    }

    public void setObsos(String obsos) {
        this.obsos = obsos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAberta_fechada() {
        return aberta_fechada;
    }

    public void setAberta_fechada(String aberta_fechada) {
        this.aberta_fechada = aberta_fechada;
    }

    public String getStatusOs() {
        return statusOs;
    }

    public void setStatusOs(String statusOs) {
        this.statusOs = statusOs;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscaCliente;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JLabel LabelNumeroOs;
    private javax.swing.JLabel LabelStatus;
    private javax.swing.JTextField TxtAcessorioObsOs;
    private javax.swing.JTextField TxtBairroCliente;
    private javax.swing.JFormattedTextField TxtCelularCliente;
    private javax.swing.JTextField TxtCidadeCliente;
    private javax.swing.JTextField TxtCpfCnpj;
    private javax.swing.JTextField TxtEnderecoCliente;
    private javax.swing.JTextField TxtEquipOs;
    private javax.swing.JTextField TxtMarcaEquipOs;
    private javax.swing.JTextField TxtModelEquipOs;
    private javax.swing.JTextField TxtNomeCliente;
    private javax.swing.JTextField TxtNumSerieEquipOs;
    private javax.swing.JTextField TxtNumeroEndCliente;
    private javax.swing.JTextArea TxtObs;
    private javax.swing.JTextArea TxtProblemaReclamadoOS;
    private javax.swing.JFormattedTextField TxtTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                SalvaOs();
            } catch (JRException ex) {
                Logger.getLogger(TelaNovaOrdemDeServico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            ConfirmaSaida();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
