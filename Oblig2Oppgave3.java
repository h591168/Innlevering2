package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oblig2Oppgave3 {

	public static void main(String[] args) {
	
		int x = parseInt(showInputDialog("Fakultere: "));
		
		int fakultert = 1;
		
		for (int j = x;j >= 1;j--) {
		
		fakultert = fakultert * j;
		
		
		}
		System.out.print(fakultert);
		
		
		
		
		
	}

}
