import java.util.Locale;
import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            int numeroUm;
            int numeroDois;
            int produto;

            numeroUm = scanner.nextInt();
            numeroDois = scanner.nextInt();
            produto = numeroUm * numeroDois;

            System.out.println("Prod = " + produto);
        }

    }
    
}
