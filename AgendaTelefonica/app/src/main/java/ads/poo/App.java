/*
 * This source file was generated by the Gradle 'init' task
 */
package ads.poo;

import org.checkerframework.checker.units.qual.C;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.time.LocalDate;



public class App {




    private ListaDeContatos ListadeCOntatos;

    public static void main(String[] args) {
        Contato c = new Contato("Thays", "Mariano", LocalDate.of(2005, 11, 18));

         Telefone tel = new Telefone("Casa", "48988339737");

         Email email = new Email("Pessoal", "thays.sm@aluno.ifsc.edu.br");

        System.out.println(tel);
        System.out.println(email);









    }
}
