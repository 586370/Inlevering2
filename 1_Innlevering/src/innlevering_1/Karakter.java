package innlevering_1;

import static javax.swing.JOptionPane.*;

public class Karakter {

	public static void main(String[] args) {
	
		final int ANT_ELEVER = 10;

		
		for (int elev = 1; elev <= ANT_ELEVER; elev++) {
			int poeng = Integer.parseInt(showInputDialog("Poengsum: "));
			
			if (poeng > 100)
				System.out.println("Ugyldig sum, må være mellom 0 - 100");
		else if (poeng < 0)
			System.out.println("Ugyldig sum, må være mellom 0 - 100");
		else if (poeng >= 90)
			System.out.println("A");
		else if (poeng >= 80)
			System.out.println("B");
		else if (poeng >= 60)
			System.out.println("C");
		else if (poeng >= 50)
			System.out.println("D");
		else if (poeng >= 40)
			System.out.println("E");
		else if (poeng >= 0)
			System.out.println("F");
		}
		
		
	

	}

}
