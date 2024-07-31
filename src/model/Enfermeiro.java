package model;

public class Enfermeiro extends Pessoa{
        private String cre;
        private String senha;
        private String login;
        private String nomeSocial;

    public Enfermeiro() {
    }

    public Enfermeiro(String cre, String senha, String login, String nomeSocial) {
        this.cre = cre;
        this.senha = senha;
        this.login = login;
        this.nomeSocial = nomeSocial;
    }

    @Override
    public String toString() {
        return "Enfermeiro{" + "cre=" + cre + ", senha=" + senha + ", login=" + login + ", nomeSocial=" + nomeSocial + '}';
    }
    

    public String getCre() {
        return cre;
    }

    public void setCre(String cre) {
        this.cre = cre;
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
