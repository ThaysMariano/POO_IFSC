package ads.poo.veiculos;

public class Panther extends Veiculo implements Conversivel, TracaoIntegral, VeiculoAnfibio {

    private int temperaturaGeladeira;

    public Panther(int id, int velocidaadeAtual, int temperaturaGeladeira) {
        super(id, velocidaadeAtual);
        this.temperaturaGeladeira=temperaturaGeladeira;
    }


    public int alterarTemperatura(int t){
        return t;
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
        return false;
    }

    @Override
    public boolean ativarDesativarTracao() {
        return false;
    }

    @Override
    public boolean abrirRecolherRodas() {
        return false;
    }

    @Override
    public String esvaziarLastro() {

        return "";
    }
}
