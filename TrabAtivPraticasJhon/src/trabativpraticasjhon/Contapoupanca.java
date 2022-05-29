
package trabativpraticasjhon;

public class Contapoupanca extends Conta {
    public Contapoupanca (String titular, int numero_da_conta, int  agencia){
        super(titular, numero_da_conta, agencia);
    }
    
    public void depositar_na_conta (double valor){
        super.setsaldo(super.getsaldo() + valor);
        System.out.println("Depósito realizado com sucesso!");
        }
    
    public void sacar_da_conta (double valor){
        if ( super.getsaldo() >= valor ){
            super.setsaldo(super.getsaldo() - valor);
            System.out.println("Saque efetuado com sucesso!");
        }
        else {
            System.out.println("Saque negado, saldo insuficiente!");
        }
    }
    
    public void dados_da_conta(){
        System.out.printf("\n Titular da conta: %s \n Agência: %d \n Número da conta: %d \n Saldo: %.2f \n", this.gettitular(), this.getagencia(), this.getnumero_da_conta(), this.getsaldo());
    }
    
}
