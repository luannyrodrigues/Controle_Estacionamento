package controleEstacionamento;

public class VeiOficial {
    private String renavan;
    private String chassi;

    public VeiOficial() {
    }

    public VeiOficial(String renavan, String chassi) {
        this.renavan = renavan;
        this.chassi = chassi;
    }

    public String getRenavan() {
        return renavan;
    }

    public String getChassi() {
        return chassi;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
}
