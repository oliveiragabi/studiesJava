
package Tela;

import Dados.EstruturaDados;


public class ExibirLista {
    public String mostrarListaDeferidos(Iterable<EstruturaDados> deferidos){
        String nomes = "Deferidos: ";
        for(EstruturaDados estruturaDados : deferidos){
            nomes = nomes + estruturaDados.getNome() + "\n";
        }
        return nomes;
    }
    
    public String mostrarListaIndeferidos(Iterable<EstruturaDados> indeferidos){
        String nomes = "Indeferidos: ";
        for(EstruturaDados estruturaDados : indeferidos){
            nomes = nomes + estruturaDados.getNome() + "\n";
        }
        return nomes;
    }
}
