package innlevering2;

public class O1 {

	public static void main(String[] args) {
		
		/* Oppgave a) 
		 int [] tab = {1, 2, 4, 8, 16};
		
		for (int i = 0; i<tab.length; i++) {
			int v = tab[i];
		System.out.println(v);
		}
		*/
		
		
		/* Oppgave b) IF
		 String utskrift = "";
		 
		int [] tab1 = {42, 67, 89};
		for (int i = 0; i<tab1.length; i++) {
			int v = tab1[i];
			utskrift = " " + v + " ";
		System.out.print(utskrift);
		}
		*/
		
		/* Oppgave c) 1 KF
		 int [] tab2 = {1, 5, 10};
		 
		int sum = 0;
		for (int i = 0; i<tab2.length; i++) {
			 sum += tab2[i];
		System.out.println(sum);
		}
		*/
		
		
		/* Oppgave c) 2 IF
		int [] tab3 = {1, 5, 10};
		int sum = 0;
		int i = 0;
		
	*/
		
		
		/* Oppgave c) 3 IG
		 
		 */
		
		
		/* Oppgave d) F
		static int[] tab5 = {29, 18, 102, 4, 2};
		
		static int[] tall123 = {29};
		
		
		public static boolean finnesTall(int tall, int[] tabell) {
			
			boolean funnet = false;
			int pos = 0;
			
			while (!funnet && pos < tabell.length) {
				if (tall == tabell[pos]) {
					funnet = true;
				}
				pos++;
			}
			
			return funnet;
		}
		
		public static boolean sjekktall(int[] tall1, int[] tab5) {
			
			for (int tall : tab5) {
				
				boolean hartall = finnesTall(tall,tall1);
				
				if (!hartall) {
					return false;
				}
			}
			
			return true;
		}
		
		public static void main(String[] args) {
			
			System.out.println(sjekktall(tall123,tab5));
	*/
	
		
	/*  Oppgave e) IG
		int [] tab6 = {1, 5, 10};
		int tall = 17;
		*/
		
		
		/* Oppgave f) 
		int [] tab7 = {1, 5, 10, 7, 3};
		for (int i = tab7.length - 1; i>-1; i--) {
			int v = tab7[i];
					System.out.println(v);
		}
		*/
		
		
		/* Oppgave g) IG
		int [] tab8 = {1, 5, 10, 7, 3};
		*/
		
		
		/* Oppgave h) IG
		int [] tab9 = {1, 3, 5, 7, 9};
		int [] tab10 = {2, 4, 6, 8, 10};
		*/
	}
	}


