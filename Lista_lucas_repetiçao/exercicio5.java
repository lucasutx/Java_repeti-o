import java.util.Scanner;
/*
 * Lucas Xavier Bitencourt
 * Objetivo: Descobrir média de filhos e salários e maior salário da pesquisa
 */

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Declaração das variáveis
		int conta,filho=0,numF;
		double salario,maior=0,perc=0,soma=0,somaF=0;
		
		System.out.println("Você vai analisar quantas famílias");
		numF=teclado.nextInt();
		
		//Repetição
		for(conta=1;conta<=numF;conta++) {
			
		//Leitura de números de filhos	
			System.out.println("Digite o número de filhos: ");
			filho=teclado.nextInt();
			
		//Soma total dos filhos	
			somaF=filho+somaF;
			
			
		//Leitura dos salários	
			System.out.println("Digite o valor do salário: ");
			salario=teclado.nextDouble();
			
		//Soma dos salários	
			soma=salario+soma;
			
			
		//Condição do maior salário
			if(salario>maior) {
				maior=salario;
			};
			
		//Percentual de salários até $100	
			if(salario<=100) {
				perc++;
			};
			
		}
		
		//Saída dos dados
		
		System.out.println("Maior salário é: "+maior);
		System.out.println("A média do salário da população é: \n" +(soma/numF));
		System.out.printf("A média de filhos é: %.0f \n",somaF/(numF));
		System.out.println("O percentual de salários abaixo até $100 é: \n"+perc*100/(numF)+"%");
		
		
	
	teclado.close();
}
	}
		