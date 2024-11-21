package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Navio {

    private double x;
    private double y;
    private boolean horizontal;
    private final double largura = 40;
    private int comprimento;
    private Color cor;

//-------------------------------------------------


    public Navio(double x, double y, boolean horizontal, int comprimento) {
        this.x = x;
        this.y = y;
        this.horizontal = horizontal;
        this.comprimento = comprimento;

    }

    public boolean conferir(){
        if (this.x%40 !=0 || this.y %40!=0){
            return false;
        }else{
            return true;
        }
    }

//    public int retornarComprimento(int comprimento){
//        int comp = (int)largura*this.comprimento;
//        return comp;
//    }

    public void desenhar(Draw draw, Color cor){
        //desenhar na horizontal se true e na vertical se false
        draw.setPenColor(cor);
        if (this.horizontal) {
            for (int i = 0; i < this.comprimento; i++) {
                draw.filledSquare((this.x + largura * i) + largura / 2, this.y + largura / 2, largura / 2);
            }
        }else{
            for (int i = 0; i < this.comprimento; i++) {
                draw.filledSquare(this.x + largura / 2, (this.y + largura*i)+largura/2, largura / 2);
            }
        }



    }




}
