package refactor;

/**
 * Created by wu on 2017/7/3.
 * 把没有必要使用异常做判断的条件尽量改为条件判断。
 */
public class Day_18_ReplaceException {
    
    /*---------------------------before--------------------------*/
    public class Microwave
    {
        public boolean Start()
        {
            boolean foodCooked = false;
            try
            {
                //do something perhaps throw new exception
                foodCooked = true;
            }
            catch (Exception e)
            {
                foodCooked = false;
            }
            return foodCooked;
        }
    }

    /*---------------------------after---------------------------*/
    public class Microwave1
    {
        public boolean Start()
        {
            boolean foodCooked = false;
            //mock 模拟先判断是否满足某种条件，避免异常发生
            if(true){
                //do something
                foodCooked = true;
            }else {
                foodCooked = false;
            }

            return foodCooked;
        }
    }
}
