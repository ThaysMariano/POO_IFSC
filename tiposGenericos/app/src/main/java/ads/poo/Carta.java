package ads.poo;

public class Carta {

    private Naipe naipe;
    private ValoresCartas valor;

    public Carta(Naipe naipe, ValoresCartas valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carta {" +
                "naipe= " + naipe +
                ", valor= " + valor +
                " }";
    }
}
