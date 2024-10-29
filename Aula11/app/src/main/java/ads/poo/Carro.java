package ads.poo;

public class Carro {

    private final int VELOCIDADE_MAXIMA= 200;
    private int velocidadeAtual;


    private int aerodinamica;
    private String modelo;
    private int preco;
    private int integridade;


//----------------------------------------------------------------


    public void acelerar(int numero){
        if ( (velocidadeAtual + numero) >VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
        else{
            velocidadeAtual += numero;
        }
    }
    public void frear(int numero) {
        if ((velocidadeAtual - numero) < 0) {
            velocidadeAtual = 0;
        } else {
            velocidadeAtual -= numero;
        }
    }

    public int obterVelocidade(){
        return velocidadeAtual;
    }











}
