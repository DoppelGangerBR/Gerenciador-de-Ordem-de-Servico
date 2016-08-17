/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro
 */
public class TelaAlterarCliente extends TelaCadastroClientes{

    public TelaAlterarCliente() {
        setTitle("Cliente - Alteração");
        LabelTituloCliente.setText("Cliente - Alteração");
        LabelNomeCliente.setText("Nome.:");
        LabelNomeCliente.setForeground(Color.BLACK);
        LabelTelefoneCliente.setText("Telefone.:");
        LabelTelefoneCliente.setForeground(Color.BLACK);
        LabelCpfCnpjCliente.setText("CPF/CNPJ.:");
        LabelCpfCnpjCliente.setForeground(Color.BLACK);
        BtnLimpar.setVisible(false);
    }    
    
    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        JOptionPane.showMessageDialog(null, "ashduahdua");
    }   
    
}
