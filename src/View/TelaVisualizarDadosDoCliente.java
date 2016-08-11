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
public final class TelaVisualizarDadosDoCliente extends TelaCadastroClientes {
    private String Nome,Telefone,Celular,CpfCnpj,Endereco,Numero,Bairro,Cidade,Estado;

    
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
        TxtBairro.setEditable(false);
        TxtNome.setEditable(false);
        TxtCeluar.setEditable(false);
        TxtCidade.setEditable(false);
        TxtCpfCnpj.setEditable(false);
        TxtEndereco.setEditable(false);
        TxtEstado.setEditable(false);
        TxtNumeroEndereco.setEditable(false);
        TxtTelefone.setEditable(false);     
        TxtBairro.setText(getBairro());
        TxtCeluar.setText(getCelular());
        TxtCidade.setText(getCidade());
        TxtCpfCnpj.setText(getCpfCnpj());
        TxtEndereco.setText(getEndereco());
        TxtEstado.setText(getEstado());
        TxtNome.setText(getNome());
        TxtNumeroEndereco.setText(getNumero());
        TxtTelefone.setText(getTelefone());
    }
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
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

    public String getCpfCnpj() {
        return CpfCnpj;
    }

    public void setCpfCnpj(String CpfCnpj) {
        this.CpfCnpj = CpfCnpj;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
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

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}
