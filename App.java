import java.util.Scanner;

import model.Conta;

public class App{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Conta conta;
        int opcao;

        System.out.print("Digite o nome do titular da conta: ");
        String titular = scan.nextLine();

        System.out.print("Digite o número da conta: ");
        int numeroConta = scan.nextInt();
        scan.nextLine();

        System.out.print("\nDigite o valor inicial: ");
        Double saldo = scan.nextDouble();
        scan.nextLine();

        conta = new Conta(titular, numeroConta, saldo);
        
        do{
            System.out.println("*** Banco da Tech4me ***");
            System.out.println("1-Depositar");
            System.out.println("2-Sacar");
            System.out.println("3-Transferir");
            System.out.println("4-Ver Saldo");
            System.out.println("0-Sair");
            System.out.print("Opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

        }while(opcao != 0);

        switch (opcao) {
            case 1:
                
                break;
        
            case 2:

                break;

            default:
                limpa();
                System.out.println("Opção Invalida!");
                System.out.println("Digite enter para voltar ao menu");
                scan.nextLine();
                break;
        }
        
        
    }   public static void limpa(){
            System.out.print("Everything on the console will cleared");
            System.out.print("\033[H\033[2J");
            System.out.flush();
    }

}