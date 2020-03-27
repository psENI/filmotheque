package fr.eni.mvc.beans;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Acteurs")
@DiscriminatorValue(value = "A")
public class Acteur extends Personne {

	public Acteur() {
		super();
	}

	public Acteur(int id, String nom, String prenom) {
		super(id, nom, prenom);
	}

	public Acteur(String nom, String prenom) {
		super(nom, prenom);
	}
}
