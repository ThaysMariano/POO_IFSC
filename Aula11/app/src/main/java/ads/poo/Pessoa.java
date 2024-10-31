package ads.poo;

public class Pessoa {


    private String nome;
    private String sobrenome;
    private String cpf;

    private int dataNasc;
    private int telefone;
    private String cidade;
    private String profissao;

//----------------------------------------------------------

    public Pessoa(){

    }
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String sobrenome) {
        this(nome);
        this.sobrenome = sobrenome;
    }

    public Pessoa(String nome, String sobrenome, String cpf) {
        this(nome, sobrenome);
        this.cpf = cpf;
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
