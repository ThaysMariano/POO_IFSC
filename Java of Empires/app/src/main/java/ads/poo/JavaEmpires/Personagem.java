package ads.poo.JavaEmpires;

public abstract class Personagem {
    protected double vida;
    protected int ataque;
    protected double velocidade;

    public Personagem(double vida, int ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public abstract String atacar();

    public abstract String andar();

}
