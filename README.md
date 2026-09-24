# Miniguia de Estudos: Programação Orientada a Objetos com Java

## 📚 Sobre o projeto

Este projeto foi desenvolvido como parte de uma atividade prática de aprendizagem utilizando inteligência artificial e o **NotebookLM**.

O objetivo foi estudar os principais fundamentos da **Programação Orientada a Objetos (POO) em Java)**, utilizando fontes de referência selecionadas, engenharia de prompts e atividades de aprendizagem ativa.

O projeto busca demonstrar não apenas o resultado final do estudo, mas também o processo utilizado para pesquisar, organizar, compreender e revisar os conteúdos.

---

## 🎯 Objetivos

* Compreender os fundamentos da Programação Orientada a Objetos.
* Entender a função de classes e objetos em Java.
* Compreender atributos, métodos e construtores.
* Estudar encapsulamento, herança, interfaces e polimorfismo.
* Utilizar inteligência artificial como ferramenta de apoio à aprendizagem.
* Praticar a elaboração de prompts mais específicos e estruturados.
* Utilizar aprendizagem ativa para verificar a compreensão dos conteúdos.
* Criar um material de consulta para estudos futuros.

---

## 🔎 Fontes utilizadas

As fontes foram selecionadas e adicionadas ao NotebookLM antes da realização das atividades.

1. **Oracle — Object-Oriented Programming Concepts**
   https://docs.oracle.com/javase/tutorial/java/concepts/

2. **Oracle — Classes and Objects**
   https://docs.oracle.com/javase/tutorial/java/javaOO/

3. **Oracle — What Is Inheritance?**
   https://docs.oracle.com/javase/tutorial/java/concepts/inheritance.html

4. **Oracle — What Is an Interface?**
   https://docs.oracle.com/javase/tutorial/java/concepts/interface.html

---

## 🤖 Utilização do NotebookLM

O NotebookLM foi utilizado como ferramenta de apoio ao estudo e organização do conhecimento.

O processo foi dividido em etapas:

1. Seleção e organização das fontes.
2. Criação de perguntas iniciais sobre POO.
3. Refinamento dos prompts.
4. Solicitação de explicações estruturadas.
5. Realização de um quiz para verificar a aprendizagem.
6. Revisão e consolidação dos conceitos.
7. Criação do Miniguia de Estudos.

---

## 🧠 Engenharia de Prompts

Durante o projeto, os prompts foram sendo aprimorados de acordo com a necessidade de obter respostas mais específicas.

### Teste 1 — Pergunta inicial

Foi utilizado inicialmente um prompt mais amplo:

> Explique o que é Programação Orientada a Objetos em Java e apresente seus principais conceitos.

O objetivo foi obter uma visão geral do assunto.

### Teste 2 — Prompt estruturado

Em seguida, o prompt foi refinado para solicitar conceitos específicos, exemplos práticos, relações entre os conceitos e indicação das fontes utilizadas.

Essa abordagem permitiu direcionar melhor a resposta e organizar o conteúdo de maneira mais adequada ao estudo.

### Teste 3 — Aprendizagem ativa

Foi solicitado ao NotebookLM que criasse um quiz com 10 perguntas sobre POO, aumentando gradualmente a dificuldade.

O objetivo foi verificar se os conceitos estudados haviam sido realmente compreendidos.

**Resultado:** todas as 10 questões foram respondidas corretamente.

### Teste 4 — Consolidação

Após o quiz, foi solicitado ao NotebookLM que realizasse uma revisão estruturada dos conceitos, destacando definições, exemplos, relações entre os conteúdos e erros comuns de iniciantes.

### Teste 5 — Produção do Miniguia

Por fim, o NotebookLM foi utilizado para organizar o conhecimento estudado em um Miniguia de Estudos estruturado, contendo conceitos, exemplos, tabela de revisão, erros comuns, glossário e checklist de aprendizagem.

---

# 📖 Miniguia de Estudos

## 1. Programação Orientada a Objetos

A Programação Orientada a Objetos é um paradigma de programação baseado na utilização de objetos que possuem características e comportamentos.

Em Java, os objetos são criados a partir de classes.

---

## 2. Classes

Uma classe funciona como uma estrutura que define características e comportamentos que seus objetos poderão possuir.

Uma classe pode declarar atributos e métodos.

```java
class Pessoa {
    String nome;

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}
```

---

## 3. Objetos

Um objeto é uma instância de uma classe.

Por meio dos objetos podemos utilizar os atributos e métodos definidos pela classe.

```java
Pessoa pessoa = new Pessoa();
pessoa.nome = "Rodrigo";
pessoa.apresentar();
```

---

## 4. Atributos

Atributos representam dados ou características associados a uma classe e aos seus objetos.

```java
class Pessoa {
    String nome;
    int idade;
}
```

Nesse exemplo, `nome` e `idade` são atributos.

---

## 5. Métodos

Métodos representam comportamentos ou ações que podem ser executados por um objeto.

```java
void apresentar() {
    System.out.println("Olá!");
}
```

Um método pode receber informações, executar operações e retornar um resultado.

---

## 6. Construtores

Construtores são utilizados durante a criação de objetos e podem ser usados para inicializar seus dados.

```java
class Pessoa {
    String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }
}
```

Um objeto pode então ser criado utilizando o construtor:

```java
Pessoa pessoa = new Pessoa("Rodrigo");
```

---

## 7. Encapsulamento

O encapsulamento está relacionado à organização e proteção dos dados de um objeto, controlando como esses dados podem ser acessados.

Um exemplo comum utiliza atributos privados e métodos públicos para acessar ou modificar seus valores.

```java
class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
```

---

## 8. Herança

A herança permite que uma classe seja baseada em outra, aproveitando características e comportamentos existentes.

```java
class Animal {
    void emitirSom() {
        System.out.println("Som");
    }
}

class Cachorro extends Animal {
}
```

Nesse exemplo, `Cachorro` herda características e comportamentos de `Animal`.

---

## 9. Interfaces

Uma interface define um contrato que pode ser implementado por classes.

```java
interface Animal {
    void emitirSom();
}

class Cachorro implements Animal {
    public void emitirSom() {
        System.out.println("Au au!");
    }
}
```

A classe que implementa a interface deve fornecer a implementação dos métodos definidos por ela.

---

## 10. Polimorfismo

Polimorfismo permite que uma mesma referência possa representar diferentes tipos de objetos relacionados, possibilitando comportamentos diferentes de acordo com o objeto utilizado.

Por exemplo:

```java
Animal animal = new Cachorro();
animal.emitirSom();
```

Nesse caso, a referência é do tipo `Animal`, enquanto o objeto criado é um `Cachorro`.

---

# 🔗 Como os conceitos se conectam

Os conceitos de POO não funcionam de maneira isolada.

Uma classe pode definir atributos e métodos. A partir dela podem ser criados objetos. Construtores podem ser utilizados para inicializar esses objetos.

O encapsulamento ajuda a controlar o acesso aos dados e comportamentos.

A herança permite estabelecer relações entre classes.

Interfaces permitem definir contratos que podem ser implementados por diferentes classes.

O polimorfismo permite trabalhar com diferentes objetos por meio de referências compatíveis, possibilitando comportamentos específicos.

---

# 📊 Tabela de revisão

| Conceito       | Ideia principal                                                   | Relação com Java                   |
| -------------- | ----------------------------------------------------------------- | ---------------------------------- |
| Classe         | Estrutura que define características e comportamentos             | `class`                            |
| Objeto         | Instância de uma classe                                           | `new`                              |
| Atributo       | Característica ou dado                                            | Variáveis da classe                |
| Método         | Comportamento ou ação                                             | Funções da classe                  |
| Construtor     | Inicialização do objeto                                           | Mesmo nome da classe               |
| Encapsulamento | Controle do acesso aos dados                                      | `private`, métodos de acesso       |
| Herança        | Reutilização e especialização entre classes                       | `extends`                          |
| Interface      | Definição de um contrato                                          | `interface`, `implements`          |
| Polimorfismo   | Uma referência podendo representar diferentes objetos compatíveis | Referências e métodos sobrescritos |

---

# ⚠️ Erros comuns de iniciantes

* Confundir classe com objeto.
* Confundir atributos com métodos.
* Criar objetos sem compreender a relação com suas classes.
* Não compreender a finalidade dos construtores.
* Acessar diretamente dados que deveriam estar encapsulados.
* Confundir herança com implementação de interfaces.
* Confundir interface com classe.
* Ter dificuldade para identificar situações em que o polimorfismo está sendo utilizado.

---

# 📖 Glossário

**Classe:** estrutura que define características e comportamentos.

**Objeto:** instância de uma classe.

**Atributo:** dado ou característica associado a uma classe ou objeto.

**Método:** comportamento ou ação definido em uma classe.

**Construtor:** mecanismo utilizado durante a criação de um objeto para sua inicialização.

**Encapsulamento:** mecanismo relacionado ao controle de acesso aos dados e comportamentos.

**Herança:** mecanismo que permite estabelecer uma relação entre classes, aproveitando características e comportamentos existentes.

**Interface:** contrato que pode ser implementado por classes.

**Polimorfismo:** capacidade de trabalhar com diferentes objetos relacionados por meio de uma referência compatível.

---

# ✅ Checklist de aprendizagem

* [x] Sei explicar o que é Programação Orientada a Objetos.
* [x] Sei diferenciar classe e objeto.
* [x] Sei identificar atributos.
* [x] Sei explicar o que são métodos.
* [x] Sei explicar a função dos construtores.
* [x] Compreendo o conceito de encapsulamento.
* [x] Compreendo o conceito de herança.
* [x] Compreendo o conceito de interface.
* [x] Compreendo o conceito de polimorfismo.
* [x] Consigo relacionar os principais conceitos de POO.

---

# 💡 Prompts reutilizáveis

### Explicação de um conceito

```text
Com base exclusivamente nas fontes deste notebook, explique o conceito de [CONCEITO] em Java.

Apresente:
- uma definição simples;
- sua finalidade;
- um pequeno exemplo em Java;
- uma explicação do exemplo;
- sua relação com os demais conceitos de POO.
```

### Quiz

```text
Com base exclusivamente nas fontes deste notebook, crie um quiz sobre [TEMA].

Crie perguntas começando pelos conceitos básicos e aumentando gradualmente a dificuldade.

Não apresente as respostas antes da minha tentativa. Após cada resposta, informe se está correta ou incorreta e explique o motivo utilizando as fontes do notebook.
```

### Revisão

```text
Com base exclusivamente nas fontes deste notebook, faça uma revisão de [TEMA].

Apresente os conceitos principais, exemplos práticos, relações entre os conceitos e erros comuns de iniciantes.
```

---
## Como executar

O projeto possui um exemplo prático em Java localizado em `src/Main.java`.

### Requisitos

* Java JDK instalado
* Terminal ou prompt de comando

### Compilar

Entre na pasta `src` e execute:

```bash
javac Main.java
```

### Executar

Depois da compilação:

```bash
java Main
```

### Saída esperada

```text
Olá, meu nome é Rodrigo
Olá, sou um aluno.
```

O exemplo demonstra, de forma prática, conceitos de Programação Orientada a Objetos, como classe, atributo, encapsulamento, construtor, método, herança, sobrescrita e polimorfismo.

---
# 🎓 Conclusão

O projeto demonstrou como o uso de fontes selecionadas, prompts estruturados e aprendizagem ativa pode apoiar o estudo de Programação Orientada a Objetos em Java.

O NotebookLM foi utilizado não apenas para gerar respostas, mas como ferramenta para organizar fontes, explorar conceitos, testar conhecimentos e consolidar o aprendizado.

A realização do quiz também permitiu verificar a compreensão dos conteúdos estudados, com acerto nas 10 questões propostas.

O resultado final é um material de consulta que pode ser utilizado para revisar os fundamentos de POO e servir como base para estudos posteriores em Java.

---

## 👨‍💻 Autor

**Rodrigo Andrade**

Projeto desenvolvido para fins de estudo e aprendizagem.

---

## 📚 Referências

* Oracle Java Tutorials — Object-Oriented Programming Concepts
* Oracle Java Tutorials — Classes and Objects
* Oracle Java Tutorials — What Is Inheritance?
* Oracle Java Tutorials — What Is an Interface?
