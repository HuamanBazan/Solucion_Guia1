package com.senati.eti;
//Importando la libreria para lectura de datos
import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instancia a la clase Scanner
		//Creado un objeto x a partir de la clase scanner
		Scanner x = new Scanner(System.in);
		
		//Declarar la variable
		int numero = 0 ;
		
		System.out.print("Ingrese n�mero:");
		numero = x.nextInt();
		//Impresion
		System.out.println("\nN�mero Ingresado");
		System.out.println("------------------");
		System.out.println("N�mero......:"+ numero);
		

	}

}