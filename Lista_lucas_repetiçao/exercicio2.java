import java.util.Scanner;
/*
 * Autor:Lucas Xavier Bitencout
 * Objetivo:Fazer a contagem de números positivos,negativos e zeros e calcular a porcentagem
 */

public class exercicio2 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		//Declaração das variáveis
		int positivo=0,negativo=0,zero=0;
		int num=0;
		double total,percp,percn,percz;
		
		//Leitura dos codigos do usuário
		System.out.println("Digite valores para a contagem de números positivos,negativos ou zero: ");
		num=teclado.nextInt();
		
		//Estrutura de repetição
		while(num > 0 || num<0 || num==0) {
			
			if(num>0) {
				positivo++;
				
			}else if(num<0) {
				negativo++;
			}else {
				zero++;
				
			}
			
			//Contas para cálculo da porcentagem
			total= positivo+negativo+zero;
			percp=positivo*100/total;
			percn=negativo*100/total;
			percz=zero*100/total;
			
			System.out.println("Tem "+percp+"% de números positivos");
			System.out.println("Tem "+percn+"% de números negativos");
			System.out.println("Tem "+percz+"% de números zeros");
			
			System.out.println("Digite valores para a contagem de números positivos,negativos ou zero:  ");
			num=teclado.nextInt();
			
			
		}
		
		
		
		
		
		teclado.close();

	}

}
