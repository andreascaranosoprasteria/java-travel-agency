package com.soprasteria.travel;

import java.time.LocalDate;
import java.util.Scanner;

public class Agenzia {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String risposta;
		int giornoInizio;
		int meseInizio;
		int annoInizio;
		int giornoFine;
		int meseFine;
		int annoFine;
		Vacanza oggetto;

		do {
			System.out.println("INSERISCI DESTINAZIONE VACANZA");
			risposta = sc.nextLine();
			System.out.println("GIORNO PARTENZA");
			giornoInizio = Integer.parseInt(sc.nextLine());
			System.out.println("MESE PARTENZA");
			meseInizio = Integer.parseInt(sc.nextLine());
			System.out.println("ANNO PARTENZA");
			annoInizio = Integer.parseInt(sc.nextLine());
			System.out.println("----------------------\n GIORNO RITORNO");
			giornoFine = Integer.parseInt(sc.nextLine());
			System.out.println("MESE RITORNO");
			meseFine = Integer.parseInt(sc.nextLine());
			System.out.println("ANNO RITORNO");
			annoFine = Integer.parseInt(sc.nextLine());

			try {
				oggetto = new Vacanza(risposta, LocalDate.of(annoInizio, meseInizio, giornoInizio),
						LocalDate.of(annoFine, meseFine, giornoFine));
				oggetto.confronta();
				if (risposta.equals(null) || oggetto.getDataInizio() == null || oggetto.checkDataInizio())
					System.out.println("ERRORE");
				else {
					System.out.println("GIORNI VACANZA: " + oggetto.contaGiorni());
				}

			} catch (Exception e) {
				// ...
			}

			System.out.println("[EXIT] PER USCIRE");
			risposta = sc.nextLine();

		} while (risposta.equals("EXIT"));
	}
}
