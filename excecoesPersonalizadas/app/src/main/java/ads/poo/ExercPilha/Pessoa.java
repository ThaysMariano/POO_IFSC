package ads.poo.ExercPilha;

public class Pessoa {

    private String nome;
    private int telefone;


    public Pessoa(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa: Nome: "+ nome+ " Telefone: "+ telefone;
    }
}
