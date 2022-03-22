package com.targetsistemas;

import java.util.Scanner;

public class QuestaoCinco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma palavra ou frase: ");
		String frase = scanner.nextLine();
		
		String fraseInvertida = inverter(frase);
		System.out.println(fraseInvertida);
		
		scanner.close();
	}
	
	// "manualmente"
	public static String inverter(String frase) {
		StringBuilder sb = new StringBuilder();
		
		for( int i = frase.length(); i > 0; i-- ) {
			sb.append(frase.charAt(i - 1)); 
		}
		
		return String.valueOf(sb);
	}

}
