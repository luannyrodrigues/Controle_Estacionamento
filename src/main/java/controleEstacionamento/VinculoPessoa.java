package controleEstacionamento;

public enum VinculoPessoa {
    SERVIDOR(1),
    ALUNO(2),
    TERCEIRIZADO(3),
    VISITANTE(4);

    private int valor;

    VinculoPessoa(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
