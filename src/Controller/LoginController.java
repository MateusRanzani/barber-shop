/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

/**
 *
 * @author mateus.ranzani
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }

    public void entrarNoSistema() {
        Usuario usuario = helper.obterModelo();

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);

        if (usuarioAutenticado != null) {
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            view.dispose();
        } else {
            view.exibeMensagem("Usuário ou senha inválidos");
        }
    }

    public void fizTarefa() {

    }
}
