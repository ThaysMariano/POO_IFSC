/*
 * This source file was generated by the Gradle 'init' task
 */
package ads.poo;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.Random;

public class App implements DrawListener {

    private Draw draw;
    private double tamanhoPincel;

    public App() {
        this.draw = new Draw();
        this.draw.addListener((this));
    }

    public static void main(String[] args) {

        App app = new App();

    }
    Random r = new Random();

    @Override
    public void mousePressed(double x, double y) {
        this.draw.setPenColor(r.nextInt(255), r.nextInt(255), r.nextInt(255));
        this.draw.filledCircle(x, y, tamanhoPincel);

    }

    @Override
    public void mouseDragged(double x, double y) {
        this.draw.setPenColor(r.nextInt(255), r.nextInt(255), r.nextInt(255));
        this.draw.filledCircle(x, y, tamanhoPincel);
    }

    @Override
    public void keyTyped(char c) {
        if(c=='c'){
        this.draw.clear();
    }}

    @Override
    public void keyPressed(int keycode) {


       if(keycode ==107){
           tamanhoPincel+=0.01;
       }else if(keycode==109){
           tamanhoPincel-=0.01;
       }
    }

    //cor altera a cada cor
    //C limpa a tela

}
