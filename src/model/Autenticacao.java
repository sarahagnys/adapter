package model;

public class Autenticacao {
    private Login login;
    private int chave;
    private int token;

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Autenticacao{" +
                "login=" + login +
                ", chave=" + chave +
                ", token=" + token +
                '}';
    }
}
