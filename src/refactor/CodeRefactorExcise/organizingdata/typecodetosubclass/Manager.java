package refactor.CodeRefactorExcise.organizingdata.typecodetosubclass;

public class Manager extends Employee {

	Manager(int type) {
		super(type);
	}

	@Override
	protected int payAmount() {
		return _monthlySalary + _bonus;
	}

}
