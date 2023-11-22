package entite;

public class CentraleReservation<E extends EntiteReservable<F>, F extends Formulaire> {

	private E[] entites;
	private int nombreEntites;

	public CentraleReservation(E[] tabEntite) {
		entites = tabEntite;
		nombreEntites = 0;
	}

	public int ajouterEntite(E entite) {
		entites[nombreEntites] = entite;
		nombreEntites += 1;
		entite.setNumero(nombreEntites);
		return entite.getNumero();
	}

	public int[] donnerPossibilites(F form) {
		int[] possibilites = new int[nombreEntites];
		for (int i = 0; i < nombreEntites; i++) {
			if (entites[i].compatible(form)) {
				possibilites[i] = entites[i].getNumero();
			} else {
				possibilites[i] = 0;
			}
		}
		return possibilites;
	}

	public Reservation reserver(int numEntite, F form) {
		E entite = entites[numEntite];
		form.setIdentificationEntite(numEntite);
		return entite.reserver(form);
	}

}
