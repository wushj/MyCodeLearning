package refactor.CodeRefactorExcise.organizingdata.typecodetostate;
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
	int _monthlySalary;
	int _commission;
	EmployeeType _type;
	int _bonus;

	Employee(int type) {
		set_type(type);
	}

	private void set_type(int _type) {
		this._type = EmployeeType.newType(_type);
	}
}
