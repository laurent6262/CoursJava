package fr.arras.poo;

import java.util.Observable;

public class Modele extends Observable {
	
	String valeur;

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
		System.out.println("Nouvelle valeur : "+ valeur);
		this.setChanged();
		this.notifyObservers();
	}
	

}
