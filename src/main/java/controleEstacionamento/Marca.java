package controleEstacionamento;

public enum Marca {
    CHEVROLET(1),
    FIAT(2),
    HONDA(3),
    RENAULT(4),
    HYUNDAI(5),
    YAMAHA(6),
    FORD(7);

    private int valor;

    Marca(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
