package aula.pkg2305;

import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.StringTokenizer;

public class Atleta {
 
    public static final int TAMANHO_MAXIMO = 40;
    public static final int TAMANHO_REGISTRO = 2 * TAMANHO_MAXIMO + 4 + 4 + 4 +4;
    
    private String nome;
    private Date dataNascimento;
    private String email;
    private Integer identidade;

    public Atleta(String nome, Date dataNascimento, String email, Integer identidade) {
        this.nome = nome;
        this.dataNascimento = new Date();
        this.email = email;
        this.identidade = identidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdentidade() {
        return identidade;
    }

    public void setIdentidade(Integer identidade) {
        this.identidade = identidade;
    }

    @Override
    public String toString() {
        return "Atleta{" + "nome=" + nome + ", dataNascimento=" + dataNascimento + ", email=" + email + ", identidade=" + identidade + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.dataNascimento);
        hash = 41 * hash + Objects.hashCode(this.email);
        hash = 41 * hash + Objects.hashCode(this.identidade);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Atleta other = (Atleta) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.dataNascimento, other.dataNascimento)) {
            return false;
        }
        if (!Objects.equals(this.identidade, other.identidade)) {
            return false;
        }
        return true;
    }
    
    public void escreverAtleta(DataOutput out) throws IOException {
       StringIO.escreverString (this.nome, TAMANHO_MAXIMO, out);
       out.writeInt( this.identidade);
       GregorianCalendar calendario = new GregorianCalendar();
       calendario.setTime(this.dataNascimento);
       out.writeInt(calendario.get(calendario.YEAR));
       out.writeInt(calendario.get(calendario.MONTH) +1);
       out.writeInt(calendario.get(calendario.DAY_OF_MONTH));
    
    }
    
    public void lerAtleta (DataInput in) throws IOException{
    this.nome = StringIO.lerString(TAMANHO_MAXIMO, in);
    
    this.identidade = in.readInt();
     
                
    
    
    
    }
    
    
    
}
