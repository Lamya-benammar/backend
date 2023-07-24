package com.stage.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bordereau {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long numFacture;
	private String ref;
	private String date;
	private long nbrPrestations;
	private double montant;
	private String statut;
	
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public long getNbrPrestations() {
		return nbrPrestations;
	}
	public void setNbrPrestations(long nbrPrestations) {
		this.nbrPrestations = nbrPrestations;
	}
	public long getNumFacture() {
		return numFacture;
	}
	public void setNumFacture(long numFacture) {
		this.numFacture = numFacture;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(long montant) {
		this.montant = montant;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	@Override
	public String toString() {
		return "Bordereau [ref=" + ref + ", date=" + date + ", nbrPrestations=" + nbrPrestations + ", numFacture="
				+ numFacture + ", montant=" + montant + ", statut=" + statut + "]";
	}
	
	
}
