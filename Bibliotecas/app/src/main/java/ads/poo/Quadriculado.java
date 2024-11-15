package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Quadriculado {

    private double x;
    private double y;
    private double ladoQuadrado;
    private int linhas;
    private int colunas;
    private Color cor;


//--------------------------------------------


    public Quadriculado(double x, double y, double ladoQuadrado, int linhas, int colunas, Color cor) {
        this.x = x;
        this.y = y;
        this.ladoQuadrado = ladoQuadrado;
        this.linhas = linhas;
        this.colunas = colunas;
        this.cor = cor;
    }

    public void desenharQuadriculado(Draw draw){
        for (int i = 0; i <= linhas; i++) {
            draw.line(x, y + (i*ladoQuadrado), x + (colunas * ladoQuadrado), y + (i * ladoQuadrado));
        }
        for (int j = 0; j <= colunas; j++) {
            draw.line(x + (j * ladoQuadrado), y, x + (j * ladoQuadrado), y + (linhas * ladoQuadrado));
        }
    }


}
