package sistemacinema.dominio;

import java.util.ArrayList;

public class Filme {
    private int codigo;
    private String titulo;
    private String tituloOriginal;
    private String descricao;
    private int duracao;
     private ArrayList<Genero> generos;
    
    public Filme(String titulo, String tituloOriginal, String descricao, int duracao){
    
        this.titulo = titulo;
        this.tituloOriginal = tituloOriginal;
        this.descricao = descricao;
        this.duracao = duracao;
        this.generos = new ArrayList<>(); 
    }
    
    public int getCodigo(){
        return codigo;
    }
    
     public String getTitulo(){
        return titulo;
    }
    
     public String getTituloOriginal(){
        return tituloOriginal;
    }
     
     public String getDescricao(){
        return descricao;
    }
     
     public int getDuracao(){
        return duracao;
    }
     
     public void addGenero(Genero genero){
         this.generos.add(genero);
     }
     
     public String mostrarGeneros(){
         String nomesGeneros = titulo + ":";
         
         for (Genero genero: generos){
             nomesGeneros = nomesGeneros + genero.getNome() + ", ";
         }
         return nomesGeneros;
     }
}


