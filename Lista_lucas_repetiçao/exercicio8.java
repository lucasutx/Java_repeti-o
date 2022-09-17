import java.util.Scanner;
/*
 * Lucas Xavier 
 * objetivo:Número de termos em fibinacci, que acabe antes do termo
 */
public class exercicio8 {

	public static void main(String[] args) {
		// Declaração de variáveis
	    Scanner teclado = new Scanner(System.in);
	    int num,a=0,b=0,soma;

	    // Leitura do usuário
	    System.out.print("Digite o número de termos para L: ");
	    num = teclado.nextInt();
	    
	    //Repetição
	    for (int conta=1; conta < num; conta++)
	    {
	      if (conta==1)
	      {
	        a = 0;
	        System.out.println(a);
	      } else if (conta==2)
	      {
	        b = 1;
	        System.out.println("  " + b);
	      }else
	      {
	        soma = a+b;
	        a = b;
	        b = soma;
	        System.out.println("  " + b);
	      }
	    }
	    
	    teclado.close();
	  }
	}
		