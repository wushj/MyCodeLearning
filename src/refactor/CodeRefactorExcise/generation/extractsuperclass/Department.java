package refactor.CodeRefactorExcise.generation.extractsuperclass;

import java.util.Enumeration;
import java.util.Vector;
/**
 * 
 * @author yaoyufei
 * 1. compare with Employee, getName, getCost could be extracted to superclass
 * 2. [Extract Superclass] _name, getName
 *    here, eclipse has a bug. You may need to add "extends Party" manually.
 *    adjust constructor
 * 3. [Rename] getTotalAnnualCost to getAnnualCost
 *    [Pull up] getAnnualCost
 * 4. More better, refactor to composite design pattern. (I won't do it here)
 */
public class Department extends Party{
	public Department(String name) {
		super(name);
	}

	@Override
	public int getAnnualCost() {
		Enumeration e = getStaff();
		int result = 0;
		while (e.hasMoreElements()) {
			Employee each = (Employee) e.nextElement();
			result += each.getAnnualCost();
		}
		return result;
	}

	public int getHeadCount() {
		return _staff.size();
	}

	public Enumeration getStaff() {
		return _staff.elements();
	}

	public void addStaff(Party arg) {
		_staff.addElement(arg);
	}

	public String getName() {
		return _name;
	}

	private String _name;
	private Vector _staff = new Vector();
}
