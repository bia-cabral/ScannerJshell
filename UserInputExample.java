import java.util.NoSuchElementException;
import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
        } catch (NoSuchElementException e) {
            System.err.println("Erro: Não foi possível ler a entrada. Verifique se há dados disponíveis.");
        } finally {
            scanner.close(); // Fechar o Scanner ao finalizar
        }
    }
}
