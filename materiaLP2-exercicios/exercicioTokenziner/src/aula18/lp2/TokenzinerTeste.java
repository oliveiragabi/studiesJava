package aula18.lp2;

import java.awt.BorderLayout;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class TokenzinerTeste {

    public static void main(String[] args) {

        StreamTokenizer streamTokenizer = new StreamTokenizer(new StringReader("Eduardo Gabrielle dois fresa pug azul lilas roxo amarelo verde"));
        
        try{
            
            while(streamTokenizer.nextToken() != StreamTokenizer.TT_EOF){
                if(streamTokenizer.ttype == StreamTokenizer.TT_WORD){
                     
                     System.out.println(streamTokenizer.sval);
                     System.out.println(" - é uma palavra \n");
            }
                else if(streamTokenizer.ttype == StreamTokenizer.TT_WORD )
                    System.out.println(streamTokenizer.);
                
                
           
        }
    }
        catch(IOException e){
             e.printStackTrace();
        }

}
    
}
    
// http://www.guj.com.br/t/contar-os-caracteres-de-uma-string/55851/12