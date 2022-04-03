import javax.swing.JOptionPane;

public class meuProjeto {
    public static void main(String[] args) throws Exception {
         Conta conta_do_Geraldo = new Conta(); //conta do Geraldo é um exemplo que podemos definir o nome da nossa classe;

         conta_do_Geraldo.numConta = 23265653;
         conta_do_Geraldo.titular = "Geraldo de Sousa";
         conta_do_Geraldo.saldo = 3000;

         //sacando
         conta_do_Geraldo.sacar(500);

         //depositando
         conta_do_Geraldo.depositar(100);
        
         System.out.print(conta_do_Geraldo.saldo);;
        
    }
}



