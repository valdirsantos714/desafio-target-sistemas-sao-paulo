# Cálculo da Soma dos Primeiros Números Naturais

Este programa em Java calcula a soma dos primeiros `n` números naturais, onde `n` é definido como 13, conforme o código fornecido.

## Descrição

O código segue o algoritmo a seguir para calcular a soma dos números de 1 a 13:

1. Inicializa as variáveis `INDICE`, `SOMA`, e `K`.
2. Usa um loop `while` para incrementar o valor de `K` e adicioná-lo à variável `SOMA` enquanto `K` é menor que `INDICE`.
3. Após o término do loop, o programa imprime o valor final de `SOMA`.

## Como Usar

1. **Compile o Programa:**
   ```sh
   javac Soma.java
   ```

2. **Execute o Programa:**
   ```sh
   java Soma
   ```

3. **O valor da variável `SOMA` será exibido no console.**

## Código

```java
public class Soma {

    public static void main(String[] args) {
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("O valor da variável SOMA é: " + SOMA);
    }
}
```

## Explicação

- **Variáveis:**
    - `INDICE` é definido como 13.
    - `SOMA` e `K` são inicializados como 0.

- **Loop `while`:**
    - O loop continua enquanto `K` for menor que `INDICE`. A cada iteração, `K` é incrementado e adicionado a `SOMA`.

- **Resultado:**
    - Após a conclusão do loop, o programa imprime o valor final de `SOMA`, que é a soma dos números de 1 a 13.

### Resultado

Com o valor de `INDICE` definido como 13, a soma dos primeiros 13 números naturais é 91. Portanto, o valor da variável `SOMA` será `91` ao final do processamento.
