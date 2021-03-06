package bean;

public class Formulario {

	private String nome;
	private String email;
	private String telefone;
	private String instagram;
	
	private Boolean embranco;
	
	public Formulario() {
		
		this.nome = "";
		this.email = "";
		this.telefone = "";
		this.instagram = "";
		
		this.embranco = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public Boolean getEmbranco() {
		return embranco;
	}
	public void setEmbranco(Boolean embranco) {
		this.embranco = embranco;
	}
	
}
