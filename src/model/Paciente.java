package model;

public class Paciente extends Pessoa{
    
    private String tipoSanguineo;
    private String sexo;
    private String nomeSocial;

    public Paciente() {
        
    }

    public Paciente(String tipoSanguineo, String sexo, String nomeSocial) {
        this.tipoSanguineo = tipoSanguineo;
        this.sexo = sexo;
        this.nomeSocial = nomeSocial;
    }
    
    
    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    @Override
    public String toString() {
        return "Paciente{" + super.toString() + "tipoSanguineo=" + tipoSanguineo + ", sexo=" + sexo + ", nomeSocial=" + nomeSocial + '}';
    }
    
    
    
}
