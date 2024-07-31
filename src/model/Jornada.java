package model;

public class Jornada extends Pessoa{
    private String dataIncial;
    private int dataFinal;
    private int cargaHoraria;

    public Jornada(String dataIncial, int dataFinal, int cargaHoraria) {
        this.dataIncial = dataIncial;
        this.dataFinal = dataFinal;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Jornada{" + "dataIncial=" + dataIncial + ", dataFinal=" + dataFinal + ", cargaHoraria=" + cargaHoraria + '}';
    }
    
    public String getDataIncial() {
        return dataIncial;
    }

    public void setDataIncial(String dataIncial) {
        this.dataIncial = dataIncial;
    }

    public int getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(int dataFinal) {
        this.dataFinal = dataFinal;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
}
