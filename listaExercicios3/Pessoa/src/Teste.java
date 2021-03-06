public class Teste {
    public static void main (String args []){
    
    Pessoa p1 = new Pessoa();
    Pessoa p2 = new Pessoa (23,  "fernando");
    Pessoa p3 = new Pessoa (25, "Dario");
    
    p3.setNome("Fuji");
    p1.setNome("Mamae");
    
    
    
   System.out.println("O id é: " + p1.getId()+ "e seu nome é: " + p1.getNome());
   
   System.out.println("O id é: " + p2.getId() + "e seu nome é: " + p2.getNome());     
   
   System.out.println("O id é: " + p3.getId() + "e seu nome é: " + p3.getNome());
 
    }
}
