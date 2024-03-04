package Casa;

public class TesteCasa {

    public static void main(String[] args) {
        Produto produto1 = new Produto("geladeira", 1000);
        Produto produto2 = new Produto("microondas", 500);
        Produto produto3 = new Produto("fogão", 800);

        Cliente cliente1 = new Cliente("Maria", "12345678901");
        Cliente cliente2 = new Cliente("João", "23456789012");
        Cliente cliente3 = new Cliente("Ana", "34567890123");

        Conta conta1 = new Conta(1, "2024-08-08", "2023-02-15", produto1, cliente1);
        Conta conta2 = new Conta(2, "2023-06-06", "2023-03-15", produto2, cliente2);
                }
}
