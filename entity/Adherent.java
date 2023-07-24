package com.stage.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Adherent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String name;
	private String sexe;
	private String dateNaissance;
	private String gouvernorat;
	private String pays;
	private long cin;
	private String plafond;

	
	@JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Contractant contractant;

    // Constructors, getters, and setters
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contractant getContractant() {
		return contractant;
	}

	public void setContractant(Contractant contractant) {
		this.contractant = contractant;
	}
	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getGouvernorat() {
		return gouvernorat;
	}

	public void setGouvernorat(String gouvernorat) {
		this.gouvernorat = gouvernorat;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public long getCin() {
		return cin;
	}

	public void setCin(long cin) {
		this.cin = cin;
	}

	public String getPlafond() {
		return plafond;
	}

	public void setPlafond(String plafond) {
		this.plafond = plafond;
	}

	
	@Override
	public String toString() {
		return "Adherent [id=" + id + ", name=" + name + ", sexe=" + sexe + ", dateNaissance=" + dateNaissance
				+ ", gouvernorat=" + gouvernorat + ", pays=" + pays + ", cin=" + cin + ", plafond=" + plafond
				+ "]";
	}

}
