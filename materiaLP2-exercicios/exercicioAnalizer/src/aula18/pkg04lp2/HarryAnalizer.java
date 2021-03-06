package aula18.pkg04lp2;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class HarryAnalizer {

    public static int harry = 0;
    public static int hermione = 0;
    public static int platform = 0;
    public static boolean proxima = false;

  
    public static void main(String[] args) {
        try {
            
            InputStream is = new FileInputStream("harry.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader (isr);
            StreamTokenizer st = new StreamTokenizer(br);
            while (st.nextToken() != StreamTokenizer.TT_EOF){
            
                switch(st.ttype)
                {
                    case StreamTokenizer.TT_WORD:
                        //caracteres += st.sval.length();
                        if(st.sval.equals("Harry"))
                            harry++;
                        else if
                             (st.sval.equals("Hermione"))
                             hermione++;
                           
                        if(proxima == true){
                            if(st.sval.equals("nine"))
                                    platform++;
                                   proxima = false;
                           
                        }
                    if(st.sval.equals("platform"))
                        proxima = true;
                        
                        break;
                    
                }
                            
                }
            
            }

 
        catch(IOException e){
            e.printStackTrace();
        
        }
    
        
        //System.out.println("caracteres " + caracteres);
        System.out.println("harry " + harry);
        System.out.println("hermione " + hermione);
        System.out.println("plataforma " + platform);


    
    
    }
}