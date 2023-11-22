package entite;

public abstract class EntiteReservable<F extends Formulaire> {

	protected CalendrierAnnuel calendrier_personnel;
	private int numero;

	public EntiteReservable(int num) {
		this.calendrier_personnel = new CalendrierAnnuel();
		this.numero = num;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int num) {
		numero = num;
	}

	public boolean estLibre(Formulaire form) {
		return calendrier_personnel.estLibre(form.getJour(), form.getMois());
	}

	public abstract boolean compatible(F form);

	public abstract Reservation reserver(F form);

}
