package Casa;
// Classe Programa
public class Programa {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "João";
        pessoa.idade = 20;
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.imprimirNomeIdade();


        Porta porta = new Porta();
        porta.cor = "azul";
        porta.abre();
        System.out.println("A porta está aberta? " + porta.estaAberta());
        porta.fecha();
        System.out.println("A porta está aberta? " + porta.estaAberta());
        porta.pinta("vermelha");
        System.out.println("A cor da porta é " + porta.cor);


        Casa casa = new Casa();
        casa.cor = "branca";
        casa.porta1 = new Porta();
        casa.porta2 = new Porta();
        casa.porta3 = new Porta();
        casa.porta1.abre();
        casa.porta3.abre();
        System.out.println("Quantidade de portas abertas: " + casa.quantasPortasEstaoAbertas());



      

    }
}