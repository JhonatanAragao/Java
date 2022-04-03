import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jhona
 */


public class Contacts {
    public static class menu {
        public static void menu(){
            System.out.println("\nEscolha uma opção:\n1 - Adicionar novo contato.\n2 - Lista de contatos.\n3 - Remover contatos.\n4 - Sair.\n");
        }
    }
    
    public static void main(String[] args) {
        ArrayList<String> contact_list = new ArrayList<>();
        boolean counter = true; //variavél manter ou não o loop do menu.
        Scanner user_choice = new Scanner(System.in);
        Scanner contact_position = new Scanner(System.in);
        Scanner contact_name = new Scanner(System.in);
        
        while(counter){
            menu.menu();
            int do_choice = user_choice.nextInt();
            
            switch(do_choice){
                case 1:
                    System.out.println("Digite o nome do contato que você deseja adicionar:\n");
                    String contact = contact_name.nextLine();
                    contact_list.add(contact);
                    System.out.printf("Contato %s adicionado com sucesso!\n",contact);
                    break;
                case 2:
                    int list_size  = contact_list.size(); //percorrendo o tamanho da lista.
                    int i; //contador para o for;
                    for (i=0; i < list_size; i++){
                        System.out.printf("Contato %d- %s\n", i+1, contact_list.get(i)); //.get para obter o índice do elemento da lista.
                    }
                    break;
                case 3:
                    System.out.println("Qual contato você deseja remover?\n");
                    int delete = contact_position.nextInt();
                    int deleted = delete-1; //variável para mostrar no print o nome do contato deletado.
                    System.out.printf("O contato %d - %s foi removido com Sucesso!", delete, contact_list.get(deleted));
                    contact_list.remove(delete-1);
                    break;
                case 4:
                    System.out.println("Saindo do menu...");
                    counter = false;
                    
            }
            
            
        }
        
        
        
        
        
        
        
    }
    
}
