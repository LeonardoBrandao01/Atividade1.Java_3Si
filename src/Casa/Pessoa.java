package Casa;


class Pessoa {
    String nome;
    int idade;

    void fazAniversario() {
        idade++;
    }

    void imprimirNomeIdade() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}