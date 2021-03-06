package questao7;
import java.util.Scanner;


public class Questao7 {
    
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
          
        int A;
        int B;
        int ResultadoSoma;
        int ResultadoSubtracao;
        int ResultadoMultiplicacao;
        int ResultadoDivisao;
        
        System.out.println("Entre com um valor para a:");
        A = entrada.nextInt();
        
        System.out.println("Entre com um valor para b:");
        B = entrada.nextInt();
        
        ResultadoSoma = (A+B);
        
        ResultadoSubtracao = (A-B);
        
        ResultadoMultiplicacao = (A*B);
        
        ResultadoDivisao = (A/B);
        
        System.out.println("O resultado da soma eh: "+ResultadoSoma);
        System.out.println("O resultado da subtracao eh:"+ResultadoSubtracao);
        System.out.println("O resultado da multiplicacao eh:"+ResultadoMultiplicacao);
        System.out.println("O resultado da divisao eh:"+ResultadoDivisao);
    }
    
}
