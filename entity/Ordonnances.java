package com.stage.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ordonnances {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long nTransaction;
	private long matriculeAssure;
	private String nomAssure;
	private String nomBenefic;
	private String medecin;
	private long nConsultation;
	private String dateTransaction;
	private double tickMod; 
	private double restePayer;
	
	public long getnTransaction() {
		return nTransaction;
	}
	public void setnTransaction(long nTransaction) {
		this.nTransaction = nTransaction;
	}
	public long getMatriculeAssure() {
		return matriculeAssure;
	}
	public void setMatriculeAssure(long matriculeAssure) {
		this.matriculeAssure = matriculeAssure;
	}
	public String getNomAssure() {
		return nomAssure;
	}
	public void setNomAssure(String nomAssure) {
		this.nomAssure = nomAssure;
	}
	public String getNomBenefic() {
		return nomBenefic;
	}
	public void setNomBenefic(String nomBenefic) {
		this.nomBenefic = nomBenefic;
	}
	public String getMedecin() {
		return medecin;
	}
	public void setMedecin(String medecin) {
		this.medecin = medecin;
	}
	public long getnConsultation() {
		return nConsultation;
	}
	public void setnConsultation(long nConsultation) {
		this.nConsultation = nConsultation;
	}
	public String getDateTransaction() {
		return dateTransaction;
	}
	public void setDateTransaction(String dateTransaction) {
		this.dateTransaction = dateTransaction;
	}
	public double getTickMod() {
		return tickMod;
	}
	public void setTickMod(double tickMod) {
		this.tickMod = tickMod;
	}
	public double getRestePayer() {
		return restePayer;
	}
	public void setRestePayer(double restePayer) {
		this.restePayer = restePayer;
	}
	@Override
	public String toString() {
		return "Ordonnances [nTransaction=" + nTransaction + ", matriculeAssure=" + matriculeAssure + ", nomAssure="
				+ nomAssure + ", nomBenefic=" + nomBenefic + ", medecin=" + medecin + ", nConsultation=" + nConsultation
				+ ", dateTransaction=" + dateTransaction + ", tickMod=" + tickMod + ", restePayer=" + restePayer + "]";
	}
	
	
}

