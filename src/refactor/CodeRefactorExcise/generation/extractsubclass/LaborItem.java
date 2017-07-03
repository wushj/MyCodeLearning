package refactor.CodeRefactorExcise.generation.extractsubclass;

public class LaborItem extends JobItem {

	protected Employee _employee;

	public LaborItem(int unitPrice, int quantity, Employee employee) {
		super(quantity);
		_employee = employee;
	}

	@Override
	protected boolean isLabor() {
		return true;
	}

	@Override
	public int getUnitPrice() {
		return _employee.getRate();
	}

	public Employee getEmployee() {
		return _employee;
	}
	
}
