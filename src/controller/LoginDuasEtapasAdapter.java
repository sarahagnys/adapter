package controller;

import model.Autenticacao;

public class LoginDuasEtapasAdapter implements IServicoLogin{
    LoginDuasEtapas loginDuasEtapas;

    public LoginDuasEtapasAdapter(LoginDuasEtapas loginDuasEtapas) {
        this.loginDuasEtapas = loginDuasEtapas;
    }

    @Override
    public void logar(Autenticacao autenticacao) {
        loginDuasEtapas.fazerLogin(autenticacao.getLogin());
        loginDuasEtapas.confirmarSegundaEtapa(autenticacao.getChave());
    }
}
