package ads.poo.abstratos;

import java.time.LocalDate;

public abstract class Pessoa {

    private String nome;
    private LocalDate dataNasc;

//    metodo concreto
    public Pessoa(String nome, LocalDate dataNasc) {
        this.nome = nome;
        this.dataNasc = dataNasc;
    }

//    metodo abstrato
    public abstract String mover();





}
