import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.print("Entre com seu nome: ");
        String nome = leitor.nextLine();

        System.out.print("Entre com o ano que nasceu: ");
        int anoNascimento = leitor.nextInt();

        System.out.print("Entre com  ano atual: ");
        int anoAtual = leitor.nextInt();

        int idade = anoAtual-anoNascimento;

        System.out.printf("%s, possui %d anos.", nome, idade);

    }
}