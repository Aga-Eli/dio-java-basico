import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar Saldo");
        System.out.println("0. Encerrar");

        while (continuar) {
            
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    int deposito = scanner.nextInt();
                    saldo = depositar(saldo, deposito);
                    break;
                case 2:
                    int saque = scanner.nextInt();
                    saldo = sacar(saldo, saque);
                    break;
                case 3:
                    consultarSaldo(saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    static Double depositar(Double saldo, int deposito){

        saldo += deposito;

        System.out.println("Saldo atual: " + saldo);

        return saldo;
    }

    static Double sacar(Double saldo, int saque){

        if (saque > saldo){
            System.out.println("Saldo insuficiente.");
        }
        else{
        saldo -= saque;
 
        System.out.println("Saldo atual: " + saldo);
        }

        return saldo;
        
    }

    static void consultarSaldo(Double saldo){
        System.out.println("Saldo atual: " + saldo);
    }
}
