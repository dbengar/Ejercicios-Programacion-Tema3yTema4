package ejercicio5;

public class main {

	public static void main(String[] args) {
		 // Se crean 4 fracciones
		fraccion f1 = new fraccion(1, 4); 
		fraccion f2 = new fraccion(1, 2); 
		fraccion f3 = new fraccion(); 
		fraccion f4 = new fraccion(4); 

		fraccion suma = f1.sumar(f2);
		fraccion resta = f1.restar(f3);
		fraccion producto = f1.multiplicar(f4);
		fraccion cociente = f1.dividir(f2);
		
        System.out.println(f1 + " + " + f2 + " = " + suma);
        System.out.println(f1 + " - " + f3 + " = " + resta);
        System.out.println(f1 + " * " + f4 + " = " + producto);
        System.out.println(f1 + " / " + f2 + " = " + cociente);                                                   
}

}
