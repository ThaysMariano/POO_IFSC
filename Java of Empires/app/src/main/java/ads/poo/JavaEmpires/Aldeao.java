package ads.poo.JavaEmpires;


public class Aldeao extends Personagem implements Coletador, Guerreiro {

    public Aldeao(double vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    public String atacar(){
        return "Atacando com a picareta";
    }

    public String andar(){
        return "Andando com velocidade = " + velocidade;

    }

    @Override
    public String coletarMadeira() {
        return "Coletando madeira";
    }

    @Override
    public String coletarOuro() {
        return "Coletando Ouro";
    }
}
