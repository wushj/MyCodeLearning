package refactor.CodeRefactorExcise.generation.extractsuperclass;

public class Employee extends Party {
	public Employee(String name, String id, int annualCost) {
		super(name);
		_id = id;
		_annualCost = annualCost;
	}

	public int getAnnualCost() {
		return _annualCost;
	}

	public String getId() {
		return _id;
	}

	private int _annualCost;
	private String _id;

}
