package refactor.CodeRefactorExcise.organizingdata.typecodetoclass;
/**
 * 
 * @author lenovo
 * 1. create enum or static class BloodGroup
 * 2. relace type code, and _bloddGroup's type.
 * 3. for  "BloodGroup AB = BloodGroup.AB", [Inline].  so as to others
 * 4. to opposite, [Extract Constant] will replace  BloodGroup.AB to AB
 */
class Person {
	private BloodGroup _bloodGroup;

	public Person(int bloodGroup) {
		setBloodGroup(bloodGroup);
	}

	public void setBloodGroup(int arg) {
		_bloodGroup = BloodGroup.valueOf(arg);
	}

	public int getBloodGroup() {
		return _bloodGroup.getType();
	}
	
	public boolean isAB() {
		return _bloodGroup == BloodGroup.AB;
	}
	private enum BloodGroup {
		O(1), A(1), B(2), AB(3);
		
		int _type;

		private BloodGroup(int _type) {
			this._type = _type;
		}
		public static BloodGroup valueOf(int type) {
			switch(type)
			{
				case 0:
					return O;
				case 1:
					return A;
				case 2:
					return B;
				case 3:
					return AB;
				default:
					//throw new Exception();
					return O;
				
			}
		}
		public int getType() {
			return _type;
		}
		
	}
}
