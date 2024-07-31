package model;

public class MovimentoMedicamento {
    private int id;
    private String dataHoraMovimento;
    private String tipoMovimento;
    private float qtdMedicamento;
    private String observacao;
    private String status;

    public MovimentoMedicamento() {
    }

    public MovimentoMedicamento(int id, String dataHoraMovimento, String tipoMovimento, float qtdMedicamento, String observacao, String status) {
        this.id = id;
        this.dataHoraMovimento = dataHoraMovimento;
        this.tipoMovimento = tipoMovimento;
        this.qtdMedicamento = qtdMedicamento;
        this.observacao = observacao;
        this.status = status;
    }

    @Override
    public String toString() {
        return "MovimentoMedicamento{" + "id=" + id + ", dataHoraMovimento=" + dataHoraMovimento + ", tipoMovimento=" + tipoMovimento + ", qtdMedicamento=" + qtdMedicamento + ", observacao=" + observacao + ", status=" + status + '}';
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataHoraMovimento() {
        return dataHoraMovimento;
    }

    public void setDataHoraMovimento(String dataHoraMovimento) {
        this.dataHoraMovimento = dataHoraMovimento;
    }

    public String getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public float getQtdMedicamento() {
        return qtdMedicamento;
    }

    public void setQtdMedicamento(float qtdMedicamento) {
        this.qtdMedicamento = qtdMedicamento;
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
