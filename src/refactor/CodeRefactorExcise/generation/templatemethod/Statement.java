package refactor.CodeRefactorExcise.generation.templatemethod;

import java.util.Enumeration;
import java.util.Vector;

public abstract class Statement {

	Vector<Rental> _rentals;

	public Statement() {
		super();
	}

	protected abstract String headerString();

	protected abstract String eachRentalString(Rental aRental);

	public String statement() {
		String result = headerString();
		Enumeration<Rental> rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			// show figures for each rental
			result += eachRentalString(each);
		}
		// add footer lines
		result += footerString();
		return result;
	}

	protected abstract String footerString();

}