/*
 * This source file was generated by the Gradle 'init' task
 */
package ads.poo;

import ads.poo.ExercPilha.Pessoa;
import ads.poo.ExercPilha.Pilha;
import ads.poo.ExercPilha.PilhaCheiaException;
import ads.poo.ExercPilha.PilhaVaziaException;

public class App {

    public static void main(String[] args) {

        //crie uma conta e faça um saque
        //validar negativos

        Conta c = new Conta(20);
//
//        try {
//            c.saque(-876587);
//        } catch (SaldoInsuficienteException | ValorNegativoException e) {
//            System.err.println(e.getMessage());
//        }


        Pessoa p1 = new Pessoa("Ana", 38275445);
        Pessoa p2 = new Pessoa("Joao", 374294);
        Pessoa p3 = new Pessoa("Nathalia", 13094724);

        Pilha pilha = new Pilha(2);

        try {
            pilha.empilhar(p1);
            pilha.empilhar(p3);

            System.out.println("Pessoa desempilhada "+pilha.desempilhar());
            System.out.println("Pessoa desempilhada "+pilha.desempilhar());
        } catch (PilhaCheiaException e) {
            System.err.println(e.getMessage());
        } catch (PilhaVaziaException e) {
            System.err.println(e.getMessage());
        }


    }
}
