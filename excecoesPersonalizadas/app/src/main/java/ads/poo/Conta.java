package ads.poo;

public class Conta {

    private double saldo;


    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void saque(double valor) throws SaldoInsuficienteException, ValorNegativoException {
        if(this.saldo<valor){
            throw new SaldoInsuficienteException("saldo insuficiente");
        }else if(valor<0){
            throw new ValorNegativoException("Valor negativo inserido");
        }
        this.saldo-=valor;
    }

}
