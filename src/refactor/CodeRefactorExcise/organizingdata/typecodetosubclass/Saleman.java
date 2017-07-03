package refactor.CodeRefactorExcise.organizingdata.typecodetosubclass;

public class Saleman extends Employee {

	Saleman(int type) {
		super(type);
	}

	@Override
	protected int payAmount() {
		return _monthlySalary + _commission;
	}

}
