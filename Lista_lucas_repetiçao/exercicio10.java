import java.util.Scanner;
/*
 * Lucas Xavier
 * objetivo: Contagem de votos para candidatos
 */

public class exercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Declaração das variáveis
		int voto,cand1=0,cand2=0,cand3=0,cand4=0,nulo=0,branco=0;
		
		//Leitura dos votos
		System.out.println("Registre seus votos, digitando de 1 à 4 para os candidados, 5-nulo e 6-branco");
		voto=teclado.nextInt();
		
		while(voto!=0) {
			
			//Condição para poder entrar em cada candidato
			switch(voto) {
			case 1:
				cand1++;
				break;
				
			case 2:
				cand2++;
				break;
			case 3:
				cand3++;
				break;
			case 4:
				cand4++;
				break;
			case 5:
				nulo++;
				break;
			case 6:
				branco++;
				break;
			case 0:
				System.out.println("Fim da votação");
				break;
			default:
				System.out.println("Digite um número válido");
				
				voto++;
			
			}
			System.out.println("Registre seus votos, digitando de 1 à 4 para os candidados, 5-nulo e 6-branco");
			voto=teclado.nextInt();
		}
		
		//Exibição dos valores
		System.out.println("O número de votos para candidado 1 é: "+cand1);
		System.out.println("O número de votos para candidado 2 é: "+cand2);
		System.out.println("O número de votos para candidado 3 é: "+cand3);
		System.out.println("O número de votos para candidado 4 é: "+cand4);
		System.out.println("O número de votos em nulo é: "+nulo);
		System.out.println("O número de votos em branco é: "+branco);
		
		
		
		
		teclado.close();

	}

}
