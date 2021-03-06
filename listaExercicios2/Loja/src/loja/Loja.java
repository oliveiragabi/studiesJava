package loja;

public class Loja 
{
    public static void main(String[] args) 
    {
      DVD video1 = new DVD (1.55, "Filme Barbie");
      System.out.println (video1.getValorVenda());
      
      CD musica1 = new CD (2.55, "CD KKK");
      System.out.println (musica1.getValorVenda());
      
      RevisaoLivro rl1 = new RevisaoLivro (50.55, 150);
      System.out.println (rl1.getValorVenda());
    }
    
}
