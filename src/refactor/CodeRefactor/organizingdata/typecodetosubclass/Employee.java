package refactor.CodeRefactor.organizingdata.typecodetosubclass;
/**
 * 
 * @author lenovo
 * 1. generate subclass ENGINEER,SALESMAN,MANAGER
 * 2. [Encapsulate] field _type
 * 3. apply factory method ��create��
 * 4. [Push Down] payAmount
 * 5. if need to remove all type code, you should [Push Down] get_type()
 */
public class Employee {
	private int _type;
	private int _monthlySalary;
	private int _bonus;
	private int _commission;
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	Employee (int type) {
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
