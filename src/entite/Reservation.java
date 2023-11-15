package entite;

public abstract class Reservation {

	private int mois;
	private int jour;

	public Reservation(int jour, int mois) {
		this.mois = mois;
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public int getJour() {
		return jour;
	}

}
