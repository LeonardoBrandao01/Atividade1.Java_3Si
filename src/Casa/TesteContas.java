package Casa;

public class TesteContas {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Maria", "123.456.789-00");
        Cliente cliente2 = new Cliente("Antonia", "987.654.321-00");

        Produto produto1 = new Produto("TV Led", 100);
        Produto produto2 = new Produto("Notebook", 200);

        Conta conta1 = new Conta(1, "01/03/2023", "05/01/2023", produto1, cliente1);
        Conta conta2 = new Conta(2, "02/04/2023", "06/01/2023", produto2, cliente2);

        conta1.visualizarConta();
        conta2.visualizarConta();



    }
}




