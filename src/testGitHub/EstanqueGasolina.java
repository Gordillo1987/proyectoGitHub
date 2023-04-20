/**
 * 
 */
package testGitHub;

import java.util.Scanner;

/**
 * @author XOQ9C53
 *
 */
public class EstanqueGasolina {
	
	public static void main(String []args) {
		
		String mensaje="";
		
		Scanner s = new Scanner(System.in);
		System.out.println ("Ingrese la media actual en litros");
		double mediaLitros=s.nextDouble();
		
		if(mediaLitros==70)
		{
			mensaje="Estanque lleno";
		}else if (mediaLitros>=60 && mediaLitros<70) {
			mensaje="Estanque casi lleno";
		}else if (mediaLitros>=40 && mediaLitros<60) {
			mensaje="Estanque 3/4";
		}else if (mediaLitros>=35 && mediaLitros<40) {
			mensaje="Medio estanque";
		}else if (mediaLitros>=20 && mediaLitros<35) {
			mensaje="Suficiente";
		}else if (mediaLitros>=1 && mediaLitros<20) {
			mensaje="Insuficiente";
		}
		
		
		System.out.println (mensaje);
		
		
	}

}
