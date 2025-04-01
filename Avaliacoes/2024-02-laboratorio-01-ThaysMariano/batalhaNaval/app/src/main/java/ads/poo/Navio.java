package ads.poo;

public class Navio {

    private int tamanho;
    private int x;
    private int y;
    private boolean horizontal;
    private char letra;
    private boolean afundou;
    private int atingido;

    public Navio(int tamanho, int x, int y, boolean horizontal, char letra) {
        this.tamanho = tamanho;
        this.x =x;
        this.y=y;
        this.horizontal = horizontal;
        this.letra = letra;
    }


    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isHorizontal() {
        return horizontal;
    }

    public void setHorizontal(boolean horizontal) {
        this.horizontal = horizontal;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public boolean isAfundou() {
        return afundou;
    }

    public int getAtingido() {
        return atingido;
    }


    public void defirirPosicaoMapa(int tamanho, int x, int y, boolean horizontal){
        if (horizontal){
            int[] X = new int[tamanho];
        }else {
            int[] Y = new int[tamanho];
        }
    }


//Olhar todas as casas ainda
    public String atirarEm(int x, int y){
        if (x==this.x && y==this.y){
            return "Acertou o alvo";
        }else {
            return "Errou";
        }

    }


    public String verificarAfundou(){
        if (this.tamanho==this.atingido){
            return "Afundou";
        }else{
            return "nao fundou";
        }
    }



}
