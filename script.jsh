// script.jsh
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

System.out.print("Digite seu nome: ");
String nome = scanner.nextLine();

System.out.print("Digite sua idade: ");
int idade = scanner.nextInt();

System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");

scanner.close();
