import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        double[]wi = {2, 3};
        double[]pi = {Integer.parseInt(args[0]), Integer.parseInt(args[1])};
        double a = Integer.parseInt(args[2]);
        double mediaProjetos;
        double somaNotas = 0;
        double somaPesos =0;
        //Calculo primeiro somatorio
            for(int i = 0; i < pi.length; i++ ){
                somaNotas += pi[i]*wi[i];
            }
         //Calculo segundo somatorio
         for(int i =0; i<wi.length; i++){
            somaPesos +=wi[i];
         }
         
       mediaProjetos= somaNotas/somaPesos;

       double cf = (mediaProjetos * 0.9) + (a * 0.1);
       int cfFinal = (int)Math.round(cf);

       if(cfFinal>=6){
        System.out.printf("Aprovado com conceito final igual a %d", cfFinal);
       }else{
        System.out.printf("Reprovado com conceito final igual a %d", cfFinal);
       }
      
    }

}
