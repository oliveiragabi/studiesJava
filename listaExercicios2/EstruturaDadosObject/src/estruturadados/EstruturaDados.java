package estruturadados;

public class EstruturaDados 
{
    public static void main(String[] args) 
    {
        Vetor v1 = new Vetor (5);
        
        v1.adicionar("Xuxu");
        v1.adicionar("kk");
        v1.adicionar("Euzinha");
        v1.adicionar("Meu cabelo é maravilhoso");
        v1.adicionar("KKKKK");
        
        //Casting
        String s0 = (String) v1.buscar(0);
        String s1 = (String) v1.buscar(1);
        String s2 = (String) v1.buscar(2);
        String s3 = (String) v1.buscar(3);
        String s4 = (String) v1.buscar(4);
        
        System.out.println (s0);
        /*System.out.println (v1.toString());
        
        v1.adicionar(1, "Chácara");
        System.out.println (v1.toString());
        
        v1.remover(3);
        System.out.println (v1.toString());*/    
    }
}
