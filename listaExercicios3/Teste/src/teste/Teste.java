package teste;
public class Teste {
    public static void main (String args []){
    
    Pessoa p1 = new Pessoa();    
    System.out.println(p1.getNome());
    System.out.println(p1.getId());
    
    Pessoa p2 = new Pessoa (23,  "fernando");
    System.out.println(p2.getNome());
    System.out.println(p2.getId());
   
    Pessoa p3 = new Pessoa ();
    p3.setNome("Fuji");
    System.out.println(p3.getNome());
 
    }
}

    
    

