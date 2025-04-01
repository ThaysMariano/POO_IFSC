package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Grade {

    private final double linhas = 10;   //Número de linhas
    private final double colunas = 10;  //Número de colunas
    private final double celula = 40;   //Tamanho dos quadrados

    private double x;                   //Início do mapa em X
    private double y;                   //Início do mapa em Y



//----------------------------------------------

    public Grade(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void gerarLetrasNumeros(Draw draw){
        //Letras na esquerda
        int espaco = 15;

        draw.setPenColor(Color.red);
        char letra = 'A';
        for(int i=0; i<linhas; i++){
            draw.text((this.x-espaco), y+(i*celula)+espaco, String.valueOf(letra));
            letra++;
        }

        int num = 1;
        //Numeros embaixo
        for(int i=0; i<colunas; i++){
            draw.text(x+(i*celula+celula/2), y-espaco, String.valueOf(num));
            num++;
        }


    }

    public void desenhar(Draw draw){
        draw.setPenColor(Color.black);
        //desenhar linhas
        for( int i =0; i<=linhas; i++){
            draw.line(x, y+(i*celula), x+(colunas*celula), y+(i*celula) );
        }
        //desenhar colunas
        for (int j=0; j<=colunas; j++){
            draw.line(x+(j*celula), y, x+(j*celula), y+(linhas*celula)  );
        }

        gerarLetrasNumeros(draw);

    }
}
