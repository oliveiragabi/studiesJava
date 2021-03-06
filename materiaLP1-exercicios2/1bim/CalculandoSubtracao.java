//importando a classe Scanner
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.*;

//criando a classe
public class CalculandoSubtracao{
	
	//método principal
	public static void main(String args[]){
		
		//declarando as variáveis
		//declarando três variáveis do tipo inteiro
		int valor1 = 0;
		int valor2 = 0;
		int resultado = 0;
		Scanner entrada;   //declaração objeto Scanner
		
		//intancia objeto entrada
		entrada = new Scanner(System.in);
		
		//Exibindo primeira mensagem
		System.out.print ("Entre com o primeiro valor");
		
		//ler o valor
		valor1 = entrada.nextInt();
		
		//Exibindo segunda mensagem
		System.out.print ("Entre com o segundo valor");
		
		//ler o valor
		valor2 = entrada.nextInt();
		
		//calculando
		resultado = valor1 - valor2;
		
		//exibir resultado
		System.out.println("A subtracao é " + resultado);
	}
	
}





