import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome! ");
        String name = scanner.nextLine();

        System.out.printf("Bem vindo(a) %s! Agora digite o número da sua Agência:", name);
        String agency = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta! ");
        int accountNumber = scanner.nextInt();

        System.out.println("Qual o seu saldo?");
        double balance = scanner.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %s já está disponível para saque.",
                name, agency, accountNumber, balance);

        scanner.close();
    }
}
