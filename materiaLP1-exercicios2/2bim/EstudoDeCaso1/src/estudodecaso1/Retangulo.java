package estudodecaso1;
 
public class Retangulo {
    private int base;
    private int altura;
    
    public Retangulo(){
    }
    
    public Retangulo (int base){
        this.base=base;
        this.altura=base;
        
    }
    
    public Retangulo (int base, int altura){
        this.base=base;
        this.altura=altura;
    }
      public int calcularArea(){
      return base*altura;
      
  }
  public int calcularPerimetro(){
      return 2*(base+altura);
      
  }
  
  public 
}
