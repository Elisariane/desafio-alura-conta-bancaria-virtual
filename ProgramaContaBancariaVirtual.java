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

    }
}
