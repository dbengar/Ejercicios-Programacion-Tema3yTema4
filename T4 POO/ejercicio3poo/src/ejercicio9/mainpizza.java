package ejercicio9;



public class mainpizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza p1 = new Pizza( " margarita ", " mediana ");
		Pizza p2 = new Pizza(" funghi ", " familiar ");
		Pizza p3 = new Pizza(" cuatro quesos ", " mediana ");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		p2.sirve();
		System.out.println("perdidas: " + Pizza.getTotalPedidas());
		System.out.println("servidas: " + Pizza.getTotalServidas());
	}

}
