
package estudodecaso1;


public class EstudoDeCaso1 {

    
    public static void main(String[] args) {
      
        Quadrado  q1= new Quadrado(5);
    
        Quadrado  q2= new Quadrado(15);
       
        
        System.out.println(q1.calcularArea());
        System.out.println(q2.calcularArea());
        
        System.out.println(q1.calcularPerimetro());
        System.out.println(q2.calcularPerimetro());
        
   
        Retangulo r1= new Retangulo(5,15);
        Retangulo r2 = new Retangulo(10,20);
       
        
        System.out.println(r1.calcularArea());
        System.out.println(r2.calcularArea());
        
        System.out.println(r1.calcularPerimetro());
        System.out.println(r2.calcularPerimetro());
        
        
        Circulo c1= new Circulo(5);
        
        Circulo c2 =new Circulo(10);
        
        System.out.println(c1.calcularArea());
        System.out.println(c2.calcularArea());
        
        System.out.println(c1.calcularPerimetro());
        System.out.println(c2.calcularPerimetro());
    
    }
    
    
}
