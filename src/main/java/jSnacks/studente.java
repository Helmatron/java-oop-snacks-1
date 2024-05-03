package jSnacks;

import java.util.Scanner;

public class Studente {
	
	private String name;
	private String surname;
	
	public Studente(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public void setStudente() {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire il Nome dello studente");
		this.name = input.nextLine();
		System.out.println("Inserire il Cognome dello studente");
		this.surname = input.nextLine();
	}
	
	public String getStudente() {
		return this.name + " " + this.surname;
	}
	
}

	