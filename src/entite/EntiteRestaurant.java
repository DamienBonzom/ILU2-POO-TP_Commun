package entite;

public class EntiteRestaurant extends EntiteReservable<FormulaireRestaurant> {

	private int numTable;

	public EntiteRestaurant(int num, int numTable) {
		super(num);
		this.numTable = numTable;
	}

	@Override
	public boolean compatible(FormulaireRestaurant form) {
		return form.getNombrePersonnes() > 0 && estLibre(form) && form.getNumService() > 0;
	}

	@Override
	public ReservationRestaurant reserver(FormulaireRestaurant form) {
		if (compatible(form)) {
			return new ReservationRestaurant(form.getJour(), form.getMois(), form.getNumService(), numTable);
		} else {
			return null;
		}

	}

}
