package ads.poo.JavaEmpires;

public class Arqueiro extends Personagem{

    public Arqueiro(double vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    public String atacar(){
        return "atacando com flechas";
    }

    public String andar(){
        return "andando com velocidade = "+ velocidade;
    }


}

