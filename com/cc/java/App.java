/**
 *  Literatur-Beispiel | 6 aus 49
 * 
 */

package com.cc.java;
import java.util.Random;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		// Deklarationen
		Random rand = new Random();
		int min  = 1, max = 49, slots = 6;
		int[] lotteryArray = new int[slots];
		int randomNumber;
		boolean isRepeated;
				
		
		for (int indexDrawn = 0; indexDrawn < slots; indexDrawn++) // 6x
		{
			do {
					isRepeated = false;
					// 1 to 49
					randomNumber = rand.nextInt((max - min) + 1) + min;
					// check for repeated number against
					// the filled non-zero elements			
					for (int k = 0; k <= indexDrawn; k++) 
					{
						//check against each filled non-zero elements
						//hope that none repeats the random number							
						if (lotteryArray[k] == randomNumber) 
						{
							isRepeated = true;
							break;
						}
					}
				
				}while (isRepeated);
			
			lotteryArray[indexDrawn] = randomNumber;  // Zahl ins Array
					
		}
		
		Arrays.sort(lotteryArray);
		
		System.out.println("The result of the lottery:");
		
		for (int i = 0; i<slots; i++) 
		{
			System.out.print(lotteryArray[i] + " ");
		}
		
	}

	// standart Methode
		private static void output( String outStr ) {
			System.out.println( outStr );
		}
	// überladene Methode
		private static void output( char outChar ) {
			System.out.print( outChar );
		}
	// überladene Methode
		public static String c( String c ) {
			switch ( c ) {
				case "#r":
					return "\u001b[31m";
				case "#g":
					return "\u001b[32m";
				case "#y":
					return "\u001b[33m";
				case "#b":
					return "\u001b[34m";
				case "#p":
					return "\u001b[35m";
				case "#c":
					return "\u001b[36m";
				default:
					return "\u001b[0m";
			}
		}
}
