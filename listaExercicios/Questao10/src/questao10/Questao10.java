package questao10;
import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
       float Capacidade;
       float Carga;
       int NumV;
       
        System.out.println("Digite a capacidade do elevador:");
        Capacidade = entrada.nextFloat();
        
        System.out.println("Digite a quantidade de carga:");
        Carga = entrada.nextFloat();
                
        NumV = (int) (Capacidade/Carga);  
       
        System.out.println("O numero de  viagens para o elevador completar "
                + "a tarefa eh:"+NumV);
        
    }
    
}
