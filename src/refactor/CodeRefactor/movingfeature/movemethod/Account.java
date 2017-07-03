package refactor.CodeRefactor.movingfeature.movemethod;
/**
 * 
 * @author lenovo
 * move field:
 *  1. for field _interestRate,  [Encapsulate Field]
 *  2. copy "private double _interestRate;" and " get/set _interestRate" into class AccountType
 *  3. rewrite get/set _interestRate to delegate to class AccountType
 *  4. for get/set _interestRate, [Inline]
 *  5. remove field _interestRate
 * 
 * move method:
 *  1. for method interestForAmount_days(),  [Move method]
 *  2. for method overdraftCharge(), for field _daysOverdrawn, [Extract local Variable] 
 *  3. for field _daysOverdrawn in method overdraftCharge(),  [Introduce Parameters]
 *  4. delete "final int daysOverdrawn = daysOverdrawn;" then [Move method]
 */
public class Account {
	double overdraftCharge() {
		if (_type.isPremium()) {
			double result = 10;
			if (_daysOverdrawn > 7)
				result += (_daysOverdrawn - 7) * 0.85;
			return result;
		} else
			return _daysOverdrawn * 1.75;
	}

	double bankCharge() {
		double result = 4.5;
		if (_daysOverdrawn > 0)
			result += overdraftCharge();
		return result;
	}

	double interestForAmount_days(double amount, int days) {
		return _interestRate * amount * days / 365;
	}

	private double _interestRate;
	private AccountType _type;
	private int _daysOverdrawn;
}

class AccountType {
	public boolean isPremium() {
		return false;
	}

}