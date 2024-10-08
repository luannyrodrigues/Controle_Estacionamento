package controleEstacionamento;

import java.util.Date;

public class EntradaSaida {
    private int id;
    private Date data;
    private char tipo;
    private Veiculo veiculo;
    private Pessoa pessoa;

    // Construtor
    public EntradaSaida(int id, Date data, char tipo, Veiculo veiculo, Pessoa pessoa) {
        this.id = id;
        this.data = data;
        this.tipo = tipo;
        this.veiculo = veiculo;
        this.pessoa = pessoa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
