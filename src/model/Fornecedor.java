package model;

public class Fornecedor extends Pessoa{
    private int nomeFantasia;
    private int contato;

    public Fornecedor() {
    }
    

    public Fornecedor(int nomeFantasia, int contato) {
        this.nomeFantasia = nomeFantasia;
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "nomeFantasia=" + nomeFantasia + ", contato=" + contato + '}';
    }
    
    public int getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(int nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public int getContato() {
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }
    
    
}
