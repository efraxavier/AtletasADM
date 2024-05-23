// AtletaSenior.java
package models;

public class AtletaSenior extends com.example.natacao.models.Atleta {
    private boolean problemasCardiacos;

    public AtletaSenior(String nome, String dataNascimento, String bairro, boolean problemasCardiacos) {
        super(nome, dataNascimento, bairro);
        this.problemasCardiacos = problemasCardiacos;
    }

    public boolean isProblemasCardiacos() {
        return problemasCardiacos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProblemas Cardíacos: " + (problemasCardiacos ? "Sim" : "Não");
    }
}
