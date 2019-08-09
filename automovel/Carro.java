package pkginterface.automovel;

public class Carro extends Classes {

    Carro() {

        this.modelo = "Z32";
        this.cor = "Azul";
        this.velocidade = 0;
        this.PrecoCombustivel = 4f;
        this.NiveldeCombustivel = 40;
        this.status = false;
        this.CapacidadedoTanque = 40;

    }

    public void abastecer() {
        int qntAbastecida;
        if (this.status == false) {
            qntAbastecida = CapacidadedoTanque - NiveldeCombustivel;
            System.out.println("Coube" + qntAbastecida + "Litros" + "Valor total: " + qntAbastecida * PrecoCombustivel);
        } else {
            System.out.println("Carro está ligado");
        }
    }

    public void acelerar() {
        if (this.status == true) {
            this.velocidade = this.velocidade + 10;
            System.out.println("A velocidade é:" + this.velocidade + "km/h");
            this.NiveldeCombustivel = this.NiveldeCombustivel - 4;
            if (this.NiveldeCombustivel <= 0) {
                System.out.println("Carro sem combustivel");
            }
        }

    }
}
