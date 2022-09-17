import java.util.Scanner;
/*
 * Lucas Xavier Bitencourt
 * Objetivo: encontar números divisivéis por 3 e 9, e 2 e 5 e contar quantos números
 */
public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		//Declaração das variáveis
		int contador=1,div3_9=0,div2=0,div5=0;
		double num;

		//Contador para o while
			while(contador<=10) {

				System.out.println("Digite valores de números");
				num=teclado.nextDouble();
				
				//Condições
				if(num%3 == 0 && num%9 == 0) {
					System.out.printf("Número divisivel por 3 e 9 \n ");
					div3_9++;
					
				}
				if(num%2 ==0) {
					System.out.println("Número divisivel por 2");
					div2++;
						
				}
				 
				if(num%5 == 0) {
					System.out.println("Número divisivel por 5");
					div5++;
					
				}else {
					System.out.println("“Número não é divisível pelos valores");
				}
			
				
				
				
				//Saída para contagem dos números
				System.out.println("Número de divisíveis por 3 e 9 é: "+div3_9);
				
				
				System.out.println("Número de divisíveis por 5 é: "+div5);
				
				
				System.out.println("Número de divisíveis por 2 é: "+div2);
			
				contador++;
				}
		

		
		
		teclado.close();

	}

}
