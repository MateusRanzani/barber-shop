/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Usuario;
import View.Login;

/**
 *
 * @author mateus.ranzani
 */
public class LoginController {

    private final Login view;

    public LoginController(Login view) {
        this.view = view;
    }
    
    public void entrarNoSistema() {
        String nome = view.getTextUser().getText();
        String senha = view.getTextPassword().getText();
        
        Usuario modelo = new Usuario(0, nome, senha);
    }
    
    public void fizTarefa() {
    
    }
}
