package entite;

public class Restaurant {

	private CentraleReservation<EntiteRestaurant, FormulaireRestaurant> centrale;

	public Restaurant() {
		// this.centrale = new CentraleReservation(EntiteRestaurant[] entites);
	}

	public void ajouterTable(int nbrChaise) {
		/*
		 * Table table = new Table(num, nbrChaise); centrale.ajouterEntite(table);
		 */
	}

	public int[] donnerPossibilites(FormulaireRestaurant form) {
		return centrale.donnerPossibilites(form);
	}

	public Reservation reserver(int numEntite, FormulaireRestaurant form) {
		return centrale.reserver(numEntite, form);
	}

	private static class Table extends EntiteReservable<FormulaireRestaurant> {

		private CalendrierAnnuel calendrierDeuxiemeService;
		private int nbrChaises;

		private Table(int num, int nombreChaises) {
			super(num);
			this.nbrChaises = nombreChaises;
		}

		@Override
		public boolean compatible(FormulaireRestaurant form) {
			boolean partie1 = form.getNombrePersonnes() == nbrChaises || form.getNombrePersonnes() == nbrChaises - 1;
			if (form.getNumService() == 1) {
				return partie1 && estLibre(form);
			} else {
				return partie1 && calendrierDeuxiemeService.estLibre(form.getJour(), form.getMois());
			}

		}

		@Override
		public ReservationRestaurant reserver(FormulaireRestaurant form) {
			if (compatible(form)) {
				if (form.getNumService() == 1) {
					calendrier_personnel.reserver(form.getJour(), form.getMois());
				} else {
					calendrierDeuxiemeService.reserver(form.getJour(), form.getMois());
				}

				return new ReservationRestaurant(form.getJour(), form.getMois(), form.getNumService(), getNumero());
			} else {
				return null;
			}
		}

	}

}
