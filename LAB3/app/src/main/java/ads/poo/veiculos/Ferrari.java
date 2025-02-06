package ads.poo.veiculos;

public class Ferrari extends  Veiculo implements Conversivel {

    private boolean farol;
    private int VEL_MAX=200;
    private boolean capota;




    public Ferrari(int id, int velocidaadeAtual, boolean farol) {
        super(id, velocidaadeAtual);
        this.farol=farol;
    }

    private boolean ligarDesligarFarol(){
        return farol;
    }


    @Override
    public int acelerar(int i) {
        return velocidaadeAtual;
    }

    @Override
    public int frear(int i) {
        return velocidaadeAtual;
    }

    @Override
    public boolean abrirFecharCapota() {
        if (velocidaadeAtual!=0){
            if (capota){
                return capota;
            }else{
                return !capota;
            }
        }
        //vel = 0 n pode
        return false;
    }
}
