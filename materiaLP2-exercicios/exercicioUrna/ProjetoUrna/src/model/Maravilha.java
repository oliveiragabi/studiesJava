package model;

public class Maravilha {

	private String descricao;
	private String img;
	private Integer votos;
	
	
	public Maravilha() {
		
		this.descricao = "";
		this.img = "";
		this.votos = new Integer(0);
	}
	
	public Maravilha(String descricao, String img) {
		
		this.descricao = descricao;
		this.img = img;
		this.votos = new Integer(0);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Integer getVotos() {
		return votos;
	}

	public void setVotos(Integer votos) {
		this.votos = votos;
	}
	
	
	
	
}
