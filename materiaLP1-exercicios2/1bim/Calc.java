//criando pacote
package br.edu.ifsp.lp1;

//importando a classe Scanner
import java.util.Scanner;

//criando a classe
public class Calc{
	 
	 //método principal
	 public static void main(String args[]){
	 	
	 	//declarando e instaciando objetos
	 	Scanner objStr = new Scanner(System.in);
	 	Scanner objNum = new Scanner(System.in);
	 	
	 	//mensagem
	 	System.out.println("Digite uma expressão");
	 	
	 	//declarando e recebendo valor
	 	double numero1   = objNum.nextDouble();
	 	String expressao = objStr.nextLine();
	 	double numero2   = objNum.nextDouble();
	 	
	 	//declarar uma variável char
	 	char op = expressao.charAt(0);
	 	
	 	switch(op){
	 		
            case '+' : System.out.print("valor = " +
                            (numero1+numero2));
	 	           break;
	 	    case '-' : System.out.print("valor = " +
                            (numero1-numero2));
	 	           break;      
	 	           
	 	    case '*' : System.out.print("valor = " +
                            (numero1*numero2));
	 	           break;       
	 	    case '/' : System.out.print("valor = " +
                            (numero1/numero2));
	 	           break;       
	 	    default : System.out.print ("Operador 
	 	            Invalido : " + op);
	 	                   
   } 	
  }
	
}





