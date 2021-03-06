package br.edu.ifsp.lp1;

import javax.swing.JOptionPane;

public class atv{
	
	public static void main (String args[]){
		int cont = 0;
		int graus = 0;
		int Resultado = 0;
		int media = 0;
		
		cont = 1;
		
		while(cont<=10)
		{
			graus = Integer.parseInt(JOptionPane.showInputDialog("Entre com o grau:"));
			
			Resultado = Resultado +graus;
			
			cont ++;
		}
			
			media = Resultado / 10;
			
			JOptionPane.showMessageDialog(null,"A media da turma eh: " +media);
			
			System.exit(0);
		
		
		}
		
		
	}
