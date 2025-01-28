# Exercicios


## 01
```mermaid

classDiagram
    
    Pessoa <|-- Aluno
    Pessoa <|-- Professor
    Professor <|-- Coordenador
    Pessoa <|-- Diretor
    
    class Pessoa{
        # nome : String
        # cpf : CPF
        
    }
    
    class Aluno{
        -matricula
    }
    
    class Professor{
        -salario
    }
    
    class Coordenador{
        -fg
    }

    class Diretor{
      -cd
    }
        





```
## 02

```mermaid
classDiagram

    Texto <|-- Livro
    Texto <|-- Revista
    Texto <|-- Jornal
    Texto <|-- Gibi
    
    class Texto{
        #genero : String
        #tamanhoPaginas : int
        #titulo : String
        #editora : String

    }
    
    class Livro{
        -tipoCapa : String
        -autores : ArrayList~String~
 
    }
    
    class Revista{
        - Imagens ArrayList~Imagens~
        - editor : String
    }
    class Jornal{
        - Manchete : ArrayList~String~
    }
    class Gibi{
        - quadirnhos : ArrayList~Quadrinhos~
        -autores : ArrayList~String~

    }
    
    
    
```

## 03

```mermaid
classDiagram

    meioDeTransporte <|-- Carro
    meioDeTransporte <|-- Aviao
    meioDeTransporte <|-- Barco
    Carro <|-- Caminhao
    
    
    class meioDeTransporte{
        - numPassageiros
        - motor
    }
    
    class Carro{
        
    }
    
    class Aviao{
        
    }
    class Barco{
        
    }
    class Caminhao{
        
    }
    
    
    
```

## 04

```mermaid

classDiagram
    
    Mamifero <| -- Gato
    Mamifero <| -- Cachorro
    Mamifero <| -- Baleia
    Ave <| -- Arara
    Ave <| -- Galinha
    Peixe <|-- Tubarao


    class Mamifero{
        - 
    }
    
    class Ave{
       
    }
    class Peixe{
        
    }
    
    class Gato{
        
    }
    
    class Cachorro{
        
    }
    class Arara{
        
    }
    class Galinha{
        
    }
    class Baleia{
        
    }   
    class Tubarao{
        
    }




```
