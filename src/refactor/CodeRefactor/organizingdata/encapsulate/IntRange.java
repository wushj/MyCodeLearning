package refactor.CodeRefactor.organizingdata.encapsulate;
/**
 * 
 * @author lenovo
 * for field _low, _high.   [Encapsulate]
 */
public class IntRange {
	private int _low, _high;

	boolean includes(int arg) {
		return arg >= _low && arg <= _high;
	}

	void grow(int factor) {
		_high = _high * factor;
	}

	IntRange(int low, int high) {
		_low = low;
		_high = high;
	}
}
