package entite;

public abstract class Formulaire {

	private int jour;
	private int mois;
	private int numeroEntite;

	public Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}

	public void setIdentificationEntite(int numId) {
		this.numeroEntite = numId;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	public int getIdentificationEntite() {
		return numeroEntite;
	}

}
