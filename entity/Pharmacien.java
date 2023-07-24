package com.stage.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pharmacien implements Serializable  {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String nom;
    private String prenom;
	private String matricule_cnam;	
    private String matricule_fiscale;
    private String telephone;
    private String portable;	
    private String adresse;
    private String idb; 
    private String password;
    private String email;
    private String discipline;
    
    
    private Boolean isActivated=false;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
    public String getDiscipline() {
		return discipline;
	}
	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}
	public String getMatricule_cnam() {
		return matricule_cnam;
	}
	public void setMatricule_cnam(String matricule_cnam) {
		this.matricule_cnam = matricule_cnam;
	}
	public String getMatricule_fiscale() {
		return matricule_fiscale;
	}
	public void setMatricule_fiscale(String matricule_fiscale) {
		this.matricule_fiscale = matricule_fiscale;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getPortable() {
		return portable;
	}
	public void setPortable(String portable) {
		this.portable = portable;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Boolean getIsActivated() {
		return isActivated;
	}
	public void setIsActivated(Boolean isActivated) {
		this.isActivated = isActivated;
	}
	public String getIdb() {
		return idb;
	}
	public void setIdb(String idb) {
		this.idb = idb;
	}
	@Override
	public String toString() {
		return "Pharmacien [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", matricule_cnam=" + matricule_cnam
				+ ", matricule_fiscale=" + matricule_fiscale + ", telephone=" + telephone + ", portable=" + portable
				+ ", adresse=" + adresse + ", idb=" + idb + ", password=" + password + ", email=" + email
				+ ", discipline=" + discipline + ", isActivated=" + isActivated + "]";
	}
	
}
