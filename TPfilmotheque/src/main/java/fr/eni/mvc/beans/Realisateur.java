package fr.eni.mvc.beans;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Realisateurs")
@DiscriminatorValue(value = "R")
public class Realisateur extends Personne {

	public Realisateur() {
		super();
	}

	public Realisateur(int id, String nom, String prenom) {
		super(id, nom, prenom);
	}

	public Realisateur(String nom, String prenom) {
		super(nom, prenom);
	}

}
