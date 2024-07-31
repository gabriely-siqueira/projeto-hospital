
package model;

public class Consulta{
    private int id;
    private String responsavel;
    private String dataHoraConsulta;
    private String anamnese;
    private String diagnostico;
    private String prescricao;
    private String observacoes;
    private String status;

    public Consulta(int id, String responsavel, String dataHoraConsulta, String anamnese, String diagnostico, String prescricao, String observacoes, String status) {
        this.id = id;
        this.responsavel = responsavel;
        this.dataHoraConsulta = dataHoraConsulta;
        this.anamnese = anamnese;
        this.diagnostico = diagnostico;
        this.prescricao = prescricao;
        this.observacoes = observacoes;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Consulta{" + "id=" + id + ", responsavel=" + responsavel + ", dataHoraConsulta=" + dataHoraConsulta + ", anamnese=" + anamnese + ", diagnostico=" + diagnostico + ", prescricao=" + prescricao + ", observacoes=" + observacoes + ", status=" + status + '}';
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getDataHoraConsulta() {
        return dataHoraConsulta;
    }

    public void setDataHoraConsulta(String dataHoraConsulta) {
        this.dataHoraConsulta = dataHoraConsulta;
    }

    public String getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(String anamnese) {
        this.anamnese = anamnese;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
