package refactor.CodeRefactorExcise.generation.templatemethod;

/**
 * 
 * @author yaoyufei
 * 1. [extract method] headerString()
 * 2. [Extract method] eachRentalString()
 * 3. [Extract method] footerString()
 * 4. [Extract superclass] or [Pull up] 
 */
public class HtmlStatement extends Statement {
	@Override
	protected String footerString() {
		String result = "";
		result += "<P>You owe <EM>" + String.valueOf(getTotalCharge())
				+ "</EM><P>\n";
		result += "On this rental you earned <EM>"
				+ String.valueOf(getTotalFrequentRenterPoints())
				+ "</EM> frequent renter points<P>";
		return result;
	}

	@Override
	protected String eachRentalString(Rental aRental) {
		return aRental.getMovie().getTitle() + ": "
				+ String.valueOf(aRental.getCharge()) + "<BR>\n";
	}

	@Override
	protected String headerString() {
		return "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
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
