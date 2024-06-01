package diotwo.desafio1;

import diotwo.desafio1.Transacao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DioChallenge2 {
    public class DioChallenge {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double saldo = scanner.nextDouble();
            int quantidadeTransacoes = scanner.nextInt();

            List<Transacao> transacoes = new ArrayList<>();

            for (int i = 1; i <= quantidadeTransacoes; i++) {

                char tipoTransacao = scanner.next().toUpperCase().charAt(0);
                double valorTransacao = scanner.nextDouble();

                // TODO: Criar uma nova transação e adicioná-la à lista de transações
                Transacao transacao = null;

                // Verifica e atualiza o saldo da conta com base no tipo de transação
                if (transacao.getTipo() == 'D') {
                    saldo += valorTransacao;
                } else if (transacao.getTipo() == 'S') {
                    saldo -= valorTransacao;
                }
            }

            System.out.println("\nSaldo : " + saldo);
            System.out.println("\nTransacoes:");
            transacoes.stream()
                    .map(transacao -> "TODO: Formatar a Saída (tipo e valor) de acordo com os Exemplos.")
                    .collect(Collectors.toList())
                    .forEach(System.out::println);

            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }
}
