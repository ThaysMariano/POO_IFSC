package ads.poo;

public class Contador {

    private int valorAtual;


    public void atribuirValor(int i){
       valorAtual=i;
    }

    public void incrementarContador(){
        valorAtual++;
    }

    public int obterValor(){
        return valorAtual;
    }




}
