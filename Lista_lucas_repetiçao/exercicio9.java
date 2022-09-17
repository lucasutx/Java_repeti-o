import java.util.Scanner;
/*
 * Lucas Xavier 
 * Objetivo: Calcular lucros e vendas e o subtotal
 */
public class exercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Declaração das variaveis
		double compra,venda,lucro=0,menos=0,entre=0,mais=0,perc=0,somaC=0,somaV=0,sub=0;
		int numM;
		
		//Número de mercadorias
		System.out.println("Quantas mercadorias você irá analisar?");
		numM=teclado.nextInt();
		
		//Repetição
		for(int conta=1;conta<=numM;conta++) {
	
			//Dados do usuário e somas
			System.out.println("Digite o preço de compra");
			compra=teclado.nextDouble();
			somaC=somaC+compra;
			
			System.out.println("Digite o preço de venda");
			venda=teclado.nextDouble();
			somaV=somaV+venda;
			
			sub=somaV-somaC;
			
			lucro=((venda/compra)-1)*100;
			
			//Condições
			if(lucro<10) {
				menos++;
			}
			else if(lucro>=10 && lucro<=20) {
				entre++;
			}
			else if(lucro>20) {
				mais++;
			}
			
		}
		System.out.println(lucro);
		System.out.println("A porcentagem de lucro até 10% é: "+menos);
		System.out.println("A porcentagem de lucro de 10% à 20% é: "+entre);
		System.out.println("A porcentagem de lucro mais de 20% é: "+mais);
		System.out.println("O lucro total é:"+sub);
		
		teclado.close();
	}

}
