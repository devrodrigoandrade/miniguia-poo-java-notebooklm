```java
class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}

class Aluno extends Pessoa {

    public Aluno(String nome) {
        super(nome);
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, sou um aluno.");
    }
}

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Rodrigo");
        pessoa.apresentar();

        Pessoa aluno = new Aluno("Rodrigo");
        aluno.apresentar();
    }
}
```
