package desafioLogica_UD2;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;
		String respuesta;
		
		
			
			// Peticion de los numeros por pantalla y lectura
			System.out.println("Escribe 3 numeros y el orden en el que quieres ordenarlos: ");
			
			System.out.println("Primer numero: ");
			num1 = teclado.nextInt();
			
			System.out.println("Segundo numero: ");
			num2 = teclado.nextInt();
			
			System.out.println("Tercer numero: ");
			num3 = teclado.nextInt();
			
		do {
			
			System.out.println("¿En que orden quieres ordenarlos? A: ascendente, D: descendente");
			respuesta = teclado.next();
			
			// equalIgnoreCase sirve para ignorar si el valor dado está en minuscula o mayuscula
			// con lo cual, es valido tanto "D" como "d"
			
			if(respuesta.equalsIgnoreCase("D")) {
				if (num1 < num2) {
		            int cambio = num1;
		            num1 = num2;
		            num2 = cambio;
		        }

		        if (num2 < num3) {
		            int cambio = num2;
		            num2 = num3;
		            num3 = cambio;
		        }
		        
		        if (num1 < num2) {
		            int cambio = num1;
		            num1 = num2;
		            num2 = cambio;
		        }
	
		        System.out.println("Numeros ordenados de forma descendente: " + num1 + ", " + num2 + ", " + num3);
			}
			else if (respuesta.equalsIgnoreCase("A")) {
				if (num1 > num2) {
		            int cambio = num1;
		            num1 = num2;
		            num2 = cambio;
		        }

		        if (num2 > num3) {
		            int cambio = num2;
		            num2 = num3;
		            num3 = cambio;
		        }
		        
		        if (num1 > num2) {
		            int cambio = num1;
		            num1 = num2;
		            num2 = cambio;
		        }
     
		        System.out.println("Numeros ordenados de forma ascendente: " + num1 + ", " + num2 + ", " + num3);
		        
			}
			else {
				System.out.println("Escriba A o D por favor.");
			}
		
		// Mientras la respuesta no sea "a", "A" o "d", "D", se repetirá el bucle
		} while (!respuesta.equalsIgnoreCase("A") && !respuesta.equalsIgnoreCase("D"));
		
		teclado.close();
	}
}
