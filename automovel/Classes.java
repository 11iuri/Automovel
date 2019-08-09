package pkginterface.automovel;

public abstract class Classes implements Automoveis {

    protected float PrecoCombustivel;
    protected int NiveldeCombustivel;
    protected String cor;
    protected String modelo;
    protected int velocidade;
    protected boolean status;
    protected int CapacidadedoTanque;

    public void ligar() {
        if (this.status == true) {
            System.out.println("Veiculo já está Ligado");
        } else {
            this.status = true;
            System.out.println("Veiculo ligado");
        }
    }

    public void desligar() {
        if (this.status == false) {
            System.out.println("Veiculo já está desligado");
        } else {
            this.status = false;
            System.out.println("Veiculo desligado");
        }
    }

    public void trocarPneu() {
        if (this.status == false) {
            System.out.println("Pneu trocado");
        } else {
            System.out.println("Carro está ligado");
        }
    }

    public float getPrecoCombustivel() {
        return PrecoCombustivel;
    }

    public void setPrecoCombustivel(float PrecoCombustivel) {
        this.PrecoCombustivel = PrecoCombustivel;
    }

    public int getNiveldeCombustivel() {
        return NiveldeCombustivel;
    }

    public void setNiveldeCombustivel(int NiveldeCombustivel) {
        this.NiveldeCombustivel = NiveldeCombustivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
