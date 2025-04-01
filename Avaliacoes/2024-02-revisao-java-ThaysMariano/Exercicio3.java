
import java.util.Scanner;

public class Exercicio3 {

  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    System.out.print("Entre com a quantidade de alunos: ");
    int numeroAlunos = leitor.nextInt();
    leitor.nextLine();

    System.out.print("Entre com a nota dos alunos separadas por espaços: ");
    String notasDosAlunos = leitor.nextLine();
    String[] vetNotas = notasDosAlunos.split(" ");

    int[] notasArray = new int[numeroAlunos];

    //Salva as notas no array
    for (int i = 0; i < notasArray.length; i++) {
      notasArray[i] = Integer.parseInt(vetNotas[i]);
    }

    int faixa1 = 0;
    int faixa2 = 0;
    int faixa3 = 0;
    int faixa4 = 0;

    //conta a frequencia das faixas
    for (int i = 0; i < notasArray.length; i++) {
      if (notasArray[i] < 3) {
        faixa1++;
      } else if (notasArray[i] >= 3 && notasArray[i] <= 5) {
        faixa2++;
      } else if (notasArray[i] > 5 && notasArray[i] < 9) {
        faixa3++;
      } else {
        faixa4++;
      }
    }

    System.out.print(" 0 - 2   | ");
    for (int i = 0; i < faixa1; i++) {
      System.out.print("*");
    }
    System.out.println("");
    System.out.print(" 3 - 5   | ");
    for (int i = 0; i < faixa2; i++) {
      System.out.print("*");
    }
    System.out.println("");
    System.out.print(" 6 - 8   | ");
    for (int i = 0; i < faixa3; i++) {
      System.out.print("*");
    }
    System.out.println("");
    System.out.print(" 9 - 10  | ");
    for (int i = 0; i < faixa4; i++) {
      System.out.print("*");
    }


  }
}
