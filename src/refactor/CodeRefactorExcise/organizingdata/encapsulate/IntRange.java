package refactor.CodeRefactorExcise.organizingdata.encapsulate;
/**
 * 
 * @author lenovo
 * for field _low, _high.   [Encapsulate]
 */
public class IntRange {
	private int _low, _high;

	boolean includes(int arg) {
		return arg >= get_low() && arg <= get_high();
	}

	void grow(int factor) {
		set_high(get_high() * factor);
	}

	IntRange(int low, int high) {
		set_low(low);
		set_high(high);
	}

	private int get_low() {
		return _low;
	}

	private void set_low(int _low) {
		this._low = _low;
	}

	private int get_high() {
		return _high;
	}

	private void set_high(int _high) {
		this._high = _high;
	}
}
