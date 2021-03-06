package bean;

import java.util.ArrayList;

import model.Maravilha;

public class VotarBean {
	
	private ArrayList<Maravilha> votacao;
	
	public VotarBean() {
		
		votacao = new ArrayList<Maravilha>();
		
		Maravilha e1 = new Maravilha("Coliseu", "coliseu.jpg");
		Maravilha e2 = new Maravilha("Cristo", "Cristo.jpg");
		Maravilha e3 = new Maravilha("As Ruinas de Petra", "AsRuinasDePetra.jpg");
		Maravilha e4 = new Maravilha("Chichén Itzá", "ChichenItza.jpg");
		Maravilha e5 = new Maravilha("Machu Picchu", "MachuPicchu.jpg");
		Maravilha e6 = new Maravilha("Muralha da China", "MuralhaChina.jpg");
		Maravilha e7 = new Maravilha("Taj Mahal", "TajMahal.jpg");
		
		votacao.add(e1);
		votacao.add(e2);
		votacao.add(e3);
		votacao.add(e4);
		votacao.add(e5);
		votacao.add(e6);
		votacao.add(e7);
	}

	public ArrayList<Maravilha> getLista() {
		return votacao;
	}

	public void setLista(ArrayList<Maravilha> votacao) {
		this.votacao = votacao;
	}
	
	
	

}
