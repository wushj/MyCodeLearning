package refactor.CodeRefactor.organizingdata.typecodetoclass;
/**
 * 
 * @author lenovo
 * 1. create enum or static class BloodGroup
 * 2. relace type code, and _bloddGroup's type.
 * 3. for  "BloodGroup AB = BloodGroup.AB", [Inline].  so as to others
 * 4. to opposite, [Extract Constant] will replace  BloodGroup.AB to AB
 */
class Person {
	public static final int O = 0;
	public static final int A = 1;
	public static final int B = 2;
	public static final int AB = 3;
	private int _bloodGroup;

	public Person(int bloodGroup) {
		_bloodGroup = bloodGroup;
	}

	public void setBloodGroup(int arg) {
		_bloodGroup = arg;
	}

	public int getBloodGroup() {
		return _bloodGroup;
	}
}
