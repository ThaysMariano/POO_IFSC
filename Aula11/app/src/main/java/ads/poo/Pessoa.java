package ads.poo;

public class Pessoa {



    private String nome;
    private String cpf;

    private int dataNasc;
    private int telefone;
    private String cidade;
    private String profissao;

//----------------------------------------------------------

    //metodo construtor
    public Pessoa(String n, String c){
        nome =n;
        cpf =c;
    }

    //ainda pode criar sem parametros diretos
    public Pessoa(){

    }

    public void definirNome(String n){
        nome=n;
    }

    public void definirCPF(String c){
        cpf=c;
    }

    public String imprimir(){
        return "Nome: "+ nome+ "   CPF: "+ cpf;
    }





}
