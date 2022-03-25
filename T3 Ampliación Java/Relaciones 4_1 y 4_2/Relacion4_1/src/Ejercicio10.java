
public class Ejercicio10 {

  public static void main(String[] args) {
  
    int[] n = new int[20];
    int[] par = new int[20];
    int[] impar = new int[20];
    int i;
    int pares = 0;
    int impares = 0;
    
    for (i = 0; i < 20; i++) {
      n[i] = (int)(Math.random() * 101);
      // Separa los números metiendo los pares en un array
      // y los impares en otro.
      if (n[i] % 2 == 0) {
        par[pares++] = n[i];
      } else {
        impar[impares++] = n[i];
      }
    }
    
    System.out.println("\nArray original:\n");
    for (i = 0; i < 20; i++) {
      System.out.print(n[i] + " ");
    }
    System.out.println();
    


    for (i = 0; i < pares; i++) {
      n[i] = par[i];
    }

    for (i = pares; i < 20; i++) {
      n[i] = impar[i - pares];
    }

    System.out.println("\n\nArray con los pares al principio:\n");
    for (i = 0; i < 20; i++) {
      System.out.print(n[i] + " ");
    }
  }
}