package codigo5;

/**
 * Lo que el programa hace es saber si un número que ingresa el usuario es "afortunado" o no.
 * Los dígitos afortunados son: 3, 7, 8 y 9 y el resto no lo son
 */

// se importa la biblioteca
import java.util.Scanner;

public class Codigo5 {
	public static void main(String[] args) { //agrego el main
	    Scanner scanner = new Scanner(System.in);// se corrige el scanner para inicializarlo
	    
	    System.out.print("Introduzca un número: ");//se corrige el print con las comillas correctas
	    int c = scanner.nextInt(); // se cambia a int y el scanner correctamente
	    
	    int ni = Math.abs(c);//Aqui pongo math abs para no considerar números negativos
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
		  int digito = ni % 10; //saca el último digito del número
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
	      }
	      ni /= 10; //sacamos del else para eliminar el último digito y cerramos el while
	    }

	    if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado."); //le faltaba un t al print
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	  //cierro el scanner
	    scanner.close();
	  
	}
}
