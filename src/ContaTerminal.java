import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta conta = new Conta();

        System.out.println("Digite seu nome: ");
        conta.titular = sc.nextLine();


        System.out.println("Digite seu saldo: ");
        conta.saldo = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite sua agencia: ");
        conta.agencia = sc.nextLine();

        System.out.println("Digite seu numero: ");
        conta.numero = sc.nextInt();


        System.out.println("Seja bem vindo(a) " + conta.titular +
                ", o número da sua agência é: " + conta.agencia + " e seu saldo é de " + conta.saldo);

    }
}
