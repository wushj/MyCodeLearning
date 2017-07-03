package refactor.CodeRefactorExcise.organizingdata.typecodetosubclass;

public class Engineer extends Employee{

	Engineer(int type) {
		super(type);
	}

	@Override
	protected int payAmount() {
		return _monthlySalary;
	}

}
