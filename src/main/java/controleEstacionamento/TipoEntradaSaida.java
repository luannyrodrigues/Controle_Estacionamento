package controleEstacionamento;

public enum TipoEntradaSaida {
    ENTRADA('E'),
    SAIDA('S');

    private char tipo;

    TipoEntradaSaida(char tipo) {
        this.tipo = tipo;
    }

    public char getTipo() {
        return tipo;
    }
}
