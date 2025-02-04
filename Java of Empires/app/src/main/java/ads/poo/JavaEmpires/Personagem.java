package ads.poo.JavaEmpires;

public class Personagem {
    protected double vida;
    protected int ataque;
    protected double velocidade;

    public Personagem(double vida, int ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public String atacar(){
        return "atacando";
    }

    public String andar(){
        return "andando";
    }

}
