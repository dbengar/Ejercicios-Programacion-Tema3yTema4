package Contadorxd;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		Contador contador1 = new Contador();
		Contador contador2 = new Contador(10);

		
		System.out.println("Introduce un valor: ");
		int num = sc.nextInt();
		contador1.setCont(num);
		contador1.incrementar(num);
		System.out.println("\nEl valor actual del contador es: " + contador1.getCont());
		contador1.incrementar(num);
		System.out.println("\nEl valor actual del contador es: " + contador1.getCont());
		contador1.decrementar(num);
		System.out.println("\nEl valor actual del contador es: " + contador1.getCont());

		
		
		contador2.incrementar(num);
		System.out.println("\nEl valor actual del contador2 es: " + contador2.getCont());
		contador2.decrementar(num);
		System.out.println("\nEl valor actual del contador2 es: " + contador2.getCont());

		sc.close();
	}

}
