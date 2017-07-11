package refactor.CodeRefactorExcise.generation.extractinterface;
//Truck.java……
public class Truck {
    public String go() {
        if(engineStarted)
            return "Rumble";
        else
            return "...";
    }
    public void startEngine() {
        engineStarted = true;
    }
    public void stopEngine() {
        engineStarted = false;
    }
    public void loadCargo() {
        //load Cargo
    }
   
    private boolean engineStarted;
}