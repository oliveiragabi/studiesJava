package questao10b;
import java.util.Scanner;

public class Questao10b {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
       float Capacidade;
       float Peso = 110;
       int NumP=10;
       int NumV;
       
       
        System.out.println("Digite a capacidade do elevador:");
        Capacidade = entrada.nextFloat();
        
        System.out.println("Digite o seu peso:");
        Peso = entrada.nextFloat();
        
        System.out.println("Digite o numero de pessoas:");
        NumP = entrada.nextInt();
                
        NumV = (int) (NumP+Peso/Capacidade);
                
       
        System.out.println("O numero de  viagens para o elevador completar a tarefa eh:"+NumV);
        
    }
    
}
