package ads.poo.JavaEmpires;


public class Aldeao extends Personagem {

    public Aldeao(double vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    private String atacar(){
        return "Atacando com a picareta";
    }

    private String andar(){
        return "Andando com velocidade = " + velocidade;

    }

}
