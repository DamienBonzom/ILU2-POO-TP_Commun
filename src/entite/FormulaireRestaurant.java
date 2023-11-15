package entite;

public class FormulaireRestaurant extends Formulaire {

	private int num_service;
	private int nombre_personnes;

	public FormulaireRestaurant(int jour, int mois, int nbr_pers, int num_service) {
		super(jour, mois);
		this.num_service = num_service;
		this.nombre_personnes = nbr_pers;
	}

	public int getNumService() {
		return num_service;
	}

	public int getNombrePersonnes() {
		return nombre_personnes;
	}

}
