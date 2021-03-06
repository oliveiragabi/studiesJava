package entrega1bim.lp2;

public class Main {
    
     public static void main(String[] args) {
     
         Atleta a1 = new Atleta();
         a1.setIdade(16);
         a1.setNome("Gabrielle");
         
         Atleta a2 = new Atleta();
         a2.setIdade(16);
         a2.setNome("Gabrielle");
         
         Jogador j1 = new Jogador();
         j1.setNome("Jose");
         j1.setIdade(18);
         j1.setNumero(10);
         j1.setTime("São Paulo");
         
         Jogador j2 = new Jogador();
         j2.setNome("Maria");
         j2.setIdade(18);
         j2.setNumero(8);
         j2.setTime("Palmeiras");
         
         
         System.out.println("***** TESTANDO TOSTRING *****");
         System.out.println("-------------------");
         System.out.println("toString a1: " + a1.toString());
         System.out.println("toString a2: " + a2.toString());
         System.out.println("toString j1: " + j1.toString());
         System.out.println("toString j2: " + j2.toString());
         
         System.out.println("\n***** TESTANDO EQUALS *****");
         System.out.println("-------------------");
         System.out.println("Equals a1 e a2: " + a1.equals(a2));
         System.out.println("Equals j1 e j2: " + j1.equals(j2));
         
         System.out.println("\n***** TESTANDO HASHCODE*****");
         System.out.println("-------------------");
         System.out.println("Hashcode a1: " + a1.hashCode());
         System.out.println("Hashcode a2: " + a2.hashCode());
         System.out.println("Hashcode j1: " + j1.hashCode());
         System.out.println("Hashcode j2: " + j2.hashCode());
     
     
         
     }
}
