package model;

public class Receita {
    private int id;
    private String dataHoraReceita;
    private String observacao;
    private String status;

    public Receita() {
    }

    public Receita(int id, String dataHoraReceita, String observacao, String status) {
        this.id = id;
        this.dataHoraReceita = dataHoraReceita;
        this.observacao = observacao;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Receita{" + "id=" + id + ", dataHoraReceita=" + dataHoraReceita + ", observacao=" + observacao + ", status=" + status + '}';
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataHoraReceita() {
        return dataHoraReceita;
    }

    public void setDataHoraReceita(String dataHoraReceita) {
        this.dataHoraReceita = dataHoraReceita;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
