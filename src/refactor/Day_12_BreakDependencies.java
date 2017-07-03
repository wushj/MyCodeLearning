package refactor;

/**
 * Created by wu on 2017/7/3.
 * 指对部分不满足我们要求的类和方法进行依赖分解，通过装饰器来达到我们需要的功能。
 */
public class Day_12_BreakDependencies {
    
    /*---------------------------before--------------------------*/
    // 良好的隔离，确实可以让单元测试的Mock变得非常的简单和容易。先看下面的例子，
    // 由于AnimalFeedingService直接依赖了静态类Feeder，因此当我们需要只测试
    // FoodBowlEmpty的逻辑判断走向的时候，必然会触发
    // Feeder的方法，这其实并不是我们想要的。但是又无法直接对静态类进行mock.

    public class AnimalFeedingService
    {
        private boolean foodBowlEmpty;

        public void Feed()
        {
            if (foodBowlEmpty)
                Feeder.ReplenishFood();
            // more code to feed the animal
        }
    }

    public static class Feeder
    {
        public static void ReplenishFood()
        {
            // fill up bowl
        }
    }


    /*---------------------------after---------------------------*/
    //解决的办法，就是让Service跟静态的对象解耦
    public class AnimalFeedingService1
    {
        public IFeederService feederService;

        public AnimalFeedingService1(IFeederService feederService)
        {
            this.feederService = feederService;
        }

        private boolean FoodBowlEmpty ;

        public void Feed()
        {
            if (FoodBowlEmpty)
                feederService.ReplenishFood();
            // more code to feed the animal
        }
    }

    public interface IFeederService
    {
        void ReplenishFood();
    }

    public class FeederService implements IFeederService
    {
        public void ReplenishFood()
        {
            Feeder.ReplenishFood();
        }
    }
}
