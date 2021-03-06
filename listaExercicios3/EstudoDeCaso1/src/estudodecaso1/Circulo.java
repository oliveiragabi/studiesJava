package estudodecaso1;

public class Circulo {
   private int raio;
   
   public Circulo(){
       
   }
   
   public Circulo(int raio){
       this.raio=raio;
   }
   
  public double calcularArea(){
       return Math.PI*raio*raio;
   
}
  public double calcularPerimetro(){
      return 2*Math.PI*raio;
      
  }
} 
    

