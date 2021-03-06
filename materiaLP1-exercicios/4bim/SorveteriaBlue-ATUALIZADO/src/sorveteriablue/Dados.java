package sorveteriablue;


import java.io.*;
import java.io.FileReader;
import java.io.BufferedReader;

public class Dados {
    FileReader fileR;
    BufferedReader buffR;
    FileWriter fileW;
    BufferedWriter buffW;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    String linha="";
    String conteudo="";
    
    
    
    public void gravarArquivo(String texto){
        try{
        fileW=new FileWriter("C:\\Users\\gabik\\Documents\\NetBeansProjects\\Sorveteria.txt", true);
        buffW = new BufferedWriter(fileW);        
        buffW.write("Total da compra: "+texto + "\r\n");        
        buffW.close();        
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }   
    
    public String lerArquivo(){
        try{
        fileR= new FileReader("C:\\Users\\gabik\\Documents\\NetBeansProjects\\Sorveteria.txt");
        buffR= new BufferedReader(fileR);
        
        linha= buffR.readLine();
        
        while(linha!=null){
            conteudo+=linha + "\n";
            linha= buffR.readLine();
        }
        fileR.close();
        return conteudo;
        
        }
        catch(FileNotFoundException e){
            return e.getMessage();
        }
        
        catch(IOException e){
            return e.getMessage();
        }
    }
}
