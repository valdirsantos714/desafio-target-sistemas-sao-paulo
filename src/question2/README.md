# Verificação de Número na Sequência de Fibonacci

Este programa em Java calcula a sequência de Fibonacci e verifica se um número informado pertence à sequência.

## Descrição

O programa realiza os seguintes passos:
1. Gera a sequência de Fibonacci até que o valor máximo seja maior ou igual ao número informado.
2. Verifica se o número informado pertence à sequência de Fibonacci.
3. Retorna uma mensagem indicando se o número está ou não na sequência.

## Como Usar

1. **Compile o Programa:**
   ```sh
   javac FibonacciChecker.java
   ```

2. **Execute o Programa:**
   ```sh
   java FibonacciChecker
   ```

3. **Digite um número quando solicitado.** O programa verificará se o número pertence à sequência de Fibonacci e exibirá o resultado no console.

## Código

```java
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
```

## Explicação

- **Entrada:**
    - O programa solicita ao usuário que digite um número para verificar.

- **Geração da Sequência de Fibonacci:**
    - A sequência é gerada iterativamente a partir dos números 0 e 1.
    - O loop continua até que o próximo número da sequência seja maior ou igual ao número informado.

- **Verificação:**
    - O número informado é comparado com os valores gerados na sequência.
    - Se o número estiver na sequência, o programa indica que pertence; caso contrário, indica que não pertence.

### Observações

- O programa considera que a sequência de Fibonacci começa com 0 e 1.
- A verificação é realizada de forma eficiente sem necessidade de gerar a sequência completa para números muito grandes.
