package model;

public class Internacao {
    private int id;
    private String dataHoraIntercacao;
    private String dataHoraAlta;
    private String observacao;
    private String status;

    public Internacao() {
    }

    public Internacao(int id, String dataHoraIntercacao, String dataHoraAlta, String observacao, String status) {
        this.id = id;
        this.dataHoraIntercacao = dataHoraIntercacao;
        this.dataHoraAlta = dataHoraAlta;
        this.observacao = observacao;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Internacao{" + "id=" + id + ", dataHoraIntercacao=" + dataHoraIntercacao + ", dataHoraAlta=" + dataHoraAlta + ", observacao=" + observacao + ", status=" + status + '}';
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataHoraIntercacao() {
        return dataHoraIntercacao;
    }

    public void setDataHoraIntercacao(String dataHoraIntercacao) {
        this.dataHoraIntercacao = dataHoraIntercacao;
    }

    public String getDataHoraAlta() {
        return dataHoraAlta;
    }

    public void setDataHoraAlta(String dataHoraAlta) {
        this.dataHoraAlta = dataHoraAlta;
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
