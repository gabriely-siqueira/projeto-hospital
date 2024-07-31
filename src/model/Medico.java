package model;

public class Medico extends Pessoa{
    private String crm;
    private String senha;
    private String login;
    private String nomeSocial;

    public Medico() {
    }

    public Medico(String crm, String senha, String login) {
        this.crm = crm;
        this.senha = senha;
        this.login = login;
    }

    @Override
    public String toString() {
        return "Medico{" + "crm=" + crm + ", senha=" + senha + ", login=" + login + ", nomeSocial=" + nomeSocial + '}';
    }
    
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }
    
    
}
