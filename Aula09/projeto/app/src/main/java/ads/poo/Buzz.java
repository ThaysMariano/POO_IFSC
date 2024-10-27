package ads.poo;

import java.util.Random;

public class Buzz {

    Random r = new Random();
    private int asas;
    private int capacete;




    public String abrirFecharAsas() {
        if (asas % 2 ==0){
            asas++;
            return "Asas abertas";
        }
        else {
            asas++;
            return "Asas fechadas";
        }
    }
    public String dispararLaser(){
        return "Laser disparado";
    }
    public String golpear(){
        return "Golpe *pow!*";
    }

    public String abrirFecharCapacete() {
        if (capacete % 2 ==0){
            capacete++;
            return "Capacete aberto";
        }
        else {
            capacete++;
            return "Capacete fechado";
        }
    }

    public String falar(){
        int num = r.nextInt(5);
        switch(num){
            case 0:
                return "Ao infinito e além!";
            case 1:
                return "Vamos salvar a galáxia!";
            case 2:
                return "Eu sou Buzz Lightyear!";
            case 3:
                return "Buzz Lightyear ao resgate!";
            case 4:
                return "Buzz Lighyear se apresentando para o serviço!";
            default:
                return "Comando estelar pronto para voar!";
        }
    }





}






