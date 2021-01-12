package com.tp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="USER")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length=50, nullable=false)
	private String nom;
	//@Column(unique=true, nullable=false)
	@Email
	@NotNull
	@Column(unique=true)
	private String email;
	//@Column(nullable=false, unique=false )
	@NotNull
	private String mdp;
	
	
	
	public User() {
	}


	public User(Long id, String nom, String email, String mdp) {
		super();
		this.id = id;
		this.nom = nom;
		this.email = email;
		this.mdp = mdp;
	}
	
	
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
		return email;
	}
	public void setPrenom(String prenom) {
		this.email = prenom;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ", email=" + email + ", mdp=" + mdp + "]";
	}
}
