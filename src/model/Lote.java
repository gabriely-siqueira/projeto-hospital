package model;

public class Lote {
    private int id;
    private String descricao;
    private String dataFabricacao;
    private String dataValidade;
    private String status;

    public Lote() {
    }

    public Lote(int id, String descricao, String dataFabricacao, String dataValidade, String status) {
        this.id = id;
        this.descricao = descricao;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Lote{" + "id=" + id + ", descricao=" + descricao + ", dataFabricacao=" + dataFabricacao + ", dataValidade=" + dataValidade + ", status=" + status + '}';
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

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
