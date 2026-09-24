# Exemplo prático de POO em Java

Este diretório contém um exemplo simples de Programação Orientada a Objetos desenvolvido como complemento ao Miniguia de Estudos.

O código demonstra, em um único exemplo, diferentes conceitos estudados durante o projeto.

## Conceitos demonstrados

### Classe

As classes `Pessoa`, `Aluno` e `Main` representam estruturas utilizadas no programa.

### Atributo

A classe `Pessoa` possui o atributo:

```java
private String nome;
```

### Encapsulamento

O atributo `nome` foi declarado como `private`, restringindo seu acesso direto.

### Construtor

A classe `Pessoa` possui um construtor utilizado para inicializar o nome:

```java
public Pessoa(String nome) {
    this.nome = nome;
}
```

### Método

O método `apresentar()` representa um comportamento do objeto.

### Herança

A classe `Aluno` utiliza:

```java
extends Pessoa
```

para estabelecer uma relação de herança com `Pessoa`.

### Sobrescrita de método

A classe `Aluno` redefine o comportamento de `apresentar()` utilizando:

```java
@Override
```

### Polimorfismo

O exemplo também utiliza uma referência do tipo `Pessoa` para armazenar um objeto `Aluno`:

```java
Pessoa aluno = new Aluno("Rodrigo");
```

Isso permite observar o comportamento polimórfico durante a execução do programa.

## Como executar

É necessário ter o Java Development Kit (JDK) instalado.

Na pasta `src`, compile o arquivo:

```bash
javac Main.java
```

Depois execute:

```bash
java Main
```

O exemplo foi criado com finalidade educacional e serve como complemento prático aos conceitos apresentados no Miniguia.
