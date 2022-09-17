import java.util.Scanner;
/*
 * Lucas Xavier
 * Objetivo escrever um resultado para E
 */

public class exercicio4 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		//Declaração das variáveis
		int conta,num,som=0,fat;
		double e=0;
		
		//Leitura dos dados
		System.out.println("Digite um valor para N inteiro e positivo");
		num=teclado.nextInt();
		
		
		//Repetição fatorial
		for(int cont=1;cont<=num;cont++) {
			
				
				fat=1;
				
				for(int j=1; j<=cont;j++) {
					
					fat=fat*j;
					
					
				}
				//e=2!+1
				e= e+1/fat;
	
		}
		
		//Saída
		System.out.println("E = "+e);
	


		
		
		
		
		
		
		
		
		
		
			
		
		/*int main (void){

			       int i, n;

			       float fat, result;

			       printf("Digite um numero : \n ");

			       scanf("%d", &n);

			       fat = 1;

			       for(i=1; i<=n; i++){

			           fat = fat * i;

			            result = result + (1/fat);

			           }

			           printf("O valor de E é %d :", result);

			return 0;
			
		}
			 
		*/
		
		teclado.close();
	}

}
