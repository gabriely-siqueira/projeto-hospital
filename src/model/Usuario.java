package model;

public class Usuario extends Pessoa{
    private String login;
    private String senha;
    private String nomeSocial;

    public Usuario() {
    }

    public Usuario(String login, String senha, String nomeSocial) {
        this.login = login;
        this.senha = senha;
        this.nomeSocial = nomeSocial;
    }

    @Override
    public String toString() {
        return "Usuario{" + "login=" + login + ", senha=" + senha + ", nomeSocial=" + nomeSocial + '}';
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }
    
    
}
