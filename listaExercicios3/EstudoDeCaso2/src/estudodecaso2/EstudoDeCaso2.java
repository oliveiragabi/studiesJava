package estudodecaso2;

public class EstudoDeCaso2 {

    
    public static void main(String[] args) {
        Conta c1 = new Conta (1, 1000, 2000);        
        Conta c2 = new Conta(2, 2000, 1000);
        
        c1.depositar(500.00);
        c2.depositar(1200.00);
        
        System.out.println(c1.consultarSaldo());   
        System.out.println(c2.consultarSaldo());
        
        
        c1.sacar(500.00);  
        c2.sacar(1200.00);
        System.out.println(c1.consultarSaldo());
        System.out.println(c2.consultarSaldo());
        
        
        
        c1.sacar(100.00);  
        c2.sacar(300.00);
        System.out.println(c1.consultarSaldo());
        System.out.println(c2.consultarSaldo());
        
        
        if (c1.transferir(c2, 2000)){
            System.out.println("nao deu certo");
            
        }else{
            System.out.println("Sucesso");
            
        }
      }
    
}
