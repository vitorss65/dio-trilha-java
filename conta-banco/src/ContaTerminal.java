import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);  

        System.out.println("Por favor, informe o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o numero da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, informe o saldo da Conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá  " + nomeCliente + ", obrigado por criar uma conta  em nosso banco, sua agencia é: "
        + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponivel para saque.");
        
        scanner.close();
    }
}
