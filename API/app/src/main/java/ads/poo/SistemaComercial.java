package ads.poo;

import java.util.HashMap;

public class SistemaComercial {

    //            <chave,  obj cliente>
    private HashMap<String, Cliente> clientes;

    public SistemaComercial(){
        this.clientes  = new HashMap<>();
    }

    public boolean adicionarCliente(Cliente c){

       if (this.clientes.get(c.getCpf()) == null){
           this.clientes.put(c.getCpf(), c);
           return true;
       }

       return false;
    }

    public Cliente procurarCliente(String cpf){
        return clientes.get(cpf);
    }



    public static void main(String[] args) {

        SistemaComercial sist = new SistemaComercial();

        sist.adicionarCliente(new Cliente("Thays", "32492332", "2738453274"));
        sist.adicionarCliente(new Cliente("Kauan", "3346435652", "563563253274"));
        sist.adicionarCliente(new Cliente("Ana", "336562", "2768657435674"));


        System.out.println(sist.procurarCliente("3346435652"));






    }
}
