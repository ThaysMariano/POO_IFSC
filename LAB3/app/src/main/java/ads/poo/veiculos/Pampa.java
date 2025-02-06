package ads.poo.veiculos;

public class Pampa extends Veiculo  implements TracaoIntegral{

    private boolean cacamba;

    public Pampa(int id, int velocidaadeAtual, boolean cacamba) {
        super(id, velocidaadeAtual);
        this.cacamba = cacamba;
    }

    private boolean abrirFecharCacamba(){
        return true;
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
    public boolean ativarDesativarTracao() {
        return false;
    }
}
