package Desafio;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "Italo Ribeiro";
        String tipoConta = "Corrente";
        double saldo = 1521.00;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("***********************");

        System.out.println("Operações");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair

                """;
        
        
        while (opcao !=4) {
            System.out.println(menu);
            System.out.println("digite a opção desejada");
            opcao = scanner.nextInt();

            if(opcao == 1){
                System.out.println("Seu saldo é: R$ " + saldo);
                break;
            }else if (opcao == 2){
                System.out.println("Qual o valor da transferencia:");
                double valorTransferencia = scanner.nextDouble();
                if(valorTransferencia < saldo){
                    Double novoSaldo = saldo -valorTransferencia;
                    System.out.println("Tranferencia realizada com sucesso! seu saldo atua é de: " + novoSaldo);
                    break;
                }else{
                    System.out.println("Transferencia negada saldo insuficiente!");
                    break;
                }
            }
           else if(opcao == 3){
                System.out.println("Qual o valor à receber?");
                double valorRecebido = scanner.nextDouble();
                Double novoSaldo = saldo + valorRecebido;
                System.out.println("Recebimento realizado com sucesso! Seu novo saldo é de: " + novoSaldo);
                break;
            }else if (opcao != 4){ {
                System.out.println("Opção inválida!");
            }
        } 
          

    }
}
}