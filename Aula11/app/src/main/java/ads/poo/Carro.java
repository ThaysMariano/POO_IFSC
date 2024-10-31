package ads.poo;

public class Carro {

    private final int VELOCIDADE_MAXIMA;
    private int velocidadeAtual;


    private int aerodinamica;
    private String modelo;
    private int preco;
    private int integridade;


//----------------------------------------------------------------


    public Carro(int VELOCIDADE_MAXIMA, int velocidadeAtual, int aerodinamica, int preco, int integridade, String modelo){
        this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
        this.velocidadeAtual = 0;
        this.aerodinamica = aerodinamica;
        this.preco = preco;
        this.integridade = integridade;
        this.modelo = modelo;

        this.acelerar(velocidadeAtual);

    }

    public void acelerar(int numero){
        int numAbs = Math.abs(numero);
        this.velocidadeAtual = Math.min(velocidadeAtual+numAbs, VELOCIDADE_MAXIMA);

        //Professror: this.velocidadeAtual = Math.max(Math.min(VELMAX, velAtual+v), 0); <-- Apenas uma linha
    }

    public void frear(int numero) {
        int numAbs = Math.abs(numero);
        this.velocidadeAtual = Math.max(velocidadeAtual-numAbs, 0);
    }

    public int obterVelocidadeAtual(){
        return velocidadeAtual;
    }




}
