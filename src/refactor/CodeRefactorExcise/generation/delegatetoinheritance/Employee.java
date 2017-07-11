package refactor.CodeRefactorExcise.generation.delegatetoinheritance;
/**
 * 
 * @author yaoyufei
 * 1. declare subclass Employee extends from Person
 * 2. remove all simple delegation methods, such as getName, setName
 * 3. replace all "_person." with ""
 * 4. remove field _person
 */
public class Employee extends Person {
	public String toString() {
		return "Emp: " + getLastName();
	}
}
