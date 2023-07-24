package com.stage.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AdherentHistorique {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String date;
	private String nomBenefic;
	private String qualiteBenefic;
	private String medecin;
	private long nConsultation;
	
	public void setId(Long id) {
		this.id = id;
	}

	public long getnConsultation() {
		return nConsultation;
	}
	
	public Long getId() {
		return id;
	}
	public void setnConsultation(long nConsultation) {
		this.nConsultation = nConsultation;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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

	public String getQualiteBenefic() {
		return qualiteBenefic;
	}

	public void setQualiteBenefic(String qualiteBenefic) {
		this.qualiteBenefic = qualiteBenefic;
	}

	@Override
	public String toString() {
		return "id: " + id + "AdherentHistorique [date=" + date + ", nomBenefic=" + nomBenefic
				+ "Qualité du Bénéficaire="+ qualiteBenefic +", medecin=" + medecin + ", nConsultation=" + nConsultation + "]";
	}
	
}
