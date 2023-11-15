package entite;

public class ReservationRestaurant extends Reservation {

	private int numeroService;
	private int numeroTable;

	public ReservationRestaurant(int jour, int mois, int numServ, int numTable) {
		super(jour, mois);
		this.numeroService = numServ;
		this.numeroTable = numTable;
	}

	@Override
	public String toString() {
		StringBuilder message = new StringBuilder();
		String service;
		if (numeroService == 1) {
			service = "premier";
		} else {
			service = "deuxième";
		}
		message.append(
				String.format("Le %d/%d\nTable %d pour le %s service.", getJour(), getMois(), numeroTable, service));
		return message.toString();
	}

}
