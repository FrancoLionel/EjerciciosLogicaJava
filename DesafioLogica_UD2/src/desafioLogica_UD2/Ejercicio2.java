package desafioLogica_UD2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] arg) {
		
		// Declaracion de variables
		int num;
		// Declaracion del objeto Scanner para permitir la entrada por consola
		Scanner teclado = new Scanner(System.in);
		
		// Se pedira un numero para dar sus 20 sucesivos, en el caso de que sea negativo el numero
		// dado, se volverá a repetir el bucle y no entrara en el for
		do{
			
			System.out.println("Escribe un numero y te dare sus 20 numeros sucesivos: ");
			num = teclado.nextInt();
			
			if(num < 0) {
				System.out.println("Ese número es negativo, elija otro");
			}
			else {
				for(int i = 1; i <= 20; i++) {
					System.out.print(num + i + " ");
				}
			}
		}while(num < 0);
		
		teclado.close();
	}
}
