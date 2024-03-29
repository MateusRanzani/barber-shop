/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Schedule;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mateus.ranzani
 */
public class AgendaHelper implements IHelper {

    private final Schedule view;

    public AgendaHelper(Schedule view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamento().getModel();
        tableModel.setNumRows(0);

        for (Agendamento agendamento : agendamentos) {
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
            });
        }

    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCliente().getModel();

        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente);
        }
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxServico().getModel();

        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
        }
    }

    public Cliente obtemCliente() {
        return (Cliente) view.getjComboBoxCliente().getSelectedItem();

    }

    public Servico obtemServico() {
        return (Servico) view.getjComboBoxServico().getSelectedItem();

    }

    public void setarValor(float valor) {
        view.getjTextValor().setText(valor + "");
    }

    @Override
    public Agendamento obterModelo() {
        String idString = view.getjTextId().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = obtemCliente();
        Servico servico = obtemServico();
        String valorString = view.getjTextValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getjTextFormatedData().getText();
        String hora = view.getjTextFormatedHora().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getjTextObservacao().getText();
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora, observacao);

        return agendamento;
    }

    @Override
    public void limparTela() {
        view.getjTextId().setText("");
        view.getjTextFormatedData().setText("");
        view.getjTextFormatedHora().setText("");
        view.getjTextObservacao().setText("");
    }

}
