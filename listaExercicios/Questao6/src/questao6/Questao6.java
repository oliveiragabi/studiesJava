package questao6;
import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
        
        float Valor;
        float Taxa;
        int TempoAtraso;
        float Prestacao;
        
        System.out.println("Digite o valor:");
        Valor = entrada.nextFloat();
        
        System.out.println("Digite a taxa:");
        Taxa = entrada.nextFloat();
        
        System.out.println("Digite o tempo de atraso: \n");
        TempoAtraso =  entrada.nextInt();
        
        Prestacao = (float) Valor+(Valor*Taxa/100)*TempoAtraso;
        
        System.out.println("O valor da prestacao em atraso eh"+Prestacao);
    }
    
}
