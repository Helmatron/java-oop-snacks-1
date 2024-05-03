package jSnacks;

// import java.util.Scanner;
// import java.util.ArrayList;

public class RegistroStudenti {

	private String[] elencoStudenti;

	public RegistroStudenti() {
		this.elencoStudenti = new String[5];

	}

	public void addStudenti() {
		
		Studente dati = new Studente(null, null);
		for (int i = 0; i < elencoStudenti.length; i++) {
			System.out.print("Studente " + (i + 1) + " ");
			dati.setStudente();
			elencoStudenti[i] = dati.getStudente();
		}

	}

	public void getStudenti() {
		for (int i = 0; i < elencoStudenti.length; i++) {
			System.out.println((i + 1) + " " + elencoStudenti[i]);
		}

	}
	
	
	
	/* << ARRAY FINITO >>
	private String[] elencoStudenti;

	public RegistroStudenti() {
		this.elencoStudenti = new String[5];

	}

	public void addStudenti() {
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < elencoStudenti.length; i++) {
			System.out.println("Inserisci nome e cognome di studente " + (i + 1));
			elencoStudenti[i] = input.nextLine();
		}

	}

	public void getStudenti() {
		for (int i = 0; i < elencoStudenti.length; i++) {
			System.out.println((i + 1) + " " + elencoStudenti[i]);
		}

	}

	*/
	
	
	
	
	
	
	
	
	
	/*
	 * << ESPERIMENTO CON ARRAY LIST >> private ArrayList<String> Studenti;
	 * 
	 * public RegistroStudenti() { this.Studenti = new ArrayList<>();
	 * Studenti.add("Giacomo");
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * public void addStudenti() { Scanner input = new Scanner(System.in);
	 * System.out.println("Inserire nome dello studente");
	 * Studenti.add(input.nextLine());
	 * System.out.println("Inserire nome dello studente");
	 * Studenti.add(input.nextLine()); }
	 * 
	 * public void getStudenti( ) { System.out.println(Studenti); }
	 * 
	 * 
	 * 
	 */
	/*
	 * << ARRAY prova 1 >> NON POTENDO ALTERARE LA DIMENSIONE DELL'ARRAY UNA VOLTA
	 * DEFINITO non è possibile aggiungere o togliere studenti, a meno che non si
	 * prevedano degli spazi vuoti da riempire nell'array private String[]
	 * arrStudenti;
	 * 
	 * public RegistroStudenti() { this.Studenti = new String[3]; Studenti[0] =
	 * "Giacomo"; Studenti[1] = "Elisa"; Studenti[2] = "Giulia"; }
	 * 
	 * public void initRegistro() { Scanner input = new Scanner(System.in);
	 * 
	 * //Studenti.length = input.nextInt(); non si può variare la lunghezza di un
	 * array
	 * 
	 * 
	 * }
	 * 
	 * public void getStudenti() { System.out.println(Studenti.length); for (int j =
	 * 0; j < Studenti.length; j++) { System.out.println(Studenti[j]); }
	 * 
	 * 
	 * }
	 * 
	 * 
	 * public void setStudenti(String[] studenti) { Studenti = studenti; }
	 */

}
