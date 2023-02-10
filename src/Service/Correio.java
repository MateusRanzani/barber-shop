/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Agendamento;

/**
 *
 * @author mateus.ranzani
 */
public class Correio {

    public void NotificarPorEmail(Agendamento agendamento) {

        String emailFormatado = formatarEmail(agendamento);
        String destinatario = agendamento.getCliente().getEmail();

        Email email = new Email("Agendamento BarberShop", emailFormatado, destinatario);
        email.enviar();
    }

    private String formatarEmail(Agendamento agendamento) {
        String nomeCliente = agendamento.getCliente().getNome();
        String servico = agendamento.getServico().getDescricao();
        String dataAgendamento = agendamento.getDataFormatada();
        String horaAgendamento = agendamento.getHoraFormatada();
        float valor = agendamento.getValor();

        return "Olá " + nomeCliente + ", seu agendamento para " + servico
                + " está marcado para o dia " + dataAgendamento + " as " + horaAgendamento + ". O valor é de R$" + valor;
    }
}
