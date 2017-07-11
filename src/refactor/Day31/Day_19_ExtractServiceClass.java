package refactor.Day31;

/**
 * Created by wu on 2017/7/3.
 * 如果要创建的对象很多，则代码会变的很复杂。一种很好的方法就是提取工厂类。
 */
public class Day_19_ExtractServiceClass {
    
    /*---------------------------before--------------------------*/
    public class PoliceCarController
    {
        public PoliceCar New(int mileage, boolean serviceRequired)
        {
            PoliceCar policeCar = new PoliceCar();
            policeCar.ServiceRequired = serviceRequired;
            policeCar.Mileage = mileage;

            return policeCar;
        }
    }

    class PoliceCar{

        public boolean ServiceRequired;
        public int Mileage;
    }

    /*---------------------------after---------------------------*/
    public interface IPoliceCarFactory
    {
        PoliceCar create(int mileage, boolean serviceRequired);
    }

    public class PoliceCarFactory implements IPoliceCarFactory
    {
        public PoliceCar create(int mileage, boolean serviceRequired)
        {
            PoliceCar policeCar = new PoliceCar();
            policeCar.ServiceRequired = serviceRequired;
            policeCar.Mileage = mileage;
            return policeCar;
        }
    }

    public class PoliceCarController1
    {
        public IPoliceCarFactory policeCarFactory;

        public PoliceCarController1(IPoliceCarFactory policeCarFactory)
        {
            this.policeCarFactory = policeCarFactory;
        }

        public PoliceCar New(int mileage, boolean serviceRequired)
        {
            return policeCarFactory.create(mileage, serviceRequired);
        }
    }
}
