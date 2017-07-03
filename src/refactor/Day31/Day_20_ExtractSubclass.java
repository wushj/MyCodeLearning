package refactor.Day31;

/**
 * Created by wu on 2017/7/3.
 * 把基类中的一些不是所有子类都需要访问的方法调整到子类中。
 */
public class Day_20_ExtractSubclass {
    
    /*---------------------------before--------------------------*/
    public interface Ball
    {
        public void play();

        public void size();
        //打气
        public void pumpUp();
    }

    //球，可以用来玩，也都有他们的大小，但是不是每种球，都需要打球的pumpUp
    //因此需要将pumpUp方法下移到具体子类中

    /*---------------------------after---------------------------*/
    public interface BasketBall extends Ball2{
        //打气
        public void pumpUp();
    }

    public interface Ball2
    {
        public void play();

        public void size();
    }
}
