package refactor.CodeRefactorExcise.generation.inheritancetodelegate;

import java.util.Vector;

/**
 * 
 * @author lenovo
 * 1. add field private Vector _vector = this;
 * 2. replace all method of Vector to _vector.xxx
 * 3. remove ��extends Vector�� and change _vector to "private Vector _vector = new Vector();"
 */
@SuppressWarnings("rawtypes")
class MyStack {
	private Vector _vector = new Vector();
	public void push(Object element) {
		_vector.insertElementAt(element, 0);
	}

	public Object pop() {
		Object result = _vector.firstElement();
		_vector.removeElementAt(0);
		return result;
	}
}