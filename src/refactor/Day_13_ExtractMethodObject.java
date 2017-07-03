package refactor;

import java.util.List;

/**
 * Created by wu on 2017/7/3.
 * 这并不是一种很常见的重构手段，即当我们对象中定义了很多变量，
 * 及其需要利用这些变量进行一些业务操作的时候，可以考虑将方法提
 * 取到一个新的类中，这样就解耦了变量与逻辑操作的直接关联。也比
 * 较符合单一责任原则。
 */
public class Day_13_ExtractMethodObject {
    
    /*---------------------------before--------------------------*/
    public class OrderLineItem{
        public int price;
    }

    public class Order{

        private List<OrderLineItem> orderLineItems;
        private List<Integer> discounts;
        private int Tax ;

        public int Calculate(){
            int subTotal = 0;

            // Total up line items
            for (OrderLineItem lineItem : orderLineItems){
                subTotal += lineItem.price;
            }

            // Subtract Discounts
            for (int discount : discounts)
                subTotal -= discount;

            // Calculate Tax
            int tax = subTotal * Tax;

            // Calculate GrandTotal
            int grandTotal = subTotal + tax;

            return grandTotal;
        }
    }
    // 咋看，代码并没有什么大的问题，order中定义了很多关于自身的属性，
    // 还有对属性的一些业务操作，但是，计算价格，其实并不是order对象本身应该关系的。
    // 因此，需要引入一个计算order price能力的类

    /*---------------------------after---------------------------*/
    public class Order1
    {
        private List<OrderLineItem> OrderLineItems ;
        private List<Integer> Discounts;
        private int Tax ;

        public int Calculate(){
            return new OrderCalculator(this).Calculate();
        }
    }



    public  class OrderCalculator{
        private Order1 order;
        private List<OrderLineItem> orderLineItems;
        private List<Integer> discounts;
        private int Tax ;

        public OrderCalculator(Order1 order){
            this.order=order;
        }

        public int Calculate()
        {
            int subTotal = 0;
            // Total up line items
            for (OrderLineItem lineItem : orderLineItems){
                subTotal += lineItem.price;
            }
            // Subtract Discounts
            for (int discount : discounts)
                subTotal -= discount;
            // Calculate Tax
            int tax = subTotal * Tax;
            // Calculate GrandTotal
            int grandTotal = subTotal + tax;
            return grandTotal;
        }

    }
}
