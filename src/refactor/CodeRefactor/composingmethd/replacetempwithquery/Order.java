package refactor.CodeRefactor.composingmethd.replacetempwithquery;
/**
 * 
 * @author lenovo
 * 1. for basePrice,  [Extract Method] + [Inline] --> basePrice->basePrice()
 * 2. for discountFactor, [Extract Method] + [Inline] --> discountFactor->discountFactor()
 */
public class Order {
	private int _quantity;
	private int _itemPrice;

	double getPrice() {
		int basePrice = _quantity * _itemPrice;
		double discountFactor;
		if (basePrice > 1000)
			discountFactor = 0.95;
		else
			discountFactor = 0.98;
		return basePrice * discountFactor;
	}
}
