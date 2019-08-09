package pkginterface.automovel;

public class Moto extends Classes {

    Moto() {

        this.modelo = "j1";
        this.cor = "Preto";
        this.velocidade = 0;
        this.PrecoCombustivel = 3f;
        this.NiveldeCombustivel = 20;
        this.status = false;
        this.CapacidadedoTanque = 20;

    }

    public void abastecer() {
        int qntAbastecida;
        if (this.status == false) {
            qntAbastecida = CapacidadedoTanque - NiveldeCombustivel;
            System.out.println("Coube" + qntAbastecida + "Litros" + "Valor total: " + qntAbastecida * PrecoCombustivel);
        } else {
            System.out.println("Moto está ligado");
        }
    }

    public void acelerar() {
        if (this.status == true) {
            this.velocidade = this.velocidade + 10;
            System.out.println("A velocidade é:" + this.velocidade + "km/h");
            this.NiveldeCombustivel = this.NiveldeCombustivel - 2;
            if (this.NiveldeCombustivel <= 0) {
                System.out.println("Moto sem combustivel");
            }
        }

    }

}
