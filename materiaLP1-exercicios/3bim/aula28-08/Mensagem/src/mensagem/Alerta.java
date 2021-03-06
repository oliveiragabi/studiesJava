package mensagem;

public interface Alerta extends Mensagem {

    public String Demora = "Essa operação levará alguns minutos para ser concluída";
    public String Cautela =  "Nunca force o encerramento do programa.\n  Encerre-o de forma correta";      
  
    public void showMsg(String Texto, int icone);
       
}
