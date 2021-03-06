package clubesocial;

import java.util.ArrayList;

public class Categoria {
    private String usuario;
    private ArrayList <Socio> socios;

    public Categoria(){
        this.usuario = usuario;
        this.socios = new ArrayList <> ();
    }
    
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
