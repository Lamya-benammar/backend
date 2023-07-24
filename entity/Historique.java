package com.stage.backend.entity;

//import java.math.BigDecimal;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Historique {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long nTransaction;
	private String nBordereau;
	private String contractant;
	private long matriculeAssure;
	private String nomAssure;
	private String nomBenefic;
	private String qualiteBenefic;
	private String dateTrans;
	private long nConsultation;
	private double tickMod; 
	private double restePayer;
	private String statut;
	
	public long getnTransaction() {
		return nTransaction;
	}
	public void setnTransaction(long nTransaction) {
		this.nTransaction = nTransaction;
	}
	public String getnBordereau() {
		return nBordereau;
	}
	public String setnBordereau(String nBordereau) {
		return this.nBordereau = nBordereau;
	}
	public String getContractant() {
		return contractant;
	}
	public void setContractant(String contractant) {
		this.contractant = contractant;
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
	public String getQualiteBenefic() {
		return qualiteBenefic;
	}
	public void setQualiteBenefic(String qualiteBenefic) {
		this.qualiteBenefic = qualiteBenefic;
	}
	public String getDateTrans() {
		return dateTrans;
	}
	public void setDateTrans(String dateTrans) {
		this.dateTrans = dateTrans;
	}
	public long getnConsultation() {
		return nConsultation;
	}
	public void setnConsultation(long nConsultation) {
		this.nConsultation = nConsultation;
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
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	@Override
	public String toString() {
		return "Historique [nTransaction=" + nTransaction + ", nBordereau=" + nBordereau + ", contractant="
				+ contractant + ", matriculeAssure=" + matriculeAssure + ", nomAssure=" + nomAssure + ", nomBenefic="
				+ nomBenefic + ", qualiteBenefic=" + qualiteBenefic + ", dateTrans=" + dateTrans + ", nConsultation="
				+ nConsultation + ", tickMod=" + tickMod + ", restePayer=" + restePayer + ", statut=" + statut + "]";
	}
	
}
