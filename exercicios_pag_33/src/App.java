public class App {
    public static void main(String[] args) throws Exception {
        //Questão 1
        // for (int i = 150; i <=300; i++){
        //     System.out.println(i);
        // }

        //Questão 2
        // for (int i = 1; i < 1000; i += i){
        //     System.out.println(i);
        // }

        //Questão 3
        // for (int i = 1; i <= 100; i++){
        //     if (i % 3 == 0){
        //         System.out.println(i);
        //     }

        //Exemplo do slide abaixo:
        int x = 0;
        int y = 19;
        for (int i = x; i < y; i++){
            if (i % 19 == 0){
                System.out.println("Achei um número divisível por 19 entre x e y!");
                break;
                
            } else {
                System.out.println("Não encontrei");
                break;
            }
        }
            
        // }

        //Questão 4

    }
}
