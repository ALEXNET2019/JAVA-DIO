import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o seu nome ? ");
        String nomeCliente = ler.nextLine();

        System.out.println("Insira o número da sua agência: ");
        String agencia = ler.next();

        System.out.println("Informe o número da conta: ");
        int numero = ler.nextInt();

        System.out.println("Qual seu saldo ? ");
        Double saldo = ler.nextDouble();

        ler.close();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque",
                nomeCliente, agencia, numero, saldo);
    }
}
