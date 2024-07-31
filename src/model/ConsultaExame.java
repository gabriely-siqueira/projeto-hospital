package model;

public class ConsultaExame {
    private int id;
    private String dataHoraExame;
    private String analiseExame;
    private String imagemExame;
    private String status;

    public ConsultaExame() {
    }

    public ConsultaExame(int id, String dataHoraExame, String analiseExame, String imagemExame, String status) {
        this.id = id;
        this.dataHoraExame = dataHoraExame;
        this.analiseExame = analiseExame;
        this.imagemExame = imagemExame;
        this.status = status;
    }

    @Override
    public String toString() {
        return "ConsultaExame{" + "id=" + id + ", dataHoraExame=" + dataHoraExame + ", analiseExame=" + analiseExame + ", imagemExame=" + imagemExame + ", status=" + status + '}';
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataHoraExame() {
        return dataHoraExame;
    }

    public void setDataHoraExame(String dataHoraExame) {
        this.dataHoraExame = dataHoraExame;
    }

    public String getAnaliseExame() {
        return analiseExame;
    }

    public void setAnaliseExame(String analiseExame) {
        this.analiseExame = analiseExame;
    }

    public String getImagemExame() {
        return imagemExame;
    }

    public void setImagemExame(String imagemExame) {
        this.imagemExame = imagemExame;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
