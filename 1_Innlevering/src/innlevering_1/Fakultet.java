package innlevering_1;

import static javax.swing.JOptionPane.*;

public class Fakultet {
		
		public static void main(String[] args) {
			 int gange = 1;  
			 int fakultet = 1;  
			 
			  int tall = Integer.parseInt(showInputDialog("Tall: "));
			  
			  for(gange = 1; gange <= tall; gange++){    
			      fakultet = fakultet * gange;    
			  }    
			  System.out.println("Fakultet av " + tall + " er: " + fakultet);    
			 }  
			}  