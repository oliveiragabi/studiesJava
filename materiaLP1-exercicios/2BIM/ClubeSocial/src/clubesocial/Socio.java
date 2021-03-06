package clubesocial;

public class Socio {
    private long cartaoSocio;
    private String nomeSocio;
    private String enderecoSocio;
    private int telefoneSocio;
    private String emailSocio;
    private int tempoAssociado;
    
    public Socio(long cartaoSocio, String nomeSocio, String enderecoSocio, int telefoneSocio, String emailSocio, int tempoAssociado){
        this.cartaoSocio = cartaoSocio;
        this.nomeSocio = nomeSocio;
        this.enderecoSocio = enderecoSocio;
        this.telefoneSocio = telefoneSocio;
        this.emailSocio = emailSocio;
        this.tempoAssociado = tempoAssociado;
    }

    Socio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public long getcartaoSocio(){
        return cartaoSocio;
    }

    public String getNomeSocio() {
        return nomeSocio;
    }

    public String getEnderecoSocio() {
        return enderecoSocio;
    }

    public int getTelefoneSocio() {
        return telefoneSocio;
    }

    public String getEmailSocio() {
        return emailSocio;
    }

    public int getTempoAssociado() {
        return tempoAssociado;
    }
    
    public long regSocio(){
        return 0;
    
    }
    
    public int ConsSocio(){
        return 0;
    }

    public void setCartaoSocio(long cartaoSocio) {
        this.cartaoSocio = cartaoSocio;
    }

    public void setNomeSocio(String nomeSocio) {
        if (nomeSocio.trim().isEmpty()) {
             throw new IllegalArgumentException();
        }
        this.nomeSocio = nomeSocio;
    }

    public void setEnderecoSocio(String enderecoSocio) {
        this.enderecoSocio = enderecoSocio;
    }

    public void setTelefoneSocio(int telefoneSocio) {
       if (telefoneSocio.trim().isEmpty()) {
    } 
            throw new IllegalArgumentException();
        }

    public void setEmailSocio(String emailSocio) {
        if (emailSocio.trim().isEmpty()) {
        throw new IllegalArgumentException();
        
        this.emailSocio = emailSocio;
    }

    public void setTempoAssociado(int tempoAssociado) {
        if(tempoAssociado <= 0 )
            throw new IllegalArgumentException();
        this.tempoAssociado = tempoAssociado;
    }
    
   
    
    
}
