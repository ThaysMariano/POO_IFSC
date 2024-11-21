package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Grade {

    private double x;                   //Início do mapa em X
    private double y;                   //Início do mapa em Y
    private final double linhas = 10;   //Número de linhas
    private final double colunas = 10;  //Número de colunas
    private final double celula = 40;   //Tamanho dos quadrados
    private Color cor;                  //Cor da grade



//----------------------------------------------

    public Grade(double x, double y, Color cor) {
        this.x = x;
        this.y = y;
        this.cor = cor;
        gerarLetrasNumeros(this.x, this.y, this.cor);
    }

    public void gerarLetrasNumeros(double x, double y, Color cor, Draw draw){
        //Letras na esquerda
        char letra = 'a';
        for(int i=0; i<=linhas; i++){
            draw.
        }


    }

    public void desenhar(Draw draw){
        for( int i =0; i<=linhas; i++){
            draw.line(x, y+(i*celula), x+(colunas*celula), y+(i*celula) );
        }
        for (int j=0; j<=colunas; j++){
            draw.line(x+(j*celula), y, x+(j*celula), y+(linhas*celula)  );
        }

    }
}
