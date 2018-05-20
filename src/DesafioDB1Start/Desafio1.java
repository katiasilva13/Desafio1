import java.util.Scanner;

/**
 * Prova DB1 Start. Desafio de Matem�tica.
 * Ler um n�mero e informar seu dobro, se ele � par ou �mpar, maior ou n�o � 10, e se � primo.
 * @author K�tia Marina Silva
 */

public class Desafio1 {
		
	private static Scanner s;

	public static void main(String[] args) {
		
		s = new Scanner (System.in);
		System.out.println ("Digite um n�mero inteiro:"); 
		int numero = s.nextInt();
			
	// Verificar se � par ou �mpar.
		 if (numero%2 == 0) {
		 	System.out.println ("O n�mero n�o � �mpar, � par.");
		 }
		 else {
		 	System.out.println ("O n�mero n�o � par, � �mpar.");
		 }

	// Verificar se � ou n�o maior que 10.
		 if (numero <= 10) {
		 	System.out.println ("O n�mero n�o � maior que 10.");
		 }
		 else {
		 	System.out.println ("O n�mero � maior que 10.");
		 }

	// Verificar se � ou n�o primo.
		if ( (numero==1) || (numero==2) || (numero==3) || (numero==5) || (numero==7) ){
			System.out.println ("O n�mero � primo.");	
		}
		else if ( numero%2==0 || numero%3==0 || numero%5==0 || numero%7==0) {
			System.out.println("O n�mero n�o � primo.");
		}	
		else {
			System.out.println ("O n�mero � primo.");
		} 
	
		int oDobro = (numero * 2);
		System.out.println ("O dobro do n�mero � " + oDobro);
			
	}
}
