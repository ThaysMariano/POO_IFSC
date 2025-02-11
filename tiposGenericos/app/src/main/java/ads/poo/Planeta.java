package ads.poo;

public enum Planeta {
    MERCURIO(1, "rochoso"),
    VENUS(2, "rochoso"),
    TERRA(3, "rochoso"),
    MARTE(4, "rochoso"),
    JUPITER(5, "gasoso"),
    SATURNO(6, "gasoso"),
    URANO(7, "gasoso"),
    NETURNO(8, "gasoso");


    public final int posicao;
    public final String superficie;

    Planeta(int p, String s) {
        this.posicao = p;
        this.superficie= s;
    }

    @Override
    public String toString() {
        return  posicao+"°"+ " planeta. Superfície:" + superficie;
    }
}
