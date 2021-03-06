package questao9;
import java.util.Scanner;


public class Questao9 {

    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
        
        float Custo;
        int NumCoelhos=0;
        
        System.out.println("Digite o numero de coelhos:");
        NumCoelhos = entrada.nextInt();
        
        Custo = (float) ((NumCoelhos * 0.70) / 18.0 + 10.0);
        
        System.out.println("O custo na criacao de coelhos eh:"+Custo);
        
    }
    
}
