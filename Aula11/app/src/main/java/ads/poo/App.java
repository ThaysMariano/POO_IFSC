/*
 * This source file was generated by the Gradle 'init' task
 */
package ads.poo;

public class App {

    public static void main(String[] args) {

    //interface com usuario

//        Carro c = new Carro();
//
//        c.acelerar(100);
//        c.acelerar(50);
//        c.acelerar(150);
//
//        System.out.println(c.obterVelocidade());
//
//        c.frear(30);
//        c.frear(90);
//        c.frear(150);
//
//        System.out.println(c.obterVelocidade());
//        System.out.println(" ");


//-------------------------------------------------------------------------------

// metodo construtor
        Pessoa a = new Pessoa("Ana Clara da Silva", "123.134.645-34");
//        a.definirNome("Ana Clara da Silva");
//        a.definirCPF("123.134.645-34");

        Pessoa b = new Pessoa("João Antônio Guimarães", "836.236.765-56" );
//        b.definirNome("João Antônio Guimarães");
//        b.definirCPF("836.236.765-56");

        Pessoa d = new Pessoa();

        //melhor obter individualmente
        System.out.println(a.imprimir());
        System.out.println(b.imprimir());
        System.out.println(" ");

//-------------------------------------------------------------------------------

//Quatro construtores
        Pessoa e = new Pessoa();
        Pessoa f = new Pessoa("nome");
        Pessoa g = new Pessoa("nome", "sobrenome");
        Pessoa h = new Pessoa("nome", "sobrenome", "cpf");

//-------------------------------------------------------------------------------

        Carro i = new Carro(200, 138, 87, 18000, 93, "fusca");

        System.out.println(i.obterVelocidadeAtual());
        i.acelerar(10);
        System.out.println(i.obterVelocidadeAtual());


        i.acelerar(-10);
        System.out.println(i.obterVelocidadeAtual());
        i.frear(-100);
        System.out.println(i.obterVelocidadeAtual());
        i.frear(-59);
        System.out.println(i.obterVelocidadeAtual());
        System.out.println(" ");

    //----------------------------------------------------------------------

        int totalEstudantes =0;

        Estudante j = new Estudante(1234, "12/11/2003", "Ana");

        Estudante k = new Estudante(3 ,"41", "a");

        Estudante l = new Estudante(3 ,"45", "a");


        System.out.println(j.getTotal());












    }
}
