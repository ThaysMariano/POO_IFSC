package ads.poo;

public class Estudante {

    private int matricula;
    private String dataNasc;
    private String nome;
    private static int total=0;                          //variavel compartilhada

//-------------------------------------------------------------------------------

    public Estudante(int matricula, String dataNasc, String nome) {
        this.matricula = matricula;
        this.dataNasc = dataNasc;
        this.nome = nome;
        total++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getTotal(){
        return total;
    }

    public String toString(){
        return "Nome: "+ this.nome+
                "\nData de Nascimento: "+ this.dataNasc+
                "\nMatrícula: "+ this.matricula;
    }








}