package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class karakter {

	public static void main(String[] args) {
	
	for (int l = 1;l <= 10;l++) {
	
	int p = parseInt(showInputDialog("Poeng: ")); 
	
	if (100 >= p && 90 <= p) {
	System.out.println("A");	
	}
	else if (90 > p && 80 <= p) {
		System.out.println("B");
		
	}
	else if (80 > p && 60 <= p) {
		System.out.println("C");
		
	}
	else if (60 > p && 50 <= p) {
		System.out.println("D");
	}
	else if (50 > p && 40 <= p)	{
		System.out.println("E");	
	}
	else if (40 > p && 0 <= p) {
		System.out.println("F");		
		}
	else { System.out.println("Ugyldig verdi");
		l--;
		
	}
	}
	}

}
