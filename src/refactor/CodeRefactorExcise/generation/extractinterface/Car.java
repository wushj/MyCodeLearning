package refactor.CodeRefactorExcise.generation.extractinterface;

//Car.java……
public class Car {
    public String go() {
        if(engineStarted)
            return "Vroom";
        else
            return "...";
    }
    public void startEngine() {
        engineStarted = true;
    }
    public void stopEngine() {
        engineStarted = false;
    }
    private boolean engineStarted;
}