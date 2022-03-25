package paquetito;
import java.util.*;
public class DanielBIngo {



	public static void main(String[] args) {
	     int bombo = 0, aux, acertado;
	     boolean bingo=false;
	     boolean ordenar = true;
	     int[][] carton = new int[3][5];
	     int[][] carton2 = new int[3][5];
	     int[] sorteo = new int[50];
	     ordenar(carton);
	     ordenar2(carton2);
	     pulsarcontinuar(carton);
	    	 imprimecarton(carton);
	    	 imprimecarton2(carton2);
		     int numSorteig = sorteobolas(carton, carton2, sorteo);
		     mostrarUsats(sorteo, numSorteig);
		     System.out.println("");
	 
	 }
	 public static void pulsarcontinuar(int [] [] carton) {
		 System.out.println("******BINGO IES MARTINEZ MONTAÑES******");
	     System.out.println("            PREMIOS       ");
	     System.out.println("          Linea:  100$");
	     System.out.println("          Bingo:  500$");
	     System.out.println();
	     String seguir;
         Scanner  teclado = new Scanner(System.in);
         System.out.println("Pulsa cualquier tecla para continuar");
         
         try
         {
             seguir = teclado.nextLine();
         }
         catch(Exception e)
         {}
	 }
	 
	 public static int sorteobolas(int[][] carton, int[][] carton2, int[] sorteo) {
	        Scanner ranlat = new Scanner(System.in);
	        Random ran = new Random();
	        boolean bingo=false;
	        char opcio = ' ';
	        for (int i = 0; i < sorteo.length; i++) {
	            sorteo[i] = numsRepetidos(sorteo);
	        }
	            	for (int i = 0; i < sorteo.length; i++) {
	            		numeroacertados(sorteo[i], carton);
	            		numeroacertados2(sorteo[i], carton2);
	    	            System.out.println("");
	    	            System.out.println("");
	    	            System.out.println("Pulsa cualquier tecla para continuar");
	    	            System.out.println("Ha salido "+ sorteo[i]);
	    	        	String seguir;
	    	            Scanner  teclado = new Scanner(System.in);
	    	            try{
	    	                seguir = teclado.nextLine();
	    	            }
	    	            catch(Exception e)
	    	            {}
	   	   	    	 imprimecarton(carton);
	   	   	    	 System.out.println("");
	   	   	    	 imprimecarton2(carton2);

	            	}
	            	System.out.println("");
	            	if (comproBingo(carton)==true) {
	            		System.out.println("BINGO para juagdor 1");
	        
	            	} 
	            	
	            	if (comproBingo2(carton2)==true) {
	            		System.out.println("BINGO para juagdor 2");
	        
	            	}
	            	
	   return sorteo.length;   
	            }
	 
 public static void ordenar(int[][] carton) {
     Random ran = new Random();
     int k = 0;
     for (int i = 0; i < carton.length; i++) {
         for (int j = 0; j < carton[i].length; j++) {
             if (i == 0) {
                 if (j == 0) {
                	 carton[i][j] = ran.nextInt(7) + (10 * j) + 1;
                 } else {
                	 carton[i][j] = ran.nextInt(8) + (10 * j);
                 }
             } else {
                 if (i == 1) {
                     k = 0;
                 } else if (i == 2) {
                     k = 1;
                 }
                 carton[i][j] = ran.nextInt(9 + k) + (10 * j);
                 do {
                	 carton[i][j] = ran.nextInt(9 + k) + (10 * j);
                 } while (carton[i][j] <= carton[i - 1][j]);
             }
         }
     }
     carton[2][4]++;
 }
 
 public static void ordenar2(int[][] carton2) {
     Random ran = new Random();
     int k = 0;
     for (int i = 0; i < carton2.length; i++) {
         for (int j = 0; j < carton2[i].length; j++) {
             if (i == 0) {
                 if (j == 0) {
                	 carton2[i][j] = ran.nextInt(7) + (10 * j) + 1;
                 } else {
                	 carton2[i][j] = ran.nextInt(8) + (10 * j);
                 }
             } else {
                 if (i == 1) {
                     k = 0;
                 } else if (i == 2) {
                     k = 1;
                 }
                 carton2[i][j] = ran.nextInt(9 + k) + (10 * j);
                 do {
                	 carton2[i][j] = ran.nextInt(9 + k) + (10 * j);
                 } while (carton2[i][j] <= carton2[i - 1][j]);
             }
         }
     }
     carton2[2][4]++;
 }

 
 public static int bombos(int[][] carton) {
     int bombo = 0;
     for (int i = 0; i < carton.length; i++) {
         for (int j = 0; j < carton[i].length; j++) {
        	 carton[0][0] = bombo;
        	 carton[1][0] = bombo;
        	 carton[2][1] = bombo;
        	 carton[0][2] = bombo;
        	 carton[1][3] = bombo;
        	 carton[2][3] = bombo;
        	 carton[2][4] = bombo;
        	 carton[1][3] = bombo;
        	 carton[2][3] = bombo;
        	 carton[2][4] = bombo;
        	 carton[0][5] = bombo;
        	 carton[1][6] = bombo;
        	 carton[2][6] = bombo;
        	 carton[0][7] = bombo;
        	 carton[1][8] = bombo;
         }
     }
     return bombo;
 }

 public static void imprimecarton(int[][] carton) {
	 System.out.println("------------------------");
	 System.out.println("        Jugador 1       ");
	 System.out.println("------------------------");
     for (int i = 0; i < carton.length; i++) {
         System.out.println("");
         System.out.println("");

         for (int j = 0; j < carton[i].length; j++) {
             System.out.printf("%3d |", carton[i][j]);
   
         }
     }
 }
 
 public static void imprimecarton2(int[][] carton2) {
	 System.out.println("");
	 System.out.println("------------------------");
	 System.out.println("        Jugador 2       ");
	 System.out.println("------------------------");
     for (int i = 0; i < carton2.length; i++) {
         System.out.println("");
         System.out.println("");

         for (int j = 0; j < carton2[i].length; j++) {
             System.out.printf("%3d |", carton2[i][j]);
   
         }
     }
 }

	 
public static void mostrarUsats(int[] sorteo, int numsorteo) {
    for (int i = 0; i <= numsorteo; i++) {
        System.out.print(sorteo[i] + ",");
    }
    System.out.println();
}

public static int numsRepetidos(int[] sorteo) {

    Random ran = new Random();
    int num;
    boolean repetir = true;

    do {
        repetir = false;
        num = ran.nextInt(50) + 1;
        for (int i = 0; i < 50; i++) {
            if (num == sorteo[i]) {
                repetir = true;
                break;
            }
        }
    } while (repetir == true);
    return num;
}


public static void numeroacertados(int num, int[][] carton) {

    for (int i = 0; i < carton.length; i++) {
        for (int j = 0; j < carton[i].length; j++) {
            if (carton[i][j] == num) {
                carton[i][j] = 0;
            }
        }
    }
}
public static void numeroacertados2(int num, int[][] carton2) {

    for (int i = 0; i < carton2.length; i++) {
        for (int j = 0; j < carton2[i].length; j++) {
            if (carton2[i][j] == num) {
                carton2[i][j] = 0;
            }
        }
    }
}
      
private static boolean comproBingo(int[][] carton) {
    for (int i = 0; i < carton.length; i++) {
        for (int j = 0; j < carton[i].length; j++) {
            if (carton[i][j] > 0) {
                return false;
            }
        }
    }
    return true;
}


private static boolean comproBingo2(int[][] carton2) {
    for (int i = 0; i < carton2.length; i++) {
        for (int j = 0; j < carton2[i].length; j++) {
            if (carton2[i][j] > 0) {
                return false;
            }
        }
    }
    return true;
}
}



