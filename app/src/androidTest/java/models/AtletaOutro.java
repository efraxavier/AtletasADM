// AtletaOutro.java
package models;

public class AtletaOutro extends com.example.natacao.models.Atleta {
    private String academia;
    private float recorde;

    public AtletaOutro(String nome, String dataNascimento, String bairro, String academia, float recorde) {
        super(nome, dataNascimento, bairro);
        this.academia = academia;
        this.recorde = recorde;
    }

    public String getAcademia() {
        return academia;
    }

    public float getRecorde() {
        return recorde;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAcademia: " + academia + "\nRecorde: " + recorde + " segundos";
    }
}
