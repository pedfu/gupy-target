package com.targetsistemas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuestaoDois {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int num = scanner.nextInt();
		
		boolean ans = existeNaSequenciaFibonacci(num);
		
		String resposta = (ans == true) ? "Número pertence a sequência de Fibonacci" : "Não pertence a sequência de Fibonacci";
		System.out.println(resposta);
		
		scanner.close();
	}

	public static boolean existeNaSequenciaFibonacci(int num) {
		
		if( num == 0 || num == 1 ) {
			return true;
		} else if( num < 0 ) {
			return false;
		}
		
		List<Integer> fibonacci = new ArrayList<>(Arrays.asList(0, 1));
		int count = 2;
		
		while ( true ) {
			int next = fibonacci.get(count - 1) + fibonacci.get(count - 2);
			fibonacci.add(next);
			
			// return true if the fibonacci number is equal num
			if( fibonacci.get(count) == num ) {
				return true;
			}
			
			// break while
			if( fibonacci.get(count) > num ) {
				break;
			}
			
			count++;
		}
		
		// return false
		return false;
	}
}
