package trabativpraticasjhon;

import trabativpraticasjhon.Conta;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    List<Conta> contaslistas = new ArrayList<Conta>();
    
    //métodos
    
    public void armazenaConta(Conta nome){
        this.contaslistas.add(nome);
    }
    
    public void removeConta(String nome){
        for (int i = 0; i < this.contaslistas.size(); i++){
            if (this.contaslistas.get(i).gettitular().equals(nome)){
                this.contaslistas.remove(i);
            }
        }
    }
    
    public void imprimeContas(){
        for (int i = 0; i < this.contaslistas.size(); i++){
            this.contaslistas.get(i).dados_da_conta();
        }
    }
    
    public void imprimeConta(String nome){
        int conta_posicao = 0;
        for (int i = 0; i < this.contaslistas.size(); i++){
            if(this.contaslistas.get(i).gettitular().equals(nome)){
                conta_posicao = 1;
                this.contaslistas.get(i).dados_da_conta();
            }
        }
    } 
        
}
    
    
    
    
    

