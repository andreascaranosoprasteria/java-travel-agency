package com.soprasteria.travel;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Vacanza {
	private String destinazione;
	private LocalDate dataInizio;
	private LocalDate dataFine;
	private LocalDate dataOdierna = LocalDate.now();
	
	private final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	/*
	 * Quando viene creata una nuova Vacanza vanno effettuati dei controlli: 
	 * -destinazione, data inizio e data fine non possono essere null 
	 * 
	 * Aggiungere una classe Agenzia
	 * dove chiediamo all’operatore se vuole inserire una nuova vacanza o uscire. 
	 * Se vuole  proseguire con l’inserimento va chiesta la destinazione, il giorno, mese e
	 * anno di partenza e il giorno, mese anno di ritorno. Con questi dati va
	 * generata una nuova vacanza e in console verrà stampato un messaggio del tipo:
	 * “Hai prenotato una vacanza di [numero di giorni] giorni a [destinazione] dal
	 * [data inizio formattata] al [data fine formattata]”. Se la creazione della
	 * vacanza genera un errore, il programma non deve interrompersi ma va gestito
	 * con dei messaggi di errore che permettono all’utente di capire cosa è andato
	 * storto e di ripetere l’inserimento.
	 */
	public Vacanza(String destinazione, LocalDate dataInizio, LocalDate dataFine) {
		this.destinazione = destinazione;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
	}
	
	//CONFRONTO DATA
	
	public boolean checkDataInizio() {
		if(ChronoUnit.DAYS.between(dataInizio, dataFine) <= 0)return true;
		else return false;
	}
	
	//VALIDA DATA
	
	public void confronta() {
		if(dataInizio.isAfter(dataFine))throw new DateTimeException("DATA NON VALIDA");
	}
	
	//CONTA I GIORNI
	
	public int contaGiorni() {
		return (int)ChronoUnit.DAYS.between(dataInizio, dataFine);
	}
	
	//
	
	private boolean checkNull() {
		return true;
	}
	/**
	 * @return the destinazione
	 */
	public String getDestinazione() {
		return destinazione;
	}
	/**
	 * @param destinazione the destinazione to set
	 */
	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}
	/**
	 * @return the dataInizio
	 */
	public LocalDate getDataInizio() {
		return dataInizio;
	}
	/**
	 * @param dataInizio the dataInizio to set
	 */
	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}
	/**
	 * @return the dataFine
	 */
	public LocalDate getDataFine() {
		return dataFine;
	}
	/**
	 * @param dataFine the dataFine to set
	 */
	public void setDataFine(LocalDate dataFine) {
		this.dataFine = dataFine;
	}

}
