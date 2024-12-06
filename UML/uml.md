# Batalha Naval
```mermaid

    classDiagram
        
        direction LR


        Mensagens -- Tiro
        Mensagens -- Regras
        
        Computador -- Navio
        Computador -- Grade
        Computador -- Tiro
        Computador -- Regras

        
        App -- Mensagens
        App-- Computador
        
        
        class Navio{
          - xNavio: int
          - yNavio: int
          - horizontal: boolean
          - tipo: char
        
         + naviosInteiros() int
         + definirComprimento(t: char) int
         + desenharNavio(x: int, y: int, tp: char, h: boolean) boolean
        
        }
        class Grade{
            - xGrade: int
            - yGrade: int
            - celula: int
            - linhas: int
            - colunas: int 

            + desenharGrade(x: int, y: int, l: int, c: int, cel: int) boolean
        }
        class Tiro{
            - xTiro: int
            - yTiro: int
            - acertou: boolean (n sei se precisa)
            
            + verifircarTiro(x: int, y: int) boolean 
            + desenharTiro(x: int, y: int) 
        
        }
        class Mensagens{
            
            
            + mensagemFinal()String
            + menu()String
            + mensagemVitoria()String
            + mensagemDerrota()String
            + mensagemErros()String
            + mensagemTiroAcertou()String
            + mensagemTiroErrou()String
            + mensagemJOgarNovamente()String
            + mensagemEstatistica()String
        }
        class Regras{
            recebe dados navio e grade (como?)
            (????)
            + verificarSobreposicao(xN: int, yN: int)boolean
            + verificarNaGrade()boolean
            
        }
        class Computador{
            
            
            
            
        }
        class App{
            
        }
 
    
    
    
    
 
    
    

```
