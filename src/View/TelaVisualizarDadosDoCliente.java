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
public final class TelaVisualizarDadosDoCliente extends TelaCadastroAlteracaoVisualizacaoClientes {
    private String NomeV,TelefoneV,CelularV,CpfCnpjV,EnderecoV,NumeroV,BairroV,CidadeV,EstadoV;

    
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
        OpcLimparCampos.setVisible(false);
        OpcSalvar.setVisible(false);
        BtnLimpar.setVisible(false);
        BtnSalvar.setVisible(false);
        BtnCancelar.setText("Fechar  [ESC]");
        TxtNome.setEditable(false);
        TxtBairro.setEditable(false);
        TxtCeluar.setEditable(false);
        TxtCidade.setEditable(false);
        TxtCpfCnpj.setEditable(false);
        TxtEndereco.setEditable(false);
        TxtEstado.setEditable(false);
        TxtNumeroEndereco.setEditable(false);
        TxtTelefone.setEditable(false);
        
    }
    public void AlimentaCampos(){
        TxtBairro.setText(getBairroV());
        TxtCeluar.setText(getCelularV());
        TxtCidade.setText(getCidadeV());
        TxtCpfCnpj.setText(getCpfCnpjV());
        TxtEndereco.setText(getEnderecoV());
        TxtEstado.setText(getEstadoV());
        TxtNome.setText(getNomeV());
        TxtNumeroEndereco.setText(getNumeroV());
        TxtTelefone.setText(getTelefoneV());
    }
    public String getNomeV() {
        return NomeV;
    }

    public void setNomeV(String NomeV) {
        this.NomeV = NomeV;
    }

    public String getTelefoneV() {
        return TelefoneV;
    }

    public void setTelefoneV(String TelefoneV) {
        this.TelefoneV = TelefoneV;
    }

    public String getCelularV() {
        return CelularV;
    }

    public void setCelularV(String CelularV) {
        this.CelularV = CelularV;
    }

    public String getCpfCnpjV() {
        return CpfCnpjV;
    }

    public void setCpfCnpjV(String CpfCnpjV) {
        this.CpfCnpjV = CpfCnpjV;
    }

    public String getEnderecoV() {
        return EnderecoV;
    }

    public void setEnderecoV(String EnderecoV) {
        this.EnderecoV = EnderecoV;
    }

    public String getNumeroV() {
        return NumeroV;
    }

    public void setNumeroV(String NumeroV) {
        this.NumeroV = NumeroV;
    }

    public String getBairroV() {
        return BairroV;
    }

    public void setBairroV(String BairroV) {
        this.BairroV = BairroV;
    }

    public String getCidadeV() {
        return CidadeV;
    }

    public void setCidadeV(String CidadeV) {
        this.CidadeV = CidadeV;
    }

    public String getEstadoV() {
        return EstadoV;
    }

    public void setEstadoV(String EstadoV) {
        this.EstadoV = EstadoV;
    }
}
