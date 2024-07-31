package model;

public class Atendimento extends Pessoa{
    private int id;
    private String dataHoraAtendimento;
    private String pressao;
    private String temperatura;
    private int bpm;
    private float oximetria;
    private String historicoDeDoencas;
    private String alergias;
    private String medicacoesEmUso;
    private String anamnese;
    private String tipoAtendimento;
    private String classificacao;
    private String observacoes;
    private String status;

    public Atendimento() {
    }

    @Override
    public String toString() {
        return "Atendimento{" + "id=" + id + ", dataHoraAtendimento=" + dataHoraAtendimento + ", pressao=" + pressao + ", temperatura=" + temperatura + ", bpm=" + bpm + ", oximetria=" + oximetria + ", historicoDeDoencas=" + historicoDeDoencas + ", alergias=" + alergias + ", medicacoesEmUso=" + medicacoesEmUso + ", anamnese=" + anamnese + ", tipoAtendimento=" + tipoAtendimento + ", classificacao=" + classificacao + ", observacoes=" + observacoes + ", status=" + status + '}';
    }
    

    public Atendimento(int id, String dataHoraAtendimento, String pressao, String temperatura, int bpm, float oximetria, String historicoDeDoencas, String alergias, String medicacoesEmUso, String anamnese, String tipoAtendimento, String classificacao, String observacoes, String status) {
        this.id = id;
        this.dataHoraAtendimento = dataHoraAtendimento;
        this.pressao = pressao;
        this.temperatura = temperatura;
        this.bpm = bpm;
        this.oximetria = oximetria;
        this.historicoDeDoencas = historicoDeDoencas;
        this.alergias = alergias;
        this.medicacoesEmUso = medicacoesEmUso;
        this.anamnese = anamnese;
        this.tipoAtendimento = tipoAtendimento;
        this.classificacao = classificacao;
        this.observacoes = observacoes;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataHoraAtendimento() {
        return dataHoraAtendimento;
    }

    public void setDataHoraAtendimento(String dataHoraAtendimento) {
        this.dataHoraAtendimento = dataHoraAtendimento;
    }

    public String getPressao() {
        return pressao;
    }

    public void setPressao(String pressao) {
        this.pressao = pressao;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public float getOximetria() {
        return oximetria;
    }

    public void setOximetria(float oximetria) {
        this.oximetria = oximetria;
    }

    public String getHistoricoDeDoencas() {
        return historicoDeDoencas;
    }

    public void setHistoricoDeDoencas(String historicoDeDoencas) {
        this.historicoDeDoencas = historicoDeDoencas;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getMedicacoesEmUso() {
        return medicacoesEmUso;
    }

    public void setMedicacoesEmUso(String medicacoesEmUso) {
        this.medicacoesEmUso = medicacoesEmUso;
    }

    public String getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(String anamnese) {
        this.anamnese = anamnese;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
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
