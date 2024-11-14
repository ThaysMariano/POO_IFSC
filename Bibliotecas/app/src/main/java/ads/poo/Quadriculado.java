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

    public void desenhar(Draw draw){
        for (int i=0; i<linhas; i++){
            draw.line(x, y+(i*ladoQuadrado), x*ladoQuadrado*colunas, y+(i*ladoQuadrado));
        }
        for (int i=0; i<colunas; i++){
            draw.line(x, y+(i*ladoQuadrado), x*ladoQuadrado*linhas, y+(i*ladoQuadrado));
        }
    }









    public void definirQuadrados(Draw draw){
        draw.square(this.x, this.y, this.ladoQuadrado);
    }










}
