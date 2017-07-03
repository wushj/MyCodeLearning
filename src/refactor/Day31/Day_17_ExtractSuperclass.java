package refactor.Day31;

import java.util.Date;

/**
 * Created by wu on 2017/7/3.
 * 指类中有一些字段或方法，你想把它们提取到父类中以便同一继承层次的其它类也可以访问他们，这个和之前的很多重构有异曲同工之处。
 */
public class Day_17_ExtractSuperclass {
    
    /*---------------------------before--------------------------*/
    public class Dog
    {
        public void EatFood()
        {
            // eat some food
        }

        public void Groom()
        {
            // perform grooming
        }
    }

    /*---------------------------after---------------------------*/
    public class Animal
    {
        public void EatFood()
        {
            // eat some food
        }

        public void Groom()
        {
            // perform grooming
        }
    }

    public class Dog1 extends Animal
    {
    }
}
