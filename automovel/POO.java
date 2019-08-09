package pkginterface.automovel;

import java.util.Scanner;

public class POO {

    public static void main(String[] args) {

        Carro Car = null;
        Caminhão cam = null;
        Moto M = null;
        int opcao, funcao;

        do {

            System.out.println("Esolha um veiculo: ");
            System.out.println("0- Cancelar  1- Carro 2- Moto 3- Caminhão");
            Scanner ler = new Scanner(System.in);
            opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                    Car = new Carro();
                    do {
                        System.out.println("Escolha uma função: 1- Ligar 2- Desligar 3- Acelerar 4- Abastecer 5- Trocar Pneu 6-Sair");
                        Scanner ler1 = new Scanner(System.in);
                        funcao = ler1.nextInt();
                        switch (funcao) {
                            case 1:
                                Car.ligar();
                                break;
                            case 2:
                                Car.desligar();
                                break;
                            case 3:
                                Car.acelerar();
                                break;
                            case 4:
                                Car.abastecer();
                                break;
                            case 5:
                                Car.trocarPneu();
                                break;
                        }
                    } while (funcao != 6);
                    break;
                case 2:
                    M = new Moto();
                    do {
                        System.out.println("Escolha uma função: 1- Ligar 2- Desligar 3- Acelerar 4- Abastecer 5- Trocar Pneu 6-Sair");
                        Scanner ler1 = new Scanner(System.in);
                        funcao = ler1.nextInt();
                        switch (funcao) {
                            case 1:
                                Car.ligar();
                                break;
                            case 2:
                                Car.desligar();
                                break;
                            case 3:
                                Car.acelerar();
                                break;
                            case 4:
                                Car.abastecer();
                                break;
                            case 5:
                                Car.trocarPneu();
                                break;
                        }
                    } while (funcao != 6);//moto
                    break;
                case 3:
                    cam = new Caminhão();
                    do {
                        System.out.println("Escolha uma função: 1- Ligar 2- Desligar 3- Acelerar 4- Abastecer 5- Trocar Pneu 6-Sair");
                        Scanner ler1 = new Scanner(System.in);
                        funcao = ler1.nextInt();
                        switch (funcao) {
                            case 1:
                                Car.ligar();
                                break;
                            case 2:
                                Car.desligar();
                                break;
                            case 3:
                                Car.acelerar();
                                break;
                            case 4:
                                Car.abastecer();
                                break;
                            case 5:
                                Car.trocarPneu();
                                break;
                        }
                    } while (funcao != 6);//caminhão
                    break;
            }

        } while (opcao != 0);
    }
}
