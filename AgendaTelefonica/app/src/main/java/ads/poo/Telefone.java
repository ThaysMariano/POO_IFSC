package ads.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Telefone {

    private String rotulo;
    private String valor;


//------------------------------

    public Telefone(String r, String v) {
        this.rotulo = r;
        this.valor = this.formata("(##) #####−####", v);
    }

    @Override
    public String toString() {
        return "Telefone:   " +
                "\n " + rotulo + ": " + valor;

    }



    public String formata(String mascara, String valor){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }


    public String getRotulo() {
        return rotulo;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
