[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/JMa5AynB)

# Thays da Silva Mariano

##  Modelagem de classes e uso da biblioteca algs4

Crie um projeto Java com gradle e adicione a biblioteca algs41 como dependência do seu projeto.
Na classe App.java, crie um atributo do tipo edu.princeton.cs.algs4.Draw e com o nome draw.
Crie um método construtor para a classe App.java e inicialize o atributo draw conforme o código
apresentado na Listagem 1. O método construtor deve criar uma janela com dimensões 1000x600 e
escala de 0 a 1000 no eixo x e de 0 a 600 no eixo y. O método construtor deve também configurar a
janela para fechar quando o usuário clicar no botão de fechar a janela

- Listagem 1: Construtor da classe App.java
```
public App() {
this.draw = new Draw();
draw.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
this.draw.setCanvasSize(1000, 600);
this.draw.setXscale(0, 1000);
this.draw.setYscale(0, 600);
}
```

1. Modele uma classe chamada Grade que deverá possuir um método com a seguinte assinatura
public void desenhar(Draw draw). O método desenhar deverá desenhar uma grade 10x10,
com linhas horizontais e verticais, na tela. Cada célula da grade deverá ter dimensões 40x40.
A grade deverá ser desenhada na posição (x, y) da tela. Essa posição deve ser passada ao
construir um objeto da classe Grade. Também é necessário desenhar as letras de A a J e os
números de 1 a 10 nas bordas dessa grade. Veja a Figura 1 para ter uma ideia de como a grade
deve ser desenhada. 

2. Modele uma classe chamada Navio que deverá possuir um método com a seguinte assinatura
public void desenhar(Draw draw). O método desenhar deverá desenhar um navio na tela.
O navio deverá ser desenhado na posição (x, y) da tela, na horizontal ou na vertical. Essas
informações devem ser passadas ao construir um objeto da classe Navio. A largura do navio
deverá ser 40 e o comprimento deverá ser múltiplos de 40, a depender do tamanho do navio.

3. Na classe App crie dois objetos da classe Grade e invoque o método desenhar de cada um
deles para desenhá-los na tela, estando um ao lado do outro. Depois crie um objeto da classe
Navio e invoque o método desenhar para desenhá-lo na tela. O navio deve ser desenhado na
posição (x, y) da tela e com a orientação vertical. A posição (x, y) representa uma linha e uma
coluna de uma das grades desenhadas anteriormente. O navio deve ter tamanho 5. Veja a
Figura 2 para ter uma ideia de como o navio deve ser desenhado.



Para cada uma das classes que você modelar é preciso identificar todos os atributos necessários,
bem como os demais métodos que são relevantes para atender aos requisitos do problema
proposto. É obrigatório fazer uso de todos os assuntos abordados até o momento, como
encapsulamento, constantes, construtores, sobrecarga, etc. Não deve haver constantes literais
no código e o código deve ser o mais genérico possível. Faça comentários no código para
explicar o que cada método faz e o que cada atributo representa.