
package questao3;
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in); 
       
        float C=0.0f;
        float F=0.0f;
         
         System.out.println("Digite a temperatura em Fahrenheit: ");
         F = entrada.nextFloat();
         
         C = (float) (F-32.0f)*(5.0f/9.0f);
         
         System.out.println("A conversao para Centigrados eh:"+C);
         
         
    }
    
}
