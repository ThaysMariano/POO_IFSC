package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Ifsc {

    private int x;
    private int y;
    private int raio;

    private Color cor;

//------------------------------------


    public Ifsc(int x, int y, int raio, Color cor) {
        this.x = x;
        this.y = y;
        this.raio = raio;
        this.cor = cor;
    }



    public void desenharCirculo(Draw draw){
        Color corAtual = draw.getPenColor();
        draw.setPenColor(this.cor);
        draw.filledCircle(this.x, this.y, this.raio);
        Color corNova = draw.getPenColor();
    }

    public void desenharQuadrados(Draw draw){

        Color corAtual = draw.getPenColor();
        draw.setPenColor(this.cor);
        draw.filledRoundRectangle(this.x, this.y, 45, 45, 10, 10);
        Color corNova = draw.getPenColor();
    }


}
