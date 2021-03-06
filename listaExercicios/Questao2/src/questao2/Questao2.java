package questao2;
import java.util.Scanner;

public class Questao2 {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       int Distancia;
       float VelocidadeMedia;
       int TempoGasto;
       int LitrosUsados;
       
        System.out.println("Digite o tempo gasto na viagem: ");
        TempoGasto = entrada.nextInt();
        
        System.out.println("Digite a velocidade media gasta na viagem:");
        VelocidadeMedia = entrada.nextFloat();
        
        Distancia = (int) (TempoGasto*VelocidadeMedia);
        
        System.out.println("A distancia percorrida foi: "+Distancia);
        
        LitrosUsados = Distancia/12;
        
        System.out.println("A quantidade de litros usados na viagem foi:" 
                +LitrosUsados);
        
       
       
       
    }
    
}
