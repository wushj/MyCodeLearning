package refactor.CodeRefactor.simplifycall.seperatequeryfrommodify;
/**
 * 
 * @author lenovo
 * 1. [Extract Method] and so on. to decompose the method by two part, one is only query and the other is to modify
 * 2. [Inline]foundMiscreant with two methods of sendAlertToPeople, foundPerson.
 */
public class Login {
	String foundMiscreant(String[] people) {
		for (int i = 0; i < people.length; i++) {
			if (people[i].equals("Don")) {
				sendAlert();
				return "Don";
			}
			if (people[i].equals("John")) {
				sendAlert();
				return "John";
			}
		}
		return "";
	}

	private void sendAlert() {
		// TODO Auto-generated method stub
		
	}

	void checkSecurity(String[] people) {
		String found = foundMiscreant(people);
		someLaterCode(found);
	}

	private void someLaterCode(String found) {
		// TODO Auto-generated method stub
		
	}
}
