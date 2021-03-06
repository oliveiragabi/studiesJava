package sistemacinema.dominio;

import java.util.ArrayList;

public class Genero {
    
    private int codigo;
    private String nome;
    private ArrayList<Filme> filmes;
   
    
    public Genero(String nome){
        this.nome=nome;
        this.filmes = new ArrayList<>(); 
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getNome(){
        return nome;
    }
    
     public ArrayList<Filme> getFilmes(){
        return filmes;
    }
     
    public void addFilme(Filme filmes){
        this.filmes.add(filmes);
        filmes.addGenero(this);
    }
    
    public String mostrarFilme(){
        String titulos = this.nome + ": ";
        for (Filme filme : filmes){
        titulos = titulos + filme.getTitulo() + "-";
        }
        return titulos;
    }

}

