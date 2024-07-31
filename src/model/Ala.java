package model;

public class Ala {
    private int id;
    private String descricao;
    private String status;

    public Ala() {
    }

    public Ala(int id, String descricao, String status) {
        this.id = id;
        this.descricao = descricao;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ala{" + "id=" + id + ", descricao=" + descricao + ", status=" + status + '}';
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
