import java.util.Scanner;

 public class App {

     // Início do Programa
     public static void main(String[] args) throws Exception {

        // Declaração de Variaveis
     double  fahrenheit;
     double celsius;
     
     // Solicitação de Dados
     Scanner teclado = new Scanner(System.in);
     System.out.println("Digite a temperatura em Celsius: ");
     celsius = teclado.nextDouble();
     teclado.close();

     // Calculo Fahrenheit
     fahrenheit = celsius * 1.8 + 32;

     // Exibir a Resposta para o Usuário
     System.out.println("A temperatura em fahrenheit é " + fahrenheit);
    }
}



