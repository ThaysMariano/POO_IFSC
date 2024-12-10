package ads.poo;

public class Email {

    private String rotulo;
    private String valor;

//----------------------------------


    public Email(String r, String v) {
        this.rotulo = r;
        this.validarEmail(v);
    }

    @Override
    public String toString() {
        return "Email" +
                "\n " + rotulo+ ": " + valor;

    }

    public void validarEmail(String valor) {
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if(valor.matches(eR)){
            this.valor = valor;
        }else{
            this.valor = null;
        }
    }

    public String getRotulo() {
        return rotulo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
