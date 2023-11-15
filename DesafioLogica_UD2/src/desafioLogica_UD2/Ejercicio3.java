package desafioLogica_UD2;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		System.out.println("Los numeros que son multiplos de 2 y de 3 en el rango 1-100:");
		for(int i = 1; i <= 100; i++) {
			
			// los numeros que tengan resto 0 al dividirlos entre 2 y 3, son multiplos de 2 y 3 respectivamente.
			if(i % 2 == 0 || i % 3 == 0 ) {
				System.out.print(i + " ");
			}
		}
	}
}
