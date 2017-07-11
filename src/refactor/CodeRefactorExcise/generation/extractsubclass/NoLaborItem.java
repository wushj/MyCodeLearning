package refactor.CodeRefactorExcise.generation.extractsubclass;

public class NoLaborItem extends JobItem {

	protected int _unitPrice;

	public NoLaborItem(int unitPrice, int quantity, Employee employee) {
		super(quantity);
		_unitPrice = unitPrice;
	}

	@Override
	protected boolean isLabor() {
		return false;
	}

	@Override
	public int getUnitPrice() {
		return _unitPrice;
	}

}
