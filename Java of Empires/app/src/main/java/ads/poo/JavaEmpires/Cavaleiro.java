package ads.poo.JavaEmpires;

public class Cavaleiro extends Personagem implements  Guerreiro{


    public Cavaleiro(double vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    public String atacar(){
        return "Atacando com cavalo";
    }

    public String andar(){
        return "Andando com velocidade = " + velocidade;
    }



}
