package questao4;
import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      int Altura;
      int Raio;  
      float Volume;
        
        System.out.println("Digite a altura da lata de oleo:");
        Altura = entrada.nextInt();
        
        System.out.println("Digite o raio da lata de oleo:");
        Raio = entrada.nextInt();
        
        Volume =  (float) (Math.PI*Raio*Raio*Altura);
        
        System.out.println("O volume da lata de oleo eh:"+Volume);
    }
    
}
