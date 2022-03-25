package examen1java;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		int x1 = 0, x2 = 0, x3 = 0;
		int o1 = 0, o2 = 0, o3 = 0;
		System.out.println("¡Juguemos al tres en raya!");
		imprimeTablero();
		conviertePosicionMovimiento();
		usuarioMueveFicha(x1, x2, x3);
	}

	public static int[] imprimeTablero() {
		int[] tablero = new int[9];
		for (int i = 0; i <= 2; i++) {
			System.out.print("     -     ");

		}
		System.out.println("");
		System.out.println("");
		for (int i = 0; i <= 2; i++) {
			System.out.print("     -     ");

		}
		System.out.println("");
		System.out.println("");
		for (int i = 0; i <= 2; i++) {
			System.out.print("     -     ");
		}
		return tablero;
	}

	public static void conviertePosicionMovimiento() {
		boolean movimientocorrecto = true;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("");
			System.out.println("Elige donde quieres colocar tu ficha");
			String[] posicion = { "ARRIBA IZQUIERDA", "ARRIBA CENTRO", "ARRIBA DERECHA", "CENTRO IZQUIERDA",
					"CENTRO CENTRO", "CENTRO DERECHA", "ABAJO IZQUIERDA", "ABAJO CENTRO", "ABAJO DERECHA" };
			String movimiento = sc.nextLine();
			if (posicion.equals(movimiento)) {
				movimientocorrecto = false;
				System.out.println("MOVIMIENTO VALIDO");
				switch (movimiento) {
				case "ARRIBA IZQUIERDA": {
					int x1 = 0;
					int x2 = 0;
					int x3 = 0;
				}
				case "ARRIBA CENTRO": {
					int x1 = 1;
					int x2 = 1;
					int x3 = 1;
				}
				case "ARRIBA DERECHA": {
					int x1 = 2;
					int x2 = 2;
					int x3 = 2;
				}
				case "CENTRO IZQUIERDA": {
					int x1 = 3;
					int x2 = 3;
					int x3 = 3;
				}
				case "CENTRO CENTRO": {
					int x1 = 4;
					int x2 = 4;
					int x3 = 4;
				}
				case "CENTRO DERECHA": {
					int x1 = 5;
					int x2 = 5;
					int x3 = 5;
				}
				case "ABAJO IZQUIERDA": {
					int x1 = 6;
					int x2 = 6;
					int x3 = 6;
				}
				case "ABAJO CENTRO": {
					int x1 = 7;
					int x2 = 7;
					int x3 = 7;
				}
				case "ABAJO DERECHA": {
					int x1 = 8;
					int x2 = 8;
					int x3 = 8;
				}
				}
			} else {
				movimientocorrecto = true;
				System.out.println("MOVIMIENTO ERRONEO");
			}
		} while (movimientocorrecto = true);

	}

	public static void usuarioMueveFicha(int x1, int x2, int x3) {
		conviertePosicionMovimiento();
		if ((x1 == 0 || x1 == 1 || x1 == 2)) {
			imprimeTablero();
			System.out.print(" X ");
		}
	}
}
