package entite;

public class EntiteReservable {

	private CalendrierAnnuel calendrier_personnel;
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

	public void compatbile(Formulaire form) {

	}

}
