// AtletaJuvenil.java
package models;

public class AtletaJuvenil extends com.example.natacao.models.Atleta {
    private int anosDePratica;

    public AtletaJuvenil(String nome, String dataNascimento, String bairro, int anosDePratica) {
        super(nome, dataNascimento, bairro);
        this.anosDePratica = anosDePratica;
    }

    public int getAnosDePratica() {
        return anosDePratica;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAnos de Prática: " + anosDePratica;
    }
}
