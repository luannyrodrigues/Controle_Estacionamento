package controleEstacionamento;

public class ESoficial extends Pessoa {
    private int kmRegistrado;

    public ESoficial(int id, String nome, String fone, String email, int kmRegistrado) {
        super(id, nome, fone, email);
        this.kmRegistrado = kmRegistrado;
    }

    // Getters e Setters
    public int getKmRegistrado() {
        return kmRegistrado;
    }

    public void setKmRegistrado(int kmRegistrado) {
        this.kmRegistrado = kmRegistrado;
    }
}
