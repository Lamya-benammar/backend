package com.stage.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SugRec {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long nRec;
	
	private String nature;
	private String type;
	private String titre;
	private String Description;
	private String file;
	private String status;
	private String date;
	
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public Long getnRec() {
		return nRec;
	}
	public void setnRec(Long nRec) {
		this.nRec = nRec;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "SugRec [nRec=" + nRec + ", nature=" + nature + ", type=" + type + ", titre=" + titre + ", Description="
				+ Description + "Fichier=" + file + "status=" + status + "Date" + date+ "]";
	}
	
}
