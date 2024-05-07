
import java.util.Locale;
import java.util.Scanner;

public class  ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela classe Scanner os valores digitados no terminal
        //Exibir a mensagem da conta criada.

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String numeroConta;
        String numeroAgencia;
        String nomeCompleto;
        
        double saldoConta;

        saldoConta = 237.48;

        System.out.println("Por favor digite o número da agência! ");
        numeroAgencia = scanner.next();

        System.out.println("Por favor digite o número da sua conta!");
        numeroConta = scanner.next();

        System.out.println("Agora, por favor, insira seu nome completo!");
        nomeCompleto = scanner.next();

        System.out.println("Olá, " + nomeCompleto + "! Obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de " + saldoConta + " já está disponível para saque!" );
    }
}