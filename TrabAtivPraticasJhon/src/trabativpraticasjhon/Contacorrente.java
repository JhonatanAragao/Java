
package trabativpraticasjhon;

public class Contacorrente extends Conta implements Tributavel {
    
    public Contacorrente(String titular, int numero_da_conta, int  agencia){
        super(titular, numero_da_conta, agencia);
    }
    //teste
    public Contacorrente(){};
    //fim
    
    public double getImposto() {
        return super.getsaldo()* 0.01;
    }
    
    public void depositar (double valor){
        if((super.getsaldo() - getImposto() + valor) < 0){
            System.out.println("O depósito não pode ser efetuado!");
        }
        else {
            super.setsaldo(valor - getImposto());
            System.out.println("Depósito realizado com sucesso!");
        }
    }
    
    public void sacar_da_conta (double valor){
        if ( super.getsaldo() >= (valor + getImposto())){
            super.setsaldo((super.getsaldo() - valor - getImposto()));
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
