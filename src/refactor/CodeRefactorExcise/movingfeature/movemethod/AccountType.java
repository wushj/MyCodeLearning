package refactor.CodeRefactorExcise.movingfeature.movemethod;

class AccountType {
	public boolean isPremium() {
		return false;
	}
	public double get_interestRate() {
		return _interestRate;
	}

	double interestForAmount_days(double amount, int days) {
		return get_interestRate() * amount * days / 365;
	}

	double overdraftCharge(int daysOverdrawn) {
		if (isPremium()) {
			double result = 10;
			if (daysOverdrawn > 7)
				result += (daysOverdrawn - 7) * 0.85;
			return result;
		} else
			return daysOverdrawn * 1.75;
	}

	private double _interestRate;
}