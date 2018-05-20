import java.util.Scanner;

/**
 * Prova DB1 Start. Desafio de Matemática.
 * Ler um número e informar seu dobro, se ele é par ou ímpar, maior ou não à 10, e se é primo.
 * @author Kátia Marina Silva
 */

public class Desafio1 {
		
	private static Scanner s;

	public static void main(String[] args) {
		
		s = new Scanner (System.in);
		System.out.println ("Digite um número inteiro:"); 
		int numero = s.nextInt();
			
	// Verificar se é par ou ímpar.
		 if (numero%2 == 0) {
		 	System.out.println ("O número não é ímpar, é par.");
		 }
		 else {
		 	System.out.println ("O número não é par, é ímpar.");
		 }

	// Verificar se é ou não maior que 10.
		 if (numero <= 10) {
		 	System.out.println ("O número não é maior que 10.");
		 }
		 else {
		 	System.out.println ("O número é maior que 10.");
		 }

	// Verificar se é ou não primo.
		if ( (numero==1) || (numero==2) || (numero==3) || (numero==5) || (numero==7) ){
			System.out.println ("O número é primo.");	
		}
		else if ( numero%2==0 || numero%3==0 || numero%5==0 || numero%7==0) {
			System.out.println("O número não é primo.");
		}	
		else {
			System.out.println ("O número é primo.");
		} 
	
		int oDobro = (numero * 2);
		System.out.println ("O dobro do número é " + oDobro);
			
	}
}
