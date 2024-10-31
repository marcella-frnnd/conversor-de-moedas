import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("************************************ \n" +
                "Seja bem-vindo ao Conversor de Moedas!" +
                        "\n\n" +
                        "Escolha uma opção para realizar a conversão: \n" +
                        "1. Dólar >> Real \n" +
                        "2. Real >> Dólar \n" +
                        "3. Dólar >> Euro \n" +
                        "4. Euro >> Dólar \n" +
                        "5. Real >> Euro \n" +
                        "6. Euro >> Real \n" +
                        "7. Sair \n" +
                        "\n************************************\n");

        Scanner leitura = new Scanner(System.in);
        Conversor novoConversor = new Conversor();

        int sair = 1;
        while (sair != 0) {
            System.out.println("Escolha uma opção válida: ");
            int opcao = leitura.nextInt();

            if (opcao == 7) {
                sair = 0;
                break;
            } else if (opcao <= 0 || opcao > 7 ) {
                System.out.println("Opção inválida");
                sair = 0;
            } else {
                System.out.println("Digite o valor a ser convertido: ");
                double valor = leitura.nextDouble();

                if (opcao == 1) {
                    MoedasExchangeRate moedasOpcao = novoConversor.conversorMoeda("usd", "brl", valor);
                    Moedas moedasConversao = new Moedas(moedasOpcao);
                    System.out.println(moedasConversao);
                } else if (opcao == 2){
                    MoedasExchangeRate moedasOpcao = novoConversor.conversorMoeda("brl", "usd", valor);
                    Moedas moedasConversao = new Moedas(moedasOpcao);
                    System.out.println(moedasConversao);
                } else if (opcao == 3){
                    MoedasExchangeRate moedasOpcao = novoConversor.conversorMoeda("usd", "eur", valor);
                    Moedas moedasConversao = new Moedas(moedasOpcao);
                    System.out.println(moedasConversao);
                } else if (opcao == 4){
                    MoedasExchangeRate moedasOpcao = novoConversor.conversorMoeda("eur", "usd", valor);
                    Moedas moedasConversao = new Moedas(moedasOpcao);
                    System.out.println(moedasConversao);
                } else if (opcao == 5){
                    MoedasExchangeRate moedasOpcao = novoConversor.conversorMoeda("brl", "eur", valor);
                    Moedas moedasConversao = new Moedas(moedasOpcao);
                    System.out.println(moedasConversao);
                } else if (opcao == 6) {
                    MoedasExchangeRate moedasOpcao = novoConversor.conversorMoeda("eur", "brl", valor);
                    Moedas moedasConversao = new Moedas(moedasOpcao);
                    System.out.println(moedasConversao);
                }
                sair = 0;
            }

            System.out.println("\nDeseja continuar?" +
                    "\nDigite 0 para sair ou 1 para continuar:");
            sair = leitura.nextInt();
        }

        System.out.println("************************************\n" +
                "O programa finalizou corretamente!");






    }
}
