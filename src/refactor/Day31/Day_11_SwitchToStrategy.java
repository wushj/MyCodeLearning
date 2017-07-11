package refactor.Day31;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wu on 2017/7/3.
 * 用设计模式中的策略模式来替换原来的switch case和if else语句，这样可以解开耦合，同时也使维护性和系统的可扩展性大大增强。
 */
public class Day_11_SwitchToStrategy {

    /*---------------------------before--------------------------*/
    public class ClientCode {
        public int CalculateShipping() {
            ShippingInfo shippingInfo = new ShippingInfo();
            return shippingInfo.CalculateShippingAmount(State.Alaska);
        }
    }

    public enum State {
        Alaska,
        NewYork,
        Florida;
    }

    public class ShippingInfo {
        public int CalculateShippingAmount(State shipToState) {

            if (shipToState == State.Alaska) {
                return GetAlaskaShippingAmount();
            } else if (shipToState == State.NewYork) {
                return GetNewYorkShippingAmount();
            } else if (shipToState == State.Florida) {
                return GetFloridaShippingAmount();
            } else
                return 0;
        }
    }

    private int GetAlaskaShippingAmount() {
        return 15;
    }

    private int GetNewYorkShippingAmount() {
        return 10;
    }

    private int GetFloridaShippingAmount() {
        return 3;
    }

    /*---------------------------after---------------------------*/
    static class ShippingInfo1{

        //模拟一个工厂
        private static Map<State,CalculateShippingAmountStrategy> strategyFactory = new HashMap<State, CalculateShippingAmountStrategy>();

        static {
            strategyFactory.put(State.Alaska,new GetAlaskaShippingAmount());
            strategyFactory.put(State.NewYork,new GetNewYorkShippingAmount());
            strategyFactory.put(State.Florida,new GetFloridaShippingAmount());
        }

        public int CalculateShippingAmount(State shipToState) {
            return strategyFactory.get(shipToState).calc();
        }

    }

    interface CalculateShippingAmountStrategy{
        public int calc();
    }

    static class GetAlaskaShippingAmount implements CalculateShippingAmountStrategy{
        public int calc(){
            return 15;
        }

    }
    static class GetNewYorkShippingAmount implements CalculateShippingAmountStrategy{
        public int calc(){
            return 10;
        }

    }
    static  class GetFloridaShippingAmount implements CalculateShippingAmountStrategy{
        public int calc(){
            return 3;
        }

    }
}
