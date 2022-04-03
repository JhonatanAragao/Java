// Faça um algoritimo que converte uma dada temperatura, fornecida pelo usuário entre as escalas Celsius(C), Fahrenheit(F) e Kelvin(K)
// 1 - Se o usuário fornecer a temperatura em °C  converta para °F e °K.
// 2 - Se o usuário fornecer a temperatura em °F  converta para °C e °K.
// 3 - Se o usuário fornecer a temperatura em °K  converta para °C e °F.

//Aluno: Jhonatan Aragão Costa
//Curso: Ciências da computação
//Instituição: AESPI - FAPI

import javax.swing.JOptionPane;

public class Ex_conversor_de_temperaturas {
    public static void main(String[] args){
        while (true){
            String options_menu = ("\n1. Celsius (°C)\n2. Fahrenheit (°F)\n3. Kelvin (°K)\n");
            System.out.println(options_menu);
            int userChoice = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções equivalente à escala de temperatura que deseja converter:\n"));
            if (userChoice < 1 || userChoice > 3) {
                System.out.println("erro404\nEscolha apenas opções entre 1 e 3!\nTry again :)\n");
            } else if (userChoice == 1) {
                float temperatureValue = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da temperatura em °C:\n"));
                float temperatureKelvin = temperatureValue + 273;
                float temperatureFahrenheit = (temperatureValue * 9 + 160) / 5;
                System.out.printf("%f°C  corresponde à \n %f°K \n %f°F \n", temperatureValue, temperatureKelvin, temperatureFahrenheit);
            } else if (userChoice == 2) {
                float temperatureValue = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da temperatura em °F:\n"));
                float temperatureCelsius = (temperatureValue * 5 - 160) / 9;
                float temperatureKelvin = temperatureCelsius + 273;
                System.out.printf("%f°F corresponde à:\n%f°C\n%f°K\n", temperatureValue, temperatureCelsius, temperatureKelvin);
            } else if (userChoice == 3) {
                float temperatureValue = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da temperatura em °K:\n"));
                float temperatureCelsius = temperatureValue - 273;
                float temperatureFahrenheit = (temperatureCelsius * 9) / 5 + 32;
                System.out.printf("%f°K corresponde à:\n%f°C\n%f°F\n", temperatureValue, temperatureCelsius, temperatureFahrenheit);
            } 
             {
                System.out.print("Encerrando o programa...");
                break;
            }
            }
        }
    }

