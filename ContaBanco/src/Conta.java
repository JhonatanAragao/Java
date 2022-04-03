import javax.swing.JOptionPane;

/** Esse exemplo se encontra no slide 5 programação orientada à objetos;
 * número da conta;
 *  titular;
 * saldo;
 * agencia;
 * dataDeAbertura;
 * void sacar, depositar e calcular rendimento ;
**/

public class Conta {
    int numConta;
    String titular;
    double saldo;
    String agencia;
    String dataDeAbertura;

    //sacando
    //void sacar(double valor_que_deseja_sacar){ //void não retorna nenhum valor //método para sacar dinheiro da conta do cliente;
    //    saldo = saldo - valor_que_deseja_sacar;
    //}
    void sacar(double valor_que_deseja_sacar){
        if (this.saldo < valor_que_deseja_sacar){
            System.out.println("saldo indisponivel para o saque");;
        }
        else {
            this.saldo = this.saldo - valor_que_deseja_sacar;
            System.out.println("Saque bem-sucedido!");
        }
    }

    void depositar(double valor_que_deseja_depositar){ //método para depositar dinheiro na conta do cliente;
        this.saldo = saldo + valor_que_deseja_depositar;
    }

  

}
