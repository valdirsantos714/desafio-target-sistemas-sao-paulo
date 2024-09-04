package question5;

import java.util.Scanner;

public class InverteString {

    public static void main(String[] args) {
        // Entrada da string pelo usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string para inverter:");
        String input = scanner.nextLine();

        // Converte a string em um array de caracteres
        char[] caracteres = input.toCharArray();

        // Inverte os caracteres da string
        for (int i = 0; i < caracteres.length / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[caracteres.length - 1 - i];
            caracteres[caracteres.length - 1 - i] = temp;
        }

        // Converte o array de caracteres de volta para uma string
        String stringInvertida = new String(caracteres);

        // Exibe a string invertida
        System.out.println("String invertida: " + stringInvertida);
    }
}
