/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.MenuPrincipal;
import View.Schedule;

/**
 *
 * @author mateus.ranzani
 */
public class MenuPrincipalController {

    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }

    public void navegarParaAgenda() {
        Schedule agenda = new Schedule();
        agenda.setVisible(true);
    }

}
