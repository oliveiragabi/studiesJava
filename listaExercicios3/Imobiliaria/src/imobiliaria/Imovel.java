
package imobiliaria;

public class Imovel {
    private String localizacao;
    private String tipo;
    private float areaT=0;
    private float areaU=0;
    private float valorVenda=0;

    
    public  Imovel(){
         
    }
    
    
    public  Imovel(String localizacao, String tipo, float areaTotal, float areaUtil, float valorVenda){
        
        this.localizacao=localizacao;
        this.tipo=tipo;
        this.areaTotal=areaTotal;
        this.areaUtil=areaUtil;
        this.valorVenda=valorVenda;
   
    }
    public String getLocalizacao(){
        return localizacao;    
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public float getAreaU(){
        return areaU;
    }
    
    public float getArea(){
        return area;
    }
    
    public float getValorVenda(){
        return valorVenda;
        
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAreaT(float areaT) {
        this.areaTotal = areaTotal;
    }

    public void setAreaU(float areaU) {
        this.areaUtil = areaUtil;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }
    
}
