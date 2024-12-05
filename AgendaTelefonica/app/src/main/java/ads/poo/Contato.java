package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contato {

    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> emails;

//--------------------------------------------------


    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.telefones = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataNasc=" + dataNasc +
                ", telefones=" + telefones +
                ", emails=" + emails +
                '}';
    }

    public boolean adicionarTelefone(String r, String n){


        return false;
    }







}
