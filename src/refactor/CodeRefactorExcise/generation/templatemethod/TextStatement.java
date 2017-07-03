package refactor.CodeRefactorExcise.generation.templatemethod;


public class TextStatement extends Statement {
	@Override
	protected String footerString() {
		String result = "";
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned "
				+ String.valueOf(getTotalFrequentRenterPoints())
				+ " frequent renter points";
		return result;
	}

	@Override
	protected String eachRentalString(Rental aRental) {
		return "\t" + aRental.getMovie().getTitle() + "\t"
				+ String.valueOf(aRental.getCharge()) + "\n";
	}

	@Override
	protected String headerString() {
		return "Rental Record for " + getName() + "\n";
	}

	private int getTotalFrequentRenterPoints() {
		return 0;
	}

	private int getTotalCharge() {
		return 0;
	}

	private String getName() {
		return null;
	}
}
