package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Navio {

    private final double largura = 40;  //largura fixa do navio

    private double x;                   //X do navio
    private double y;                   //Y do navio
    private boolean horizontal;         //true = horizontal, false = vertical
    private int comprimento;            //comprimento do navio


//-------------------------------------------------


    public Navio(double x, double y, boolean horizontal, int comprimento) {
        this.x = x;
        this.y = y;
        this.horizontal = horizontal;
        this.comprimento = comprimento;

    }

    //faltou transformar o x e y nas letras e números da grade


    public void desenhar(Draw draw){
        //desenhar na horizontal se true e na vertical se false
        draw.setPenColor(Color.blue);
        if (this.horizontal) {
            for (int i = 0; i < this.comprimento; i++) {
                draw.filledSquare((this.x + largura * i) + largura/2, this.y + largura/2, largura/2);
            }
        }else{
            for (int i = 0; i < this.comprimento; i++) {
                draw.filledSquare(this.x + largura/2, (this.y + largura*i)+largura/2, largura/2);
            }
        }
    }

}
