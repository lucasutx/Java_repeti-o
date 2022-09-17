import java.util.Scanner;
/*
 * Autor:Lucas Xavier Bitencout
 * Objetivo:Fazer a contagem de números positivos,negativos e zeros
 */

public class exercicio1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		//Declaração das variáveis
		int positivo=0,negativo=0,zero=0;
		int num=0;
		
		//Leitura dos codigos do usuário
		System.out.println("Digite valores para a contagem de números positivos,negativos ou zero: ");
		num=teclado.nextInt();
		
		//Estrutura de repetição
		while(num > 0 || num<0 || num==0) {
			
			if(num>0) {
				positivo++;
				System.out.println("Tem "+positivo+" números positivos");
				
			}else if(num<0) {
				negativo++;
				System.out.println("Tem "+negativo+" números negativo");
				
			}else {
				zero++;
				System.out.println("Tem "+zero+" números zeros");
				
			}
			System.out.println("Digite valores para a contagem de números positivos,negativos ou zero:  ");
			num=teclado.nextInt();
		}
		
		
		
		teclado.close();

	}

}
