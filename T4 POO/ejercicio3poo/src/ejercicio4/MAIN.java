package ejercicio4;

import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		libro libro1 = new libro("El quijote", "Cervantes", 1, 0);
		libro libro2 = new libro();

		System.out.println("Introduce el nombre del libro: ");
		String titulo = sc.nextLine();
		System.out.println("Introduce el autor del libro ");
		String autor = sc.nextLine();
		System.out.println("Introduce el numero de ejemplares ");
		int numero_ejemplares = sc.nextInt();
		System.out.println("Introduce el numero de ejemplares prestados");
		int numero_ejemplares_prestados = sc.nextInt();
		libro2.setTitulo(titulo);
		libro2.setAutor(autor);
		libro2.setNumero_ejemplares(numero_ejemplares);
		libro2.setNumero_ejemplares_prestados(numero_ejemplares_prestados);

		
		if(libro1.prestamo()) {
			System.out.println("El prestamo del libro " + libro1.getTitulo() + " se ha realizado correctamente");
			System.out.println("\nDatos libro 1: " + libro1.toString());
			libro1.prestamo();
			System.out.println("\nSe ha realizado un prestamo: " + libro1.getNumero_ejemplares_prestados());
			libro1.devolucion();
			System.out.println("\nSe ha realizado un devolución: " + libro1.getNumero_ejemplares_prestados());
			libro1.prestamo();
			System.out.println("\nSe ha vuelto a realizar un prestamo: " + libro1.getNumero_ejemplares_prestados());
			libro1.prestamo();

		}else {
			System.out.println("El prestamo del libro " + libro1.getTitulo() + " no se ha realizado correctamente");

		}
		
		System.out.println("\nDatos libro 2: " + libro2.toString());
		
		
		sc.close();
	}
}