import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta !");
        int numero_da_conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String numero_da_agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome !");
        scanner.nextLine();
        String nome_do_cliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta !");
        double saldo_da_conta = scanner.nextDouble();

        System.out.println("Olá " + nome_do_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numero_da_agencia + ", conta " + numero_da_conta + " e seu saldo " + saldo_da_conta + " já está disponível para saque");
    }
}
