package ads.poo.veiculos;

public abstract class Veiculo {

    protected int id;
    protected int velocidaadeAtual;






    public Veiculo(int id, int velocidaadeAtual) {
        this.id = id;
        this.velocidaadeAtual = velocidaadeAtual;
    }

    public abstract int acelerar(int i);

    public abstract int frear(int i);


}
