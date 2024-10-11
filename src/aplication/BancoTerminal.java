package aplication;

import entities.ContaBanco;
import java.util.Locale;
import java.util.Scanner;

public class BancoTerminal {

    public static void main(String[] args) {

        //TODO: Conhecer e importar a classe Scanner

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Aqui foi utilizado conseitos basicos de POO para essa desafio mesmo 
        //que não tenha sido proposta inicial para esse desafio em questão
        ContaBanco primeiraConta = new ContaBanco();
        //bem antes de iniciar o menu, foi criado um objeto que quardara as informações 
        //que será pedido para o usuario digitar.
        System.out.println("Bem-vindo ao banco Kanki");
        System.out.println("Por favor, digite o número da Agência!");
        primeiraConta.setAgencia(sc.nextLine());
        System.out.println("OK, Agora digite o nome do titular: ");
        primeiraConta.setNome(sc.nextLine());
        System.out.println("Ok, Agora digite o número da conta: ");
        primeiraConta.setNumero(sc.nextInt());
        System.out.println("OK, Agora digite o valor a ser depositado: ");
        primeiraConta.setSaldo(sc.nextDouble());
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n", primeiraConta.getNome(), primeiraConta.getAgencia(), primeiraConta.getNumero(), primeiraConta.getSaldo());

        //Bom mesmo que nesse desafio não tenha pedido eu fiz um metodo que executa um saque que sera mostra a seguir

        /* 
        aqui está o como executar o saque
        primeiraConta.saque(200);
        System.out.println(primeiraConta.getSaldo());
        */

        //Esse pequeno trecho de código a cima  que está comentado executa um saque, esse metodo de saque foi feito para 
        //que o valor a ser sacado respeite o valor da conta do usuário se por acaso o saque feito for maior que o valor que tem na conta aparecera a mensagem saldo insuficiente
        
        //Bem pode não ser necessário mas irei demonstrar um exemplo de como faria esse desafio sem utilizar os conceitos de POO.

        /* 
        int numero;
        String agencia;
        String titular;
        double saldo;

        aqui entraria o metodo Scanner mas como já foi feita na parte principal seria redundante colocá-lo aqui. 

        System.out.println("Bem-vindo ao banco Kanki");
        System.out.println("Por favor, digite o número da Agência!");
        agencia = sc.nextLine();
        System.out.println("OK, Agora digite o nome do titular: ");
        titular = sc.nextLine();
        System.out.println("Ok, Agora digite o número da conta: ");
        numero = sc.nextInt();
        System.out.println("OK, Agora digite o valor a ser depositado: ");
        saldo = sc.nextDouble();

        System.out.println("olá " + titular + "Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque" );
    */
//
    //Bom fazendo esse desafio eu tive algumas ideias de como eu poderia deixar melhor esse pequeno sistema por exemplo poderia criar um switch case onde seria possível selecionar algumas opções 
    //como a criação de uma conta bancaria, consultar o saldo de uma conta que já existe, realizar saque e deposito e quando não tivesse feito as ações desejadas exibir um mensagem finalização do sistema.
    }
}
