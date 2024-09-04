import java.util.Scanner;

public class FibonacciChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        // Variáveis para armazenar os números da sequência de Fibonacci
        int num1 = 0;
        int num2 = 1;

        // Variável auxiliar para calcular o próximo número na sequência
        int fibonacci = num1 + num2;

        // Se o número informado é 0 ou 1, já pertence à sequência de Fibonacci
        if (numero == 0 || numero == 1) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            return;
        }

        // Calcula a sequência de Fibonacci até encontrar o número ou ultrapassá-lo
        while (fibonacci < numero) {
            num1 = num2;
            num2 = fibonacci;
            fibonacci = num1 + num2;
        }

        // Verifica se o número pertence à sequência de Fibonacci
        if (fibonacci == numero) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
