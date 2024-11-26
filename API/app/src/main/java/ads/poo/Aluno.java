package ads.poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Aluno {
    // Nome, matricula, N telefones, filiacao(Pai e mae), disciplinas cursando(String sigla)


    private String nome;
    private int matricula;
    private ArrayList<String> telefone;
    private String[] filiacao;
    private HashSet<String> disciplinas;         //conjunto que não permite duplicados


//-------------------------------------

    public Aluno(String nome, int matricula, String[] filiacao) {
        this.nome = nome;
        this.matricula = matricula;
        this.filiacao = filiacao;

        this.disciplinas = new HashSet<>();
        this.telefone = new ArrayList<>();
    }

    public void setTelefone(String tel) {
        this.telefone.add(tel);
    }

    public boolean adicionarDisciplinas(String dcp) {
        return this.disciplinas.add(dcp);
    }

    public boolean removerDisciplinas(String dcp){
        return this.disciplinas.removeIf(e->e.equals(dcp));
    }


    @Override
    public String toString() {
        StringBuilder telefones = new StringBuilder();
        StringBuilder disciplina = new StringBuilder();


        for (String tel : telefone){
            telefones.append("\n").append("    -").append(tel);
        }
        for (String dcp : disciplinas){
            disciplina.append("\n").append("    -").append(dcp);
        }

        return "\n Matrícula: " + matricula +
                "\n Nome: " + nome +
                "\n Filiação: " +
                "\n    Pai: " + filiacao[0] +
                "\n    Mãe: " + filiacao[1]+
                "\n Telefones: " + telefones+
                "\n Disciplinas: " + disciplina
                ;
    }
}
