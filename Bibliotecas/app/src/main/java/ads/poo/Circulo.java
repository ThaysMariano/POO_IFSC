package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Circulo {

    private double x;
    private double y;
    private double raio;
    private Color cor;

//---------------------------------------------------------------


    public Circulo(double x, double y, double raio, Color cor) {
        this.x = x;
        this.y = y;
        this.raio = raio;
        this.cor = cor;
    }

    public void desenhar(Draw draw){
        Color corAtual = draw.getPenColor();
        draw.setPenColor(this.cor);
        draw.circle(this.x, this.y, this.raio);
        Color corNova = draw.getPenColor();

    }






}
