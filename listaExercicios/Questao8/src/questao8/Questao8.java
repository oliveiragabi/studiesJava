package questao8;
import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args) {
          Scanner entrada = new Scanner (System.in);
        
        int QuadradoNum;
        int Num;
        
         System.out.println("Digite um numero inteiro:");
         Num = entrada.nextInt();
         
         QuadradoNum = Num*Num;
         
         System.out.println("O quadrado do numero digitado eh:"
                 +QuadradoNum);
    }
    
}
