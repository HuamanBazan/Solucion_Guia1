  
package com.senati.eti;

import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Ingrese nombre: ");
	    String nombre = x.nextLine();// Se crea un objeto de tipo string
	    
	    System.out.println("\nResultados");
		System.out.println("------------------");
		System.out.println("N�mero de caracteres..........:"+ nombre.length());

	}

}