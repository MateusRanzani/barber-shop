/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Agendamento;
import View.Schedule;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mateus.ranzani
 */
public class AgendaHelper {
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
            agendamento.getData(),
            agendamento.getData(),
            agendamento.getObservacao()
            });
        }
       
    }
    
}
