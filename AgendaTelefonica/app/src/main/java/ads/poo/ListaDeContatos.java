package ads.poo;

import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;

public class ListaDeContatos {

    private ArrayList<Contato> contatos;

//----------------------------------------------

    public ListaDeContatos(ArrayList<Contato> c) {
        this.contatos = new ArrayList<>(c);
    }

    public boolean addContato(Contato c){
        return this.contatos.add(c);
    }

    public boolean removeContato(String n, String s){
        return contatos.removeIf(e -> e.getNome().equals(n) && e.getSobrenome().equals(s));
    }

    public boolean addTelefone(String r, String v, Contato c){
        return c.addTelefone(r, v);
    }

    public boolean addEmail(String r, String v, Contato c){
        return c.addEmail(r, v);
    }

    public boolean delTelefone(String r, Contato c){
        return c.delTelefone(r);
    }

    public boolean delEmail(String r, Contato c){
        return c.delEmail(r);
    }

    public boolean updateTelefone(String r, String n, Contato c){
        return c.updateTelefone(r, n);
    }

    public boolean updateEmail(String r, String e, Contato c){
        return c.updateEmail(r, e);
    }

    @Override
    public String toString() {
        return "ListaDeContatos{" +
                "contatos=" + contatos +
                '}';
    }
}





