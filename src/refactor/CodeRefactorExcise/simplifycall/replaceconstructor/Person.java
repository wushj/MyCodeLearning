package refactor.CodeRefactorExcise.simplifycall.replaceconstructor;
/**
 * 
 * @author lenovo
 * [Introduce Factory]
 */
public class Person {
	public static Person createPerson() {
		return new Person();
	}
	boolean _ismale;
	private Person() {
		_ismale = true;
	}
}
