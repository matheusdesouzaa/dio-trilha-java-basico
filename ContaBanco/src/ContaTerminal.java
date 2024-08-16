import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o numero da conta: ");
        int conta = scanner.nextInt();
        System.out.println("Por favor, digite a agencia ");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o nome do cliente: ");
        String nome = scanner.next();
        System.out.println("Por favor, digite o saldo da conta ");
        double saldo = scanner.nextDouble();
        System.out.println("Olá " + nome + " ,obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " ,conta " +
         conta + " e seu saldo de " + saldo + " já está disponivel para saque");
    }
}
