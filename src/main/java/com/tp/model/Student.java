package com.tp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="STUDENT")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(name="student_name",nullable = false)
@NotBlank
private String nom;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}

}
