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
		int[] lotteryArray = new int[ slots ];
		int randomNumber;
		boolean isRepeated;
		
		// 6 mal die Schleife durchlaufen
		for ( int indexDrawn = 0; indexDrawn < slots; indexDrawn++ ) {
			do {
					// setze isRepeated erst mal auf false, da bis jetzt die Zahl noch nie da gewesen sein kann
					isRepeated = false;
					// 1 to 49, eine random Zahl wird ermittelt und in randomNumber gespeichert
					randomNumber = rand.nextInt((max - min) + 1) + min;
					// checke in der Schleife ob die Nummer bereits in einem non-zero Element vorhanden ist
					for ( int k = 0; k <= indexDrawn; k++ ) {
						// checke in der Schleife in allen non-zero Element, ob die Nummer vorhanden ist						
						if ( lotteryArray[k] == randomNumber ) {
							// Wenn vorhanden, dann setzte isRepeated afu true und brich ab
							isRepeated = true;
							break;
						}
					}
				
				} while ( isRepeated );
			// Zahl wird ins Array geschrieben, wenn eben noch nicht vorhanden
			lotteryArray[ indexDrawn ] = randomNumber;
		}
		Arrays.sort(lotteryArray);
		// System.out.println(App.c( "#y" ) + "The result of the lottery:");	// println als eigene Zeile als output
		System.out.print(App.c( "#y" ) + "The result of the lottery:");	// print als folgender output, immer ans LEerzeichen zwischen Ausgaben denken
		
		for (int i = 0; i<slots; i++) {
			System.out.print( "\t" + App.c( "#g" ) + lotteryArray[ i ] + " " );
		}
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
