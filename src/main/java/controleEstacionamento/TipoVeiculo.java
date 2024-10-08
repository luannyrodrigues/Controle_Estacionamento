package controleEstacionamento;

public enum TipoVeiculo {
    CARRO(1),
    MOTOCICLETA(2);

    private int valor;

    TipoVeiculo(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
