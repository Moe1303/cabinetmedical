package miage.gestioncabinet.coreM;

import java.util.Calendar;
import java.util.List;

import miage.gestioncabinet.api.Consultation;
import miage.gestioncabinet.api.Interaction;
import miage.gestioncabinet.api.Medecin;
import miage.gestioncabinet.api.Patient;
import miage.gestioncabinet.api.Produit;
import miage.gestioncabinet.api.Traitement;

/**
 * 
 * @author Stephane Lopes
 * Représentation d'une consultation en mémoire
 *
 */
public class ConsultationM implements Consultation {

	
	/**
	 * L'identifiant par défaut
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Patient concerné par la consultation
	 */
	private Patient patient;
	
	/**
	 * Date de début de la consultation
	 */
	private Calendar debut;
	
	/**
	 * Date de fin
	 */
	
	private Calendar fin; 
	/**
	 * Compte rendu 
	 */
	private String compteRendu;
	/**
	 * Liste des traitements
	 */
	
	private List<Traitement> prescription; 
	/**
	 * Medecin réalisant la consultation
	 */
	private Medecin medecin;
	
	private List<Interaction> interactions;

	@Override
	public int compareTo(Consultation arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Retourne le patient
	 * @return Le patient
	 */
	@Override
	public Patient getPatient() {
		return this.patient;
	}

	/**
	 * Définit le patient
	 */
	@Override
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	/**
	 * Retourne le médecin
	 */
	@Override
	public Medecin getMedecin() {
		return this.medecin;
	}

	/**
	 * Définit le médecin
	 */
	@Override
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	/**
	 * Retourne la date de début de la consultation
	 */
	@Override
	public Calendar getDebut() {
		return this.debut;
	}

	/**
	 * Définit la date de début de la consultation
	 */
	@Override
	public void setDebut(Calendar date) {
		this.debut = date;
		
	}
	 
	/**
	 * Définit la date de fin de la consultation
	 */
	@Override
	public Calendar getFin() {
		// TODO Auto-generated method stub
		return this.fin;
	}
	
	/**
	 * Définit la date de fin de la consultation
	 */
	@Override
	public void setFin(Calendar date) {
	 this.fin = date;
		
	}
	/**
	 * Compte rendu de la consultation
	 */

	@Override
	public String getCompteRendu() {
		return this.compteRendu;
	}
	/**
	 * Compte rendu de la consultation
	 */

	@Override
	public void setCompteRendu(String texte) {
	 this.compteRendu = texte;
		
	}
	
	/**
	 * Liste des traitements
	 */

	@Override
	public List<Traitement> getPrescription() {
		return this.prescription;
	}

	/**
	 * Fonction d'ajout des traitements
	 */
	@Override
	public Boolean ajouterTraitement(Produit produit) {
		Traitement traitement = new TraitementM();
		traitement.setProduit(produit);
		return this.prescription.add(traitement);
	}

	@Override
	public Boolean supprimerTraitement(Traitement medicament) {
		return this.prescription.remove(medicament);
	}

	@Override
	public List<Interaction> getInteractions() {
		return this.interactions;
	}

	@Override
	public void setInteractions(List<Interaction> interactions) {
		this.interactions = interactions;
		
	}

}
