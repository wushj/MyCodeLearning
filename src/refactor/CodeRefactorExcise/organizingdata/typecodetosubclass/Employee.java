package refactor.CodeRefactorExcise.organizingdata.typecodetosubclass;
/**
 * 
 * @author lenovo
 * 1. generate subclass ENGINEER,SALESMAN,MANAGER
 * 2. [Encapsulate] field _type
 * 3. apply factory method ��create��
 * 4. [Push Down] payAmount
 * 5. if need to remove all type code, you should [Push Down] get_type()
 */
public abstract class Employee {
	protected int _type;
	protected int _monthlySalary;
	protected int _bonus;
	protected int _commission;
	protected static final int ENGINEER = 0;
	protected static final int SALESMAN = 1;
	protected static final int MANAGER = 2;
	Employee (int type) {
		set_type(type);
	}
	
	protected abstract int payAmount();

	static Employee create(int type) {
		switch (type) {
		case ENGINEER:
			return new Engineer(type);
		case SALESMAN:
			return new Saleman(type);
		case MANAGER:
			return new Manager(type);
		default:
			throw new RuntimeException("Incorrect Employee");
		}	
	}
		
	private void set_type(int _type) {
		this._type = _type;
	}

	protected int get_type() {
		return _type;
	}
	
}
