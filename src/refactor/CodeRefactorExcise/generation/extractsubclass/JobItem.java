package refactor.CodeRefactorExcise.generation.extractsubclass;
/**
 * 
 * @author yaoyufei
 * 1. look at _isLabor
 * 2. [new class] create new subclass of NoLaborItem, LaborItem, as well as its constructor
 * 3. [Introduce Factory] replace JobItem's constructor with createJobItem()
 * 	  if _isLabor, then create LoaborItem, otherwise, create NoLaborItem
 * 4. [Encapsulate] _isLabor, 
 *    [Push Down] isLabor.  
 *    remove field _isLabor
 *    [Change Method Signature] remove parameter of isLabor in JobItem's constructor
 * 5. [Push Down] getUnitPrice() and simplify in each subclass
 * 6. Because of _unitPrice used only for NoLaborItem, and _employee only for LaborItem.
 *    move "_employee = employee" to LaborItem
 *    move "_unitPrice = unitPrice" to NoLaborItem
 *    delete the two statements above in JobItem's constructor
 *    [Change Method Signature] remove parameter of _employee, _unitPrice
 *    [Push Down] _employee and get/set to LaborItem
 *    [Push Down] _unitPrice and get/set to NoLaborItem
 * 7. now, isLabor() is never needed, remove it. (Here, I'll keep it for you)  
 */
public abstract class JobItem {
	protected JobItem(int quantity) {
		_quantity = quantity;
	}
	
	public static void main(String[] args) {
		
		Employee kent = new Employee(2);
		JobItem j1 = createJobItem(1, 5, true, kent);
		System.out.println(j1.getTotalPrice());
		JobItem j2 = createJobItem(1, 5, false, kent);
		System.out.println(j2.getTotalPrice());
	}
	
	public static JobItem createJobItem(int unitPrice, int quantity,
			boolean isLabor, Employee employee) {
		if (isLabor) return new LaborItem(unitPrice, quantity, employee);
		
		return new NoLaborItem(unitPrice, quantity, employee);
	}

	public int getTotalPrice() {
		return getUnitPrice() * _quantity;
	}
	
	public abstract int getUnitPrice();

	public int getQuantity() {
		return _quantity;
	}

	protected abstract boolean isLabor();

	private int _quantity;
}


