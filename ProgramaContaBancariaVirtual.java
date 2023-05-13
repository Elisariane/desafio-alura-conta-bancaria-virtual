import java.util.Scanner;

public class ProgramaContaBancariaVirtual {
    public static void main(String[] args) {
        String nome = "John Doe";
        String tipoConta =  "Conta Corrente";
        double  saldo = 1500;

        System.out.println("***********************\n");
        System.out.println("Dados iniciais do cliente");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.printf("Saldo inicial: %.2f%n \n", saldo);
        System.out.println("***********************\n");

        int opcaoMenu = 0;
        Scanner input = new Scanner(System.in);

        while (opcaoMenu != 4) {
            System.out.println("Operações");
            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");

            System.out.println("\nDigite a opção desejada:");
            opcaoMenu = input.nextInt();

            if (opcaoMenu == 1) {
                System.out.printf("Seu saldo atual é: %.2f%n \n", saldo);
            } else if (opcaoMenu == 2) {
                System.out.println("Informe o valor a ser recebido: ");
                saldo += input.nextDouble();
            }
        }
    }
}
