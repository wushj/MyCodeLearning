package refactor.CodeRefactor.generation.templatemethod;

import java.util.Enumeration;
import java.util.Vector;

public class TextStatement {
	public String statement() {
		Enumeration<Rental> rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t"
					+ String.valueOf(each.getCharge()) + "\n";
		}
		// add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned "
				+ String.valueOf(getTotalFrequentRenterPoints())
				+ " frequent renter points";
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
