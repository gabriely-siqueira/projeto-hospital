package model;

public class ReceitaMedicamento {
    private int id;
    private String prescricao;
    private String staus;

    public ReceitaMedicamento() {
    }

    
    public ReceitaMedicamento(int id, String prescricao, String staus) {
        this.id = id;
        this.prescricao = prescricao;
        this.staus = staus;
    }

    @Override
    public String toString() {
        return "ReceitaMedicamento{" + "id=" + id + ", prescricao=" + prescricao + ", staus=" + staus + '}';
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    public String getStaus() {
        return staus;
    }

    public void setStaus(String staus) {
        this.staus = staus;
    }
    
    
}
