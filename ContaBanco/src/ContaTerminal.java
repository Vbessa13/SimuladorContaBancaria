import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        scanner.nextLine(); // limpar buffer do teclado

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Formatador no padrão brasileiro (vírgula e ponto)
        Locale localeBR = Locale.forLanguageTag("pt-BR");
        NumberFormat nf = NumberFormat.getNumberInstance(localeBR);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        
        String saldoFormatado = nf.format(saldo);

        String mensagem = "Olá " + nomeCliente 
                        + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                        + agencia + ", conta " + numero 
                        + " e seu saldo " + saldoFormatado + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();
    }
}
