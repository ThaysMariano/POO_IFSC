package ads.poo;

import java.util.ArrayList;
import java.util.HashSet;

public class Aluno {
    // Nome, matricula, N telefones, filiacao(Pai e mae), disciplinas cursando(String sigla)


    private String nome;
    private int matricula;
    private ArrayList<String> telefone;
    private String[] filiacao;
    private HashSet<String> disciplinas;


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

    public void setFiliacao(String[] filiacao) {
        this.filiacao = filiacao;
    }

    public boolean adicionarDisciplinas(String dsp) {
        return this.disciplinas.add(dsp);
    }







}
