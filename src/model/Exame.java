package model;

public class Exame {
    private int id;
    private String tituloExame;
    private String tipoExame;
    private String status;

    public Exame() {
    }

    public Exame(int id, String tituloExame, String tipoExame, String status) {
        this.id = id;
        this.tituloExame = tituloExame;
        this.tipoExame = tipoExame;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Exame{" + "id=" + id + ", tituloExame=" + tituloExame + ", tipoExame=" + tipoExame + ", status=" + status + '}';
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTituloExame() {
        return tituloExame;
    }

    public void setTituloExame(String tituloExame) {
        this.tituloExame = tituloExame;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
