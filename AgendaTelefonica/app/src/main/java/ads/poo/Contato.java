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


    public Contato(String nome, String sobrenome, LocalDate dataN) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataN;
        this.telefones = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    @Override
    public String toString() {
        return
                "nome: '" + nome + '\'' +
                ", sobrenome: '" + sobrenome + '\'' +
                ", dataNasc: " + dataNasc + '\'' +
                "telefones: " + telefones + '\'' +
                "emails: " + emails;
    }

    public boolean addTelefone(String r, String v) {
        return telefones.add(new Telefone(r,v));
    }

    public boolean addEmail(String r, String v) {
        return emails.add(new Email(r,v));
    }

    public boolean delTelefone(String r) {
        return telefones.removeIf(e -> e.getRotulo().equals(r));
    }

    public boolean delEmail(String r) {
        return emails.removeIf(e -> e.getRotulo().equals(r));
    }

    public boolean updateTelefone(String r, String v) {
        for (Telefone telefone : telefones){
            if(telefone.getRotulo().equals(r)){
                telefone.setValor(v);
                return true;
            }
        }
        return false;
    }

    public boolean updateEmail(String r, String v) {
        for (Email email : emails){
            if(email.getRotulo().equals(r)){
                email.setValor(v);
                return true;
            }
        }
        return false;
    }







}
