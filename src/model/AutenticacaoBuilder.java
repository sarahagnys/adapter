package model;

public class AutenticacaoBuilder {
    private Login login;
    private Autenticacao autenticacao;

    public AutenticacaoBuilder() {
        this.login = new Login();
        this.autenticacao = new Autenticacao();
    }

    public static AutenticacaoBuilder builder() {
        return new AutenticacaoBuilder();
    }

    public AutenticacaoBuilder addLogin(String usuario, String senha) {
        login.setUsuario(usuario);
        login.setSenha(senha);
        return this;
    }

    public AutenticacaoBuilder addChave(int chave) {
        autenticacao.setChave(chave);
        return this;
    }

    public  AutenticacaoBuilder addToken(int token){
        autenticacao.setToken(token);
        return this;
    }

    public Login get() {
        autenticacao.setLogin(login);
        return login;
    }
}
