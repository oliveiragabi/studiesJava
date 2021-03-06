package estudodecaso1;

public class Quadrado {
  private int lado;
  
  public Quadrado(){
  
  }
  
  public Quadrado(int lado){
      this.lado=lado;
  }
  
  
  public int calcularArea(){
      return lado*lado;
      
  }
  public int calcularPerimetro(){
      return 4*lado;
      
  }
}
