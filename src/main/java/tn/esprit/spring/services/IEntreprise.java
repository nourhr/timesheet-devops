package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.User;

public interface IEntreprise {
	List<Entreprise> retrieveAllEntreprises(); 
	Entreprise addEntreprise(Entreprise ent);
	void deleteEntreprise(Long id);
	Entreprise updateEntreprise(Entreprise ent);
	Entreprise retrieveEntreprise(long id);

}
