package ads.poo;

public enum DiasDaSemana {
    DOM("Domingo", 1),
    SEG("Segunda-Feira", 2),
    TER("Terça-Feira", 3),
    QUA("Quarta-Feira", 4),
    QUI("Quinta-Feira", 5),
    SEX("Sexta-Feira", 6),
    SAB("Sábado", 7);


//atributos
    public final String extenso;
    public final int id;


    //construtor
    DiasDaSemana(String s, int i) {
        this.extenso = s;
        this.id=i;

    }

    @Override
    public String toString() {
        return  this.id + " " + this.extenso;
    }


    public static DiasDaSemana getById(int i){
        for (DiasDaSemana d : ads.poo.DiasDaSemana.values()){
            if(d.id == i){
                return d;
            }
        }
        return null;
    }







}