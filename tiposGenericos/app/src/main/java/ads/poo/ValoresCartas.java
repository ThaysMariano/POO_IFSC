package ads.poo;

public enum ValoresCartas {

    AS("1"),
    DOIS("2"),
    TRES("3"),
    QUATRO("4"),
    CINCO("5"),
    SEIS("6"),
    SETE("7"),
    OITO("8"),
    NOVE("9"),
    DEZ("10"),
    VALETE("J"),
    DAMA("Q"),
    REI("K");

    public String valor;

    ValoresCartas(String valor) {
        this.valor = valor;
    }



}
