package com.stage.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medicament {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ref; 
	private String nom;
	private long prix_unitaire;
	private long prix_public;
	private String rem;
	
	public long getRef() {
		return ref;
	}
	public void setRef(long ref) {
		this.ref = ref;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public long getPrix_unitaire() {
		return prix_unitaire;
	}
	public void setPrix_unitaire(long prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}
	public long getPrix_public() {
		return prix_public;
	}
	public void setPrix_public(long prix_public) {
		this.prix_public = prix_public;
	}
	
	public String getRem() {
		return rem;
	}
	public void setRem(String rem) {
		this.rem = rem;
	}
	@Override
	public String toString() {
		return "Medicament [ref=" + ref + ", nom=" + nom + ", prix_unitaire=" + prix_unitaire + ", prix_public="
				+ prix_public + "Remboursable ou non : "+ rem +"]";
	} 
	
	
}
