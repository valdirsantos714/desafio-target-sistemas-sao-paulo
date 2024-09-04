# Inversão de String

Este programa em Java inverte os caracteres de uma string. O objetivo é demonstrar como reverter uma string manualmente sem usar funções prontas, como `reverse`.

## Descrição

O programa inverte os caracteres de uma string fornecida. A string pode ser informada pelo usuário durante a execução ou previamente definida no código.

## Como Usar

1. **Compile o Programa:**
   ```sh
   javac InverteString.java
   ```

2. **Execute o Programa:**
   ```sh
   java InverteString
   ```

3. **Digite uma string quando solicitado, ou modifique a string diretamente no código-fonte.**

## Código

```java
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
```

## Explicação

- **Entrada:**
    - O usuário é solicitado a digitar uma string que deseja inverter.
    - Alternativamente, você pode definir a string diretamente no código-fonte.

- **Processo de Inversão:**
    - A função `inverterString` converte a string em um array de caracteres.
    - Utiliza dois ponteiros, um no início e outro no final do array, para trocar os caracteres até que os ponteiros se encontrem no meio.

- **Resultado:**
    - O programa imprime a string invertida no console.

### Observações

- O programa não utiliza funções prontas para inversão de strings, demonstrando um método manual para realizar a tarefa.
- A entrada e a saída são realizadas através do console, facilitando a interação com o usuário.
