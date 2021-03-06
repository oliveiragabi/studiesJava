import javax.swing.JOptionPane;

import Dados.EstruturaDados;

    public class TelasSistema() {
	private int tipoOpcao;  //1=Inclusao de Aluno; 2- Consultar Aluno  3 - Sair 
	private String nome; 
	private int idade;  
    
        
  public TelasSistema() {
	    
       }
        
        
   public void TelaEntradaDados() 
   {
       int tipoOpcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Inclusao de Aluno \n 2 -Consultar Aluno \n 3 - Sair (1; 2 ou 3)" , "Tipo Opcao", JOptionPane.PLAIN_MESSAGE));
       setTipoOpcao(tipoOpcao);
       
       String nome =  JOptionPane.showInputDialog(null, "Informe seu nome:" , "Nome", JOptionPane.PLAIN_MESSAGE);
       setNome(nome);
       
        
       float tamanho = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe sua idade: " , "idade", JOptionPane.PLAIN_MESSAGE));
       setIdade(idade);;
      
    }
   
   
        
   public int getTipoPacote() {
	return tipoPacote;
}
public void setTipoPacote(int tipoPacote) {
	this.tipoPacote = tipoPacote;
}
public String getTipoUrnaFuneraria() {
	return tipoUrnaFuneraria;
}
public void setTipoUrnaFuneraria(String tipoUrnaFuneraria) {
	this.tipoUrnaFuneraria = tipoUrnaFuneraria;
}
public float getTamanho() {
	return tamanho;
}
public void setTamanho(float tamanho) {
	this.tamanho = tamanho;
}

public void mostraTela(EstruturaDados dados)
{
	 int   tipoPacote = dados.getCodTipoPacote();
	 String tipoUrna = dados.getCodtTipoUrnaFuneraria();
	 String    descricaoTipoPacote          = dados.getDescricaoTipoPacote();
         String    descricaoTipoUrnaFuneraria   = dados.getDescricaoTipoUrnaFuneraria();
	 float  tamanho = dados.getTamanho();
         String tela    = String.format("Tipo de Pacote: %d - %s \n Tipo de urna Funerária: %s - %s\n Tamanho: %f", tipoPacote, descricaoTipoPacote, tipoUrna, descricaoTipoUrnaFuneraria, tamanho)  ;
        
        JOptionPane.showMessageDialog(null,tela);
        
    }
    public void avisaReprovacao(String motivo)
    {
        String msgReprovado    = String.format("Sua solicitação foi reprovada\n Motivo: %s", motivo)  ; 
         JOptionPane.showMessageDialog(null,msgReprovado);
    }
    
    public String obterOpcaoMenu () 
    {
    	String msgEntradaTela    = String.format("\n Você deseja Consultar (C) ou Incluir(I) Sair(S)?")  ;	
    	return   JOptionPane.showInputDialog(null, msgEntradaTela , "System xpto", JOptionPane.PLAIN_MESSAGE);
    	
   
    	 
       
    }
	public void msgTela(String msgDescricao) {
		 JOptionPane.showMessageDialog(null,msgDescricao);
		
	}
}
