
package Dados;

import java.util.ArrayList;

public class Lista{
    private boolean deferido;
    private ArrayList<EstruturaDados> deferidos;
    private ArrayList<EstruturaDados> indeferidos;
    
    public Lista(){
        this.deferidos = new ArrayList<>();
        this.indeferidos = new ArrayList<>();
    }
    
    public String mostrarListaDeferidos(){
        String nomes = "Deferidos: ";
        for(EstruturaDados estruturaDados : deferidos){
            nomes = nomes + estruturaDados.getNome() + "\n";
        }
        return nomes;
    }
    
     public String mostrarListaIndeferidos(){
        String nomes = "Indeferidos: ";
        for(EstruturaDados estruturaDados : deferidos){
            nomes = nomes + estruturaDados.getNome() + "\n";
        }
        return nomes;
    }
     
    public void addDeferidos(EstruturaDados estruturaDados){
        this.deferidos.add(estruturaDados);
    }
    
    public void addIndeferidos(EstruturaDados estruturaDados){
        this.indeferidos.add(estruturaDados);
    }

    public void addLista(EstruturaDados estruturaDados){
        if(estruturaDados.getDeferido()){
          deferidos.add(estruturaDados);
        }else
            indeferidos.add(estruturaDados);
    }
}
   
