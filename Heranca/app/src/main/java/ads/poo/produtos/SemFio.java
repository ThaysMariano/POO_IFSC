package ads.poo.produtos;

public class SemFio extends Telefone{

    private double frequencia;
    private int quantidadeCanais;
    private double distancia;


//--------------------------------------------


    public SemFio(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao,
                  double frequencia, int quantidade, double distancia) {
        //super 1° linha
        super(codigo, numSerie, modelo, peso, dimensao);
        this.frequencia = frequencia;
        this.quantidadeCanais = quantidade;
        this.distancia = distancia;

        super.codigo = 10;  //codigo é protected

    }


    @Override
    public String imprimirDados() {
        final StringBuilder sb = new StringBuilder("SemFio{");
        sb.append("frequencia=").append(frequencia);
        sb.append(", quantidadeCanais=").append(quantidadeCanais);
        sb.append(", distancia=").append(distancia);
        sb.append('}');
        sb.append(super.imprimirDados());
        return super.imprimirDados();
    }
}
