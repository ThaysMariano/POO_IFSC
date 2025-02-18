package ads.poo.ExercPilha;

public class Pilha {

    private Pessoa[] pessoas;
    private int tamanhoAtual;
    private int tamanhoMaximo;

    public Pilha(int tamanho) {
        this.pessoas = new Pessoa[tamanho];
        this.tamanhoAtual = 0;
        this.tamanhoMaximo = tamanho;
    }

    public void empilhar(Pessoa p) throws PilhaCheiaException, PilhaVaziaException {
        if(isPilhaCheia()){
            throw new PilhaCheiaException("Pilha no limite");
        }
        pessoas[tamanhoAtual] = p;
        tamanhoAtual++;
    }

    public Pessoa desempilhar() throws PilhaVaziaException {
        if(isPilhaVazia()){
            throw new PilhaVaziaException("Pilha vazia");
        }
        tamanhoAtual--;
        Pessoa p = pessoas[tamanhoAtual];
        pessoas[tamanhoAtual] = null;
        return p;
    }

    public Pessoa obterElementoTopo(){
        return pessoas[tamanhoAtual];
    }


    public boolean isPilhaVazia(){
        if(tamanhoAtual==0){
            return true;
        }
        return false;
    }

    public boolean isPilhaCheia(){
        if(tamanhoAtual==tamanhoMaximo){
            return true;
        }
        return false;
    }





}
