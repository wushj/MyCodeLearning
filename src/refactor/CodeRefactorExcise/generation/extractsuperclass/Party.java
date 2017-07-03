package refactor.CodeRefactorExcise.generation.extractsuperclass;

public abstract class Party {
	
	protected String _name;

	public String getName() {
		return _name;
	}

	public abstract int getAnnualCost();

	public Party(String _name) {
		super();
		this._name = _name;
	}

}