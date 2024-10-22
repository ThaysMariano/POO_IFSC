package ads.poo;

public class Carro {

    //atributos
    private String modelo;
    private int velocidadeAtual;
    private String cor;

    //metodos
    public void definirVelocidade(int v){
        velocidadeAtual=v;
    }

    public int obterVelocidade(){
        return velocidadeAtual;
    }

    public void definirCor(String s){
        cor = s;
    }

    public String obterCor(){
        return cor;
    }

    public void definirModelo(String s){
        modelo = s;
    }
    public String obterModelo(){
        return modelo;
    }






}
