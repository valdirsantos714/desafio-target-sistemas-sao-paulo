# Cálculo do Percentual de Faturamento por Estado

Este programa em Java calcula o percentual de representação que cada estado teve dentro do valor total mensal de faturamento de uma distribuidora.

## Descrição

O programa realiza o cálculo dos percentuais de faturamento para os seguintes estados e categorias:
- SP – R$67.836,43
- RJ – R$36.678,66
- MG – R$29.229,88
- ES – R$27.165,48
- Outros – R$19.849,53

Ele calcula o percentual de representação de cada estado em relação ao valor total de faturamento e exibe os resultados.

## Como Usar

1. **Compile o Programa:**
   ```sh
   javac FaturamentoPorEstado.java
   ```

2. **Execute o Programa:**
   ```sh
   java FaturamentoPorEstado
   ```

3. **Os resultados serão exibidos no console.**

## Código

```java
public class FaturamentoPorEstado {

    public static void main(String[] args) {
        // Valores de faturamento por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        // Calcula o faturamento total
        double faturamentoTotal = sp + rj + mg + es + outros;

        // Calcula o percentual de cada estado
        double percentualSP = (sp / faturamentoTotal) * 100;
        double percentualRJ = (rj / faturamentoTotal) * 100;
        double percentualMG = (mg / faturamentoTotal) * 100;
        double percentualES = (es / faturamentoTotal) * 100;
        double percentualOutros = (outros / faturamentoTotal) * 100;

        // Exibe os resultados
        System.out.println("Percentual de representação por estado:");
        System.out.printf("SP: %.2f%%\n", percentualSP);
        System.out.printf("RJ: %.2f%%\n", percentualRJ);
        System.out.printf("MG: %.2f%%\n", percentualMG);
        System.out.printf("ES: %.2f%%\n", percentualES);
        System.out.printf("Outros: %.2f%%\n", percentualOutros);
    }
}
```

## Explicação

- **Faturamento por Estado:**
    - Os valores de faturamento são fornecidos para cada estado e categoria.

- **Cálculo do Percentual:**
    - O valor total de faturamento é calculado somando o faturamento de todos os estados e categorias.
    - O percentual de faturamento para cada estado é calculado dividindo o faturamento de cada estado pelo valor total e multiplicando por 100.

- **Resultado:**
    - O programa imprime o percentual de faturamento de cada estado em relação ao total.

### Resultado

Os percentuais calculados indicam a participação de cada estado no valor total de faturamento da distribuidora.
