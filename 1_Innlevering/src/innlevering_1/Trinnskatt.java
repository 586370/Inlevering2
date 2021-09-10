package innlevering_1;

import static javax.swing.JOptionPane.*;

public class Trinnskatt {

	public static void main(String[] args) {
		
		String melding = "Bruttolønn:";
		
		double Trinn1 = 0.0093;
		double Trinn2 = 0.0241;
		double Trinn3 = 0.1152;
		double Trinn4 = 0.1452;
		
		double skatt = 0;
		
		int lonn = Integer.parseInt(showInputDialog(melding));
		
		if (lonn <= 164100)
			skatt = 0;
		else if (lonn <= 230950)
			skatt = lonn * Trinn1;
		else if (lonn <= 580650)
			skatt = lonn * Trinn2;
		else if (lonn <= 934050)
			skatt = lonn * Trinn3;
		else if (lonn >= 934051)
			skatt = lonn * Trinn4;
		
		System.out.println("Skatt: " + skatt);

	}

}
