package aula.pkg2305;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;


class StringIO {
    public static String lerString( int tamanho, DataInput entrada ) throws IOException{
	
		
		StringBuilder st = new StringBuilder( tamanho );
		
		int i = 0;
		
		boolean continuar = true;
		
		while( continuar && i < tamanho ){
			
			char ch = entrada.readChar();
			
			i++;
			
			if( ch == 0 )
				continuar = false;
			else
				st.append( ch );
			
		}
		
		entrada.skipBytes( 2 * ( tamanho - i ) );
		
		return st.toString();
		
	}
	
	public static void escreverString( String s, int tamanho, DataOutput saida ) throws IOException{
		
		for( int i = 0; i < tamanho; i++){
			
			char ch = 0;
			
			if( i < s.length() )
				ch = s.charAt(i);
			
			saida.writeChar( ch );
			
		}
		
	}
}
