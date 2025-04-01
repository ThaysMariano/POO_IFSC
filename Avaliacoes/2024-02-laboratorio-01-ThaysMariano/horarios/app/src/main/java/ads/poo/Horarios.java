package ads.poo;

public class Horarios {

    private int hora;
    private int minuto;
    private int segundo;


//--------------------------------------

    public Horarios() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    public Horarios(int hora) {
        this.conferirHora(hora);
    }
    public Horarios(int hora, int minuto) {
        this.conferirHora(hora);
        this.conferirMinuto(minuto);
    }

    public Horarios(int hora, int minuto, int segundo) {
        this.conferirHora(hora);
        this.conferirMinuto(minuto);
        this.conferirSegundo(segundo);
    }

    @Override
    public String toString() {
        return hora +":"+ minuto+ ":"+ segundo;
    }

    public long retornarHorarioEmSegundos(){
        return ((hora*60*60)+(minuto*60)+segundo);
    }

    public long subtrairHorarios(Horarios h){
        return Math.abs(h.retornarHorarioEmSegundos()-this.retornarHorarioEmSegundos());
    }

    public void conferirHora(int h){
        if (h<0 || h>23){
            this.hora = 0;

        }else{
            this.hora=h;
        }
    }
    public void conferirMinuto(int m){
        if (m<0 || m>59){
            this.minuto = 0;
        }else{
            this.minuto=m;
        }
    }
    public void conferirSegundo(int s){
        if (s<0 || s>59){
            this.segundo = 0;
        }else{
            this.segundo=s;
        }
    }



//Criar metodos
    public boolean setHora(int hora) {
        boolean Hora = true;
        int horaAnterior=this.hora;
        conferirHora(hora);
        if(this.hora!=hora){
            this.hora=horaAnterior;
            Hora = false;
        }
        return Hora;
    }

    public boolean setMinuto(int minuto) {
        boolean Minuto = true;
        int minutoAnterior=this.minuto;
        conferirMinuto(minuto);
        if(this.minuto!=minuto){
            this.minuto=minutoAnterior;
            Minuto= false;
        }
        return Minuto;
    }

    public boolean setSegundo(int segundo) {
        boolean Segundo = true;
        int segundoAnterior=this.segundo;
        conferirSegundo(segundo);
        if(this.segundo!=segundo){
            this.segundo=segundoAnterior;
            Segundo= false;
        }
        return Segundo;
    }



    public String escreverExtenso(){
        String[] unicos = {"um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
        String[] dezenas = { "","","vinte", "trinta", "quarenta", "cinquenta", "sessenta"};

        int h = this.hora%10;

        if(this.hora>=20) {

            return dezenas[h - 1] + "horas, ";
        }else if (h%10>0){
           return unicos[h] + "horas, ";
        }else{
           return unicos[h]+ "horas, ";
        }
    }






//-------------------------------------------------------------------------------------------
public void conferirHoraMinutoSegundo(int h, int m, int s){
    if(h>23 || m>59 || s>59){
        this.hora=0;
        this.minuto=0;
        this.segundo=0;
    }else{
        this.hora = h;
        this.minuto=m;
        this.segundo=s;
    }
}


}
