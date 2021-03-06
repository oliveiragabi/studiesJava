package questao1;
import java.util.Scanner;


public class Questao1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
       int a,b,c,d;
       int ResultadoSoma;
       int ResultadoMultiplicacao;
       
       System.out.println("Digite o primeiro numero: "); 
       a= entrada.nextInt();
       
       System.out.println("\n Digite o segundo numero: ");
       b=entrada.nextInt();
       
       System.out.println("\n Digite o terceiro numero: ");
       c=entrada.nextInt();
       
       System.out.println("\nDigite o quarto numero: ");
       d=entrada.nextInt();
        
       ResultadoSoma = (a+b)+(a+c)+(a+d)+(b+c)+(b+d)+(c+d);
       ResultadoMultiplicacao = (a*b)*(a*c)*(a*d)*(b*c)*(b*d)*(c*d);
       
       System.out.println("O resultado da soma eh:" +ResultadoSoma);
       System.out.println("O resultado da multiplicacao eh:" +ResultadoMultiplicacao);
        
        
    }
    
}
