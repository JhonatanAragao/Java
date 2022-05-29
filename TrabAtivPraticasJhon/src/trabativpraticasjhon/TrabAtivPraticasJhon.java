
package trabativpraticasjhon;

import java.util.Scanner;

public class TrabAtivPraticasJhon {
    public static class menu {
        public static void menu(){
            System.out.println("\nEscolha uma opção:\n1 - Cadastrar conta.\n2 - Remover conta.\n3 - Encontrar conta com o nome do titular.\n4 - Imprimir a lista de todas as contas cadastradas.\n");
        }
}
    
    
    public static void main(String[] args) {
        
        Scanner user_choice = new Scanner (System.in);
        Scanner titular_name = new Scanner (System.in);
        Scanner account_data = new Scanner (System.in);
        Scanner saldo_user = new Scanner (System.in);
        Scanner numero  = new Scanner (System.in);
        Banco banco = new Banco();
        
        //fazendo o teste dos métodos de depósito e transferência
        Conta conta1 = new Conta() {};
        //conta1.settitular(Jhon);
        conta1.setagencia(4545);
        conta1.setnumero_da_conta(33333);
        conta1.depositar(500);
        banco.armazenaConta(conta1);
        Conta conta2 = new Conta(){};
        
        conta2.setnumero_da_conta(5555);
        conta2.setagencia(4582);
        conta2.setsaldo(45);
        banco.armazenaConta(conta2);
        System.out.printf("Saldo da conta do %s é igual a %f \n", conta1.gettitular(), conta1.getsaldo());
        System.out.printf("Saldo da conta do %s é igual a %f \n", conta2.gettitular(), conta2.getsaldo());
        System.out.println("tranferindo... \n");
        conta1.transferir(conta2, 100);
        System.out.println("após tranferência... \n ");
        System.out.printf("Saldo da conta do %s é igual a %f \n", conta1.gettitular(), conta1.getsaldo());
        System.out.printf("Saldo da conta do %s é igual a %f \n", conta2.gettitular(), conta2.getsaldo());
        
        Conta conta3 = new Contacorrente(){};
        conta3.settitular(titular_name.next());
        conta3.setsaldo(40);
        System.out.println(conta3.getsaldo());
        conta3.depositar(20);
        System.out.println(conta3.getsaldo());
        //fim do teste
        
        while (true){
           menu.menu();
           int do_choice = user_choice.nextInt();
           
           switch (do_choice){
               case 1:
                   System.out.println("Qual tipo de conta deseja cadastrar?\n 1 - Conta Corrente \n 2 - Conta poupança");
                   int cc_cp = user_choice.nextInt();
                   switch(cc_cp){
                       case 1:
                           System.out.println("Digite o nome do titular:");
                           String titular = titular_name.next();
                           System.out.println("Digite o numero da conta:");
                           int numero_da_conta = numero.nextInt();
                           System.out.println("Digite o numero da agência:");
                           int agencia = user_choice.nextInt();
                           Contacorrente conta_c = new Contacorrente(titular, numero_da_conta, agencia);
                           banco.armazenaConta(conta_c);
                           System.out.printf("Conta do titular %s foi cadastrada com sucesso!", titular);
                           break;

                       case 2: 
                           System.out.println("Digite o nome do titular:");
                           String titular2 = titular_name.next();
                           System.out.println("Digite o numero da conta:");
                           int numero2 = numero.nextInt();
                           System.out.println("Digite o numero da agência:");
                           int agencia2 = user_choice.nextInt();
                           Contapoupanca conta_p = new Contapoupanca(titular2, numero2, agencia2);
                           banco.armazenaConta(conta_p);
                           System.out.printf("Conta do titular %s foi cadastrada com sucesso!", titular2);
                           break;
                   } break;
               case 2:
                   System.out.println("Digite o nome do titular da conta que deseja remover:");
                   String nome_titular = titular_name.next();
                   banco.removeConta(nome_titular);
                   System.out.printf("Conta do titular %s foi removida com sucesso!", nome_titular);
                   break;
               case 3:
                   System.out.println("Digite o titular da conta você deseja acessar os dados:");
                   banco.imprimeConta(titular_name.next());
                   break;
               case 4:
                   System.out.println("Lista de todas as contas cadastradas:");
                   banco.imprimeContas();
                   break;
           }
        }
    }
}
