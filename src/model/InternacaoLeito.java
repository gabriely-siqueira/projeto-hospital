package model;

public class InternacaoLeito {
    private int id;
    private String dataHoraAlocacao;
    private String dataHoraDesocupacao;
    private String status;

    public InternacaoLeito() {
    }

    public InternacaoLeito(int id, String dataHoraAlocacao, String dataHoraDesocupacao, String status) {
        this.id = id;
        this.dataHoraAlocacao = dataHoraAlocacao;
        this.dataHoraDesocupacao = dataHoraDesocupacao;
        this.status = status;
    }

    @Override
    public String toString() {
        return "InternacaoLeito{" + "id=" + id + ", dataHoraAlocacao=" + dataHoraAlocacao + ", dataHoraDesocupacao=" + dataHoraDesocupacao + ", status=" + status + '}';
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataHoraAlocacao() {
        return dataHoraAlocacao;
    }

    public void setDataHoraAlocacao(String dataHoraAlocacao) {
        this.dataHoraAlocacao = dataHoraAlocacao;
    }

    public String getDataHoraDesocupacao() {
        return dataHoraDesocupacao;
    }

    public void setDataHoraDesocupacao(String dataHoraDesocupacao) {
        this.dataHoraDesocupacao = dataHoraDesocupacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
