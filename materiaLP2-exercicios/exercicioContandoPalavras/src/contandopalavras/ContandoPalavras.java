package contandopalavras;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import sun.security.pkcs11.wrapper.Functions;

public class ContandoPalavras {

    public static int palavras = 0;
    public static int totalVogais = 0;
    public static int totalConsoante = 0;
    public static int palavrasQuatro = 0;
    public static String consoantes = "bcdfghjklmnpqrstvxwyz";
    public static String vogais = "aeiou";


    public static void main(String[] args) {

        try {
            String musica = "Olha que coisa mais linda\n"
                    + "Mais cheia de graça\n"
                    + "É ela, menina\n"
                    + "Que vem e que passa\n"
                    + "Num doce balanço\n"
                    + "A caminho do mar\n"
                    + "\n"
                    + "Moça do corpo dourado\n"
                    + "Do sol de Ipanema\n"
                    + "O seu balançado é mais que um poema\n"
                    + "É a coisa mais linda que eu já vi passar\n"
                    + "\n"
                    + "Ah, por que estou tão sozinho?\n"
                    + "Ah, por que tudo é tão triste?\n"
                    + "Ah, a beleza que existe\n"
                    + "A beleza que não é só minha\n"
                    + "Que também passa sozinha\n"
                    + "\n"
                    + "Ah, se ela soubesse\n"
                    + "Que quando ela passa\n"
                    + "O mundo inteirinho se enche de graça\n"
                    + "E fica mais lindo\n"
                    + "Por causa do amor";

            StringReader sr = new StringReader(musica);
            StreamTokenizer st = new StreamTokenizer(sr);

            while (st.nextToken() != StreamTokenizer.TT_EOF) {

                switch (st.ttype) {

                    case StreamTokenizer.TT_WORD:

                        palavras++;
                        if (st.sval.length() > 4) {
                            palavrasQuatro++;
                        }
                        int NumeroLetras = musica.length();
                        for (int i = 0; i < NumeroLetras; i++) {
                            if (vogais.indexOf(musica.length()) > 0) {
                                totalVogais++;
                            } else if (consoantes.indexOf(musica.length()) > 0) {
                                totalConsoante++;
                            }
                        }

                        break;

                }

            }
        } catch (IOException e) {
        }

        System.out.println("Quantidade de palavras que começam com consoantes: " + totalConsoante);
        System.out.println("Quantidade de palavras que começam com vogais: " + totalVogais);
        System.out.println("Quantidade de palavras com mais de 4 letras: " + palavrasQuatro);
        System.out.println("Quantidade de total palavras: " + palavras);
    }
}
