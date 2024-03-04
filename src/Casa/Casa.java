package Casa;

class Casa {
    String cor;
    Porta porta1, porta2, porta3;

    void pinta(String s) {
        cor = s;
    }

    int quantasPortasEstaoAbertas() {
        int contador = 0;
        if (porta1.estaAberta()) contador++;
        if (porta2.estaAberta()) contador++;
        if (porta3.estaAberta()) contador++;
        return contador;
    }
}