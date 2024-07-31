package model;

public class Farmaceutico extends Pessoa {
    private String cpf;
    private String senha;
    private String login;
    private String nomeSocial;      

    public Farmaceutico() {
    }

    public Farmaceutico(String cpf, String senha, String login, String nomeSocial) {
        this.cpf = cpf;
        this.senha = senha;
        this.login = login;
        this.nomeSocial = nomeSocial;
    }

    @Override
    public String toString() {
        return "Farmaceutico{" + "cpf=" + cpf + ", senha=" + senha + ", login=" + login + ", nomeSocial=" + nomeSocial + '}';
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
