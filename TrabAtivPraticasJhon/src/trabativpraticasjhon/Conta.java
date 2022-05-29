
package trabativpraticasjhon;

import java.io.PrintStream;

public abstract class Conta {
    private String titular;
    private int numero_da_conta;
    private int agencia;
    private double saldo;
    
    public Conta (){};
    
    public Conta (String titular, int numero_da_conta, int  agencia){
        this.titular = titular;
        this.numero_da_conta = numero_da_conta;
        this.agencia = agencia;
    }
    
    //get's e set's
    //titular
    public void settitular(String titular){
        this.titular = titular;
    }
    public String gettitular(){
        return titular;
    }
    //numero da conta
    public void setnumero_da_conta(int numero){
        this.numero_da_conta = numero;
    }
    public int getnumero_da_conta(){
        return numero_da_conta;
    }
    //saldo
    public void setsaldo(double valor){
        this.saldo = saldo + valor;
    }
    public double getsaldo(){
        return this.saldo;
    }
    public void setagencia(int numero){
        this.agencia = numero;
    }
    public int getagencia(){
        return agencia;
    }
    //métodos de saque, depósito e transferência
    public void sacar (double valor) {
        this.saldo = this.saldo - valor;
    }
    //depositar
    public void depositar (double valor) {
        this.saldo = this.saldo + valor;
    }
    //transfere: destino: conta, valor: double
    public void transferir (Conta destino, double valor) {
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
    }
    public void dados_da_conta(){
        System.out.printf("\n Titular da conta: %s \n Agência: %d \n Número da conta: %d \n Saldo: %.2f \n", this.gettitular(), this.getagencia(), this.getnumero_da_conta(), this.getsaldo());
    }
 }
    
 
