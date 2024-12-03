
## Agenda Telefônica

```mermaid

classDiagram

    direction TB
 
    ListaDeContatos "1" *--> "*" Contato
    Contato "1" *--> "1..*" Telefone
    Contato "1" *--> "1..*" Email
    App --> ListaDeContatos
    
    
    class App{
        -ListaDeContatos
        + main()$
    }
    
    class ListaDeContatos{
        - contato : Contato
        
        
        + adicionarContato(nome : String) :
        + removerContato(nome : String) -- ou indice:
        + atualizarContato(nome: String) :
        + listarDadosContato(nome: String) :
        + listarContatos(nome: String) :
    }
    
    class Contato{
        - nome : String
        - sobremome : String
        - dataNascimento : LocalDate
        - telefones : ArrayList~Telefone~
        - emails : ArrayList~Email~
        
        + contato(String n, String s, String data, String tel, String e)
        + verificarRotulos()
        + add, rm, update
    }
    
    class Telefone{
        -rotulo : String
        -valor : String
        
    }
    
    class Email{
        -rotulo : String
        -valor : String
        
        
        +verificarValidadeEmail()
    }








```