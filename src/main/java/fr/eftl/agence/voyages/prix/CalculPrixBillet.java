package fr.eftl.agence.voyages.prix;

public class CalculPrixBillet {
	
	private CalculPrixUnitaire calculPrixUnitaire;
	private Integer prixUnitaire;
	
	public Integer getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(Integer prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}


	public Integer calculer(String depart,String arrivee, String classe) {
		calculPrixUnitaire.setDepart(depart);
		calculPrixUnitaire.setArrivee(arrivee);	
		this.setPrixUnitaire(calculPrixUnitaire.generer());
		Integer varPrixUnitaire = this.getPrixUnitaire();
		Integer varPrixBillet=0;
		switch(classe) {
		case "eco":
			varPrixBillet= varPrixUnitaire;
			break;
		case "premiere":
			varPrixBillet=  varPrixUnitaire * 2;
			break;
		case "business":
			varPrixBillet=  varPrixUnitaire * 2 + 300;
			break;
		}
		return varPrixBillet;
		
	}

	public void setCalculPrixUnitaire(CalculPrixUnitaire calculPrixUnitaire) {
		this.calculPrixUnitaire = calculPrixUnitaire;
	}
	

}
