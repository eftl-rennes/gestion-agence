package fr.eftl.agence.voyages.prix;

public class CalculPrixBillet {
	
	private Integer prixUnitaire;
	private String classe;
	
	public Integer getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(Integer prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public Integer calculer(String depart,String arrivee, String classe) {
		CalculPrixUnitaire prixUnitaire = new CalculPrixUnitaire(depart, arrivee);
		Integer varPrixUnitaire = prixUnitaire.generer();
		switch(classe) {
		case "eco":
			return varPrixUnitaire;
		case "premiere":
			return varPrixUnitaire * 2;
		case "business":
			return varPrixUnitaire * 2 + 300;
		default:
			return varPrixUnitaire;
		}
		
		
	}
	

}
