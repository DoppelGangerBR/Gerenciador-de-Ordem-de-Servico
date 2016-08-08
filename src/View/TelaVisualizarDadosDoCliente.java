/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;

/**
 *
 * @author Alvaro
 */
public class TelaVisualizarDadosDoCliente extends TelaCadastroClientes {
    
    public TelaVisualizarDadosDoCliente(){
        setTitle("Cliente - Visualização");
        LabelTituloCliente.setText("Cliente - Visualização");
        LabelNomeCliente.setText("Nome.:");
        LabelNomeCliente.setForeground(Color.BLACK);
        LabelTelefoneCliente.setText("Telefone.:");
        LabelTelefoneCliente.setForeground(Color.BLACK);
        LabelCpfCnpjCliente.setText("CPF/CNPJ.:");
        LabelCpfCnpjCliente.setForeground(Color.BLACK);
        OpcCancelar.setText("Fechar");
        BtnLimpar.setVisible(false);
        BtnSalvar.setVisible(false);
        BtnCancelar.setText("Fechar  [ESC]");        
    }
    
}
