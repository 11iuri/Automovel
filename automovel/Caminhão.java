package pkginterface.automovel;

public class Caminhão extends Classes {

    Caminhão() {

        this.modelo = "C11";
        this.cor = "Azul";
        this.velocidade = 0;
        this.PrecoCombustivel = 6f;
        this.NiveldeCombustivel = 90;
        this.status = false;
        this.CapacidadedoTanque = 90;

    }

    public void abastecer() {
        int qntAbastecida;
        if (this.status == false) {
            qntAbastecida = CapacidadedoTanque - NiveldeCombustivel;
            System.out.println("Coube" + qntAbastecida + "Litros" + "Valor total: " + qntAbastecida * PrecoCombustivel);
        } else {
            System.out.println("Caminhão está ligado");
        }
    }

    public void acelerar() {
        if (this.status == true) {
            this.velocidade = this.velocidade + 10;
            System.out.println("A velocidade é:" + this.velocidade + "km/h");
            this.NiveldeCombustivel = this.NiveldeCombustivel - 9;
            if (this.NiveldeCombustivel <= 0) {
                System.out.println("Caminhão sem combustivel");
            }
        }

    }

}
