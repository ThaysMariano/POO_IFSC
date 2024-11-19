/*
 * This source file was generated by the Gradle 'init' task
 */
package ads.poo;

import java.util.*;

public class App {


    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(18);
        numeros.add(11);
        numeros.add(12);

        Integer i = numeros.get(1);

//----------------------------- Imprimir


    //to string
        System.out.println(numeros);
        System.out.println(" ");

    // for i
        for (int j = 0; j < numeros.size(); j++) {
            System.out.println(numeros.get(j));
        }
        System.out.println(" ");

    // For each tradicional
        for (Integer elemento : numeros){
            System.out.println(elemento);
        }
        System.out.println(" ");

    //lambda
        numeros.forEach(e-> System.out.println(e));
        System.out.println(" ");

    //method reference
        numeros.forEach(System.out::println);


        System.out.println("");


//----------------------------- Remover


        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Thays");
        nomes.add("Kauan");
        nomes.add("Gabriel");

        nomes.forEach(e-> System.out.println(e));

        nomes.removeIf(e->e.equals("Gabriel"));

        System.out.println(" ");
        nomes.forEach(e-> System.out.println(e));

        System.out.println(" ");
        numeros.removeIf(e->e == 11);

        numeros.forEach(e-> System.out.println(e));
        System.out.println(" ");


//----------------------------- Ordenar/embaralhar

    //ordenar
        Collections.sort(numeros);

    //embaralhar
        Collections.shuffle(nomes);

        System.out.println(numeros);

        System.out.println(nomes);
        System.out.println(" ");


//-----------------------------

        HashSet<String> conjunto = new HashSet<>();

        conjunto.add("Ana");
        conjunto.add("Ana");

        System.out.println(conjunto);


//-----------------------------

        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.add("Juca");

        String n = fila.poll(); //retorna null se fila estiver vazia


//----------------------------- Aluno

        Aluno aluno = new Aluno("a", 3284, new String[]{"ana", "juca"});



















    }
}