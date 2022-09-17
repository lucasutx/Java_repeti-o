import java.util.Scanner;
/*
 * Lucas Xavier Bitencourt
 * Objetivo: Descobrir número S
 */

public class exercicio6 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		//Declaração das variáveis
		double num,fixo,soma=0,subtotal;
		
		//Leitura dos dados
		System.out.println("Escreva um número inteiro e positivo");
		num=teclado.nextInt();
		
		
		//Repetição ate o número desejado
		for(int cont=1;cont<=num;cont++) {
			
			fixo=1;
			subtotal=fixo+(fixo/cont);
			soma=soma+subtotal;
			
		}
		
		//Saída
		System.out.printf("O valor de S é: %.3f",soma);
		teclado.close();

	}

}
