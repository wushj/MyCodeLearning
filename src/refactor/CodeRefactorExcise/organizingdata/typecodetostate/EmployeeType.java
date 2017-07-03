package refactor.CodeRefactorExcise.organizingdata.typecodetostate;

public abstract class EmployeeType {
	protected static final int ENGINEER = 0;
	protected static final int SALESMAN = 1;
	protected static final int MANAGER = 2;
	abstract public int get_type();
	
	protected abstract int payAmount(Employee employee);

	public static EmployeeType newType(int type) {
		switch(type) {
		case ENGINEER:
			return new Engineer();
		case SALESMAN:
			return new Saleman();
		case MANAGER:
			return new Manager();
		default:
			throw new RuntimeException("Incorrect type");
		}
	}
}

class Engineer extends EmployeeType {

	@Override
	public int get_type() {
		return EmployeeType.ENGINEER;
	}

	@Override
	protected int payAmount(Employee employee) {
		return employee._monthlySalary;
	}
	
}

class Saleman extends EmployeeType {

	@Override
	public int get_type() {
		return EmployeeType.SALESMAN;
	}

	@Override
	protected int payAmount(Employee employee) {
		return employee._monthlySalary + employee._commission;
	}
	
}

class Manager extends EmployeeType {

	@Override
	public int get_type() {
		return EmployeeType.MANAGER;
	}

	@Override
	protected int payAmount(Employee employee) {
		return employee._monthlySalary + employee._bonus;
	}
	
}
