package controller;

import model.Autenticacao;

public class LoginTokenAdapter implements IServicoLogin{
    LoginToken loginToken;

    public LoginTokenAdapter(LoginToken loginToken) {
        this.loginToken = loginToken;
    }

    @Override
    public void logar(Autenticacao autenticacao) {
        loginToken.enviarToken(autenticacao.getToken());
    }
}
