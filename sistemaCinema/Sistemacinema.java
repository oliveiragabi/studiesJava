package sistemacinema;

import java.time.LocalDateTime;
import java.time.Month;
import sistemacinema.dominio.Filme;
import sistemacinema.dominio.Genero;
import sistemacinema.dominio.Sala;
import sistemacinema.dominio.Sessão;

public class Sistemacinema {

    public static void main(String[] args) {
        Genero g1 = new Genero ("Drama");
        Genero g2 = new Genero ("Aventura");
        Genero g3 = new Genero ("Romance");
        
        System.out.println(g1.getNome());
        System.out.println(g2.getNome());
        System.out.println(g3.getNome());
        
        Filme f1 = new Filme ("Jogos Vorazes ", " A Cabana", "...", 142 ); 
        Filme f2 = new Filme ("O Lado Bom da Vida", "Wall-e", "Malevola", 130 );
        
        System.out.println(f1.getTitulo());
        System.out.println(f2.getTitulo());
        
        g1.addFilme(f1);
        g1.addFilme(f2);
        g2.addFilme(f1);
        g3.addFilme(f1);
        g3.addFilme(f2);
        
        System.out.println(g1.mostrarFilme());
        System.out.println(g2.mostrarFilme());
        System.out.println(g3.mostrarFilme());
    
        f1.addGenero(g1);
        f1.addGenero(g2);
        f1.addGenero(g3);
        
        f2.addGenero(g1);
        f2.addGenero(g2);
        f2.addGenero(g3);
        
        System.out.println(f1.mostrarGeneros());
        System.out.println(f2.mostrarGeneros());
        
        LocalDateTime d1 = LocalDateTime.of(2017, 05, 16, 14, 11,00);
        LocalDateTime d2 = LocalDateTime.of(2017, 05, 16, 16, 11, 00);
        
        Sala sala1 = new Sala(60);
        
        Sessão s1 = new Sessão (d1, d2, false, sala1, 40.00);
        
        s1.venderIngresso(true);
        s1.venderIngresso(false);
    
   }
}
