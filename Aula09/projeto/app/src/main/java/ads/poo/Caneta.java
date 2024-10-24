package ads.poo;

public class Caneta {

    //atributos
    private String cor;
    private int porcentagemTinta;



    //métodos
    public void definirCor(String c) {
        cor = c;
    }

    public void definirPorcentagem(int porcentagem){
        porcentagemTinta=porcentagem;
    }

    public String desenhar(int distancia){
        if(distancia>=0) {
            if (porcentagemTinta < distancia) {
                return "Não há tinta suficiente na caneta " + cor;
            } else {
                porcentagemTinta = -distancia;
                return "Desenhando " + distancia + "cm na cor " + cor;
            }
        }else{
            return "Opcão de valor inválida para desenhar";
        }
    }





//    public int obterPorcentagemAtual(){
//        valorTintaAtual=porcentagemTinta-distancia;
//        return valorTintaAtual;
//    }
//private int valorTintaAtual;



}
