

import java.util.Scanner;
public class Ejercicio08 {

  public static void main(String[] args) {
  
    String[] mes = {
      "enero", "febrero", "marzo", "abril", "mayo", "junio",
      "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };
    
    Scanner s=new Scanner(System.in);
                  
    int[] temperatura = new int[12];
    int i, j;
    
    
          
    for (i = 0; i < 12; i++) {
      System.out.print("Introduzca la temperatura media de " + mes[i] + ": ");
      temperatura[i] = s.nextInt();
    }
    
   

    for (i = 0; i < 12; i++) {
      System.out.printf("%15s", mes[i]);
      for (j = 0; j < temperatura[i]; j++) {
        System.out.print( "*");
      }
      System.out.println(" " + temperatura[i] + "ºC" );
    }
    s.close();
  }
}