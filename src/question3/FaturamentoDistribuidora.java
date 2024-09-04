package question3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FaturamentoDistribuidora {

    static class DiaFaturamento {
        int dia;
        double valor;

        DiaFaturamento(int dia, double valor) {
            this.dia = dia;
            this.valor = valor;
        }
    }

    public static void main(String[] args) {
        String filePath = "src/question3/faturamento.json";
        List<DiaFaturamento> faturamentos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.startsWith("{") && line.endsWith("},")) {
                    line = line.substring(1, line.length() - 2).trim();
                    String[] parts = line.split(",");
                    int dia = Integer.parseInt(parts[0].split(":")[1].trim());
                    double valor = Double.parseDouble(parts[1].split(":")[1].trim());
                    faturamentos.add(new DiaFaturamento(dia, valor));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Inicializa as variáveis para calcular os valores requeridos
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;

        // Processa os dados
        for (DiaFaturamento dia : faturamentos) {
            if (dia.valor > 0) {
                if (dia.valor < menorFaturamento) {
                    menorFaturamento = dia.valor;
                }
                if (dia.valor > maiorFaturamento) {
                    maiorFaturamento = dia.valor;
                }
                somaFaturamento += dia.valor;
                diasComFaturamento++;
            }
        }

        // Calcula a média mensal
        double mediaMensal = somaFaturamento / diasComFaturamento;

        // Conta os dias com faturamento acima da média
        int diasAcimaDaMedia = 0;
        for (DiaFaturamento dia : faturamentos) {
            if (dia.valor > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        // Exibe os resultados
        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaDaMedia);
    }
}
