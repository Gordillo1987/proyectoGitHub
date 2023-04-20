/**
 * 
 */


/**
 * @author XOQ9C53
 *
 */

import java.util.Scanner;


public class operadorTernarioNumeroMayor {
	
	public static void main(String []args) {
		
		//evaluacion de numero mayor en operador ternario
		/*int numero1=5;
		int numero2=10;
		int mayor=(numero1>numero2)? numero1 : numero2 ;*/
		
		int max=0;
		int min=0;
		
		Scanner s = new Scanner(System.in);
		System.out.println ("Ingrese un numero Uno");
		int num1=s.nextInt();
		
		System.out.println ("Ingrese un numero Dos");
		int num2=s.nextInt();
		
		/*System.out.println ("Ingrese un numero");
		int num3=s.nextInt();*/
		
		max=(num1>num2)? num1 :num2;
		
		min=(max==num1)?num2:num1;
		
		//max=(max > num3)? max:num3;
		
		/*System.out.println("num1= " + num1);
		System.out.println("num2= " + num2);
		System.out.println("num3= " + num3);*/
		
		System.out.println("El numero mayor es:" + max + "\nel numero menor es: " + min);
		
		
	}
	

}
