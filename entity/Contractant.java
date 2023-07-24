package com.stage.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Contractant {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Police;
	private String nom;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public long getPolice() {
		return Police;
	}
	public void setPolice(int police) {
		Police = police;
	}
	
	@Override
	public String toString() {
		return "Contractant [nom=" + nom + ", Police=" + Police + "]";
	}
	
}