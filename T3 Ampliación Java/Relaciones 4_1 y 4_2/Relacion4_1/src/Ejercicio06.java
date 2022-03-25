import java.util.Scanner;

public class Ejercicio06 {

  public static void main(String[] args) {
	  
	  Scanner s= new Scanner(System.in);
    
      int[] numero = new int[15];
      int i;
      
      System.out.println("Vaya introduciendo n�meros enteros y pulsando INTRO:");
      
      for (i = 0; i < 15; i++) {
        numero[i] = s.nextInt();
      }
    
      s.close();
      System.out.println();
      

      System.out.println("Array original:\n");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", i);
      }
      System.out.println("|");
      for (i = 0; i <=75; i++) {
        System.out.print("_");
      }
      System.out.println("");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", numero[i]);
      }
      System.out.println("|");
 
      int aux = numero[14];
      for (i = 14; i > 0; i--) {
        numero[i] = numero[i-1];
      }
      numero[0] = aux;

      System.out.println("\nArray rotado a la derecha una posici�n:\n");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", i);
      }
      System.out.println("|");
      for (i = 0; i <= 75; i++) {
        System.out.print("_");
      }
      System.out.println("");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", numero[i]);
      }
      System.out.println("|");

   
  }

}