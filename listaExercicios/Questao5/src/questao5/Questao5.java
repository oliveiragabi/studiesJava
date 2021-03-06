package questao5;
import java.util.Scanner;

public class Questao5 {

   
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
     
     System.out.println("Informe o primeiro valor (a): ");
     int a = ler.nextInt();
 
     System.out.println("Informe o segundo valor (b): ");
     int b = ler.nextInt();
 
      int aux;
      aux = a;
      a = b;
      b = aux;
      
 
     System.out.println("a: " + a);
     System.out.println("b: " + b);
  }
}
    
    

