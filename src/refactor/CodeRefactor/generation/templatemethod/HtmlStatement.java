package refactor.CodeRefactor.generation.templatemethod;

import java.util.Enumeration;
import java.util.Vector;

public class HtmlStatement {
	public String htmlStatement() {
		Enumeration<Rental> rentals = _rentals.elements();
		String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			// show figures for each rental
			result += each.getMovie().getTitle() + ": "
					+ String.valueOf(each.getCharge()) + "<BR>\n";
		}
		// add footer lines
		result += "<P>You owe <EM>" + String.valueOf(getTotalCharge())
				+ "</EM><P>\n";
		result += "On this rental you earned <EM>"
				+ String.valueOf(getTotalFrequentRenterPoints())
				+ "</EM> frequent renter points<P>";
		return result;
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

	Vector<Rental> _rentals;
}
