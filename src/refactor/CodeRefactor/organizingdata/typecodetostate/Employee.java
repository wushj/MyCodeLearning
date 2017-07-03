package refactor.CodeRefactor.organizingdata.typecodetostate;
/**
 * 
 * @author lenovo
 * 1. create class EmployeeType, Engineer, Saleman, Manager
 * 2. [Encapsulate] field _type, and add method get_type, newType in EmployeeType, as well as its subclass
 * 3. [Inline] to replace ENGINEER to EmployeeType.ENGINEER
 * 4. "private int _type" --> "private EmployeeType _type;"
 * 5. [Inline] get_type
 * 5. [Move method] payAmount
 * 6. [Push Down] payAmount
 * 7. If neccessay, move field
 */
public class Employee {
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	private int _monthlySalary;
	private int _commission;
	private int _type;
	private int _bonus;

	Employee(int type) {
		_type = type;
	}

	int payAmount() {
		switch (_type) {
		case ENGINEER:
			return _monthlySalary;
		case SALESMAN:
			return _monthlySalary + _commission;
		case MANAGER:
			return _monthlySalary + _bonus;
		default:
			throw new RuntimeException("Incorrect Employee");
		}
	}
}
