package arrayList;

import java.util.*;

/**
 * Cambio test
 */

public class Ejercicio1 {

	static Scanner ent = new Scanner(System.in);
	
	public static void main(String[] args) {

		int num = 0;
		boolean datoCorrecto = false;
		String opcion;
		
		while(!datoCorrecto) {
			System.out.print("introduce cantidad de numeros a introducir: ");
			try {
				num = ent.nextInt();
				ent.nextLine();
				int arrayOriginal[] = crearArray(num);
				
				int[] arrayModificado = arrayReves(arrayOriginal);
				
				System.out.println("Original: " + Arrays.toString(arrayOriginal));
				
				System.out.println("Reves: " + Arrays.toString(arrayModificado));
				
				System.out.println("Quieres repetir? S/N");
				opcion = ent.nextLine();
				
				if(opcion.equalsIgnoreCase("S")) {
					datoCorrecto = false;
				}else {
					datoCorrecto = true;
					System.out.println("Has salido del programa");
				}
			}catch(InputMismatchException ex) {
				System.err.println("Solamente numeros enteros");
				ent.next();
			}
		}

	}

	/**
	 * 
	 * @param numArray
	 * @return
	 */
	public static int[] crearArray(int numArray) {

		int numRandom = 0;
		
		Random random = new Random();
		
		int arrayTemporal[] = new int[numArray];
		
		for (int i = 0; i < numArray; i++) {
			numRandom = random.nextInt(25);
			arrayTemporal[i] = numRandom;
		}
		
		return arrayTemporal;
	}
	
	public static int[] arrayReves(int[] arrayOriginal) {
		
		int[] arrayTemp = new int[arrayOriginal.length];
		
		for (int i = 0; i < arrayTemp.length; i++) {
			arrayTemp[i] = arrayOriginal[arrayOriginal.length -1 -i]; // -1 - i da la vuelta al array
		}
		
		return arrayTemp;
		
	}
}
